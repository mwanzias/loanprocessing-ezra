package com.mwanzias.lending.loanmanagement.clientConfigurations;

import com.mwanzias.lending.loanmanagement.client.LoanProductsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class LoanProductClientConfigurations {

    @Autowired
    private LoadBalancedExchangeFilterFunction loadBalancedExchangeFilterFunction;

    @Bean
    public WebClient LoanProductClientWebClient() {
        return WebClient
                .builder()
                .baseUrl("http://LOAN-PRODUCT-MGR-SERVICE")
                .filter(loadBalancedExchangeFilterFunction)
                .build(); //allows scalability because we can run serveral kyc instances and the discovery service will enable us to locate one
    }

    @Bean
    public LoanProductsClient loanProductsClient() {
        HttpServiceProxyFactory httpServiceProxyFactory
                = HttpServiceProxyFactory
                .builderFor(WebClientAdapter.create(LoanProductClientWebClient()))
                .build();
        return httpServiceProxyFactory.createClient(LoanProductsClient.class);
    }


}
