package com.mwanzias.lending.loanmanagement.clientConfigurations;

import com.mwanzias.lending.loanmanagement.client.KycDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class kycDataClientConfiguration {

    @Autowired
    private LoadBalancedExchangeFilterFunction loadBalancedExchangeFilterFunction;

    @Bean
    public WebClient KycDataClientWebClient() {
        return WebClient
                .builder()
                .baseUrl("http://kycservice")
                .filter(loadBalancedExchangeFilterFunction)
                .build(); //allows scalability because we can run serveral kyc instances and the discovery service will enable us to locate one
    }

    @Bean
    public KycDataClient kycDataClient() {
        HttpServiceProxyFactory httpServiceProxyFactory
                = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(KycDataClientWebClient()))
                .build();
        return httpServiceProxyFactory.createClient(KycDataClient.class);
    }
}
