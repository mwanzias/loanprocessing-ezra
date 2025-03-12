The application demonstrates the following micro services for loan processing 
1. Kyc service for mnaging the kyc data for the customers 
2. loan product micro service for managing the products 
3. loan repayment service for managing repayments - which woul house the necessary jobs for communication to the notification service in
order to notify customers of any repayments that are due, 
4. Notifications service - this sends out any notifications to the customers or even internally for any of the events that 
are deemed important and configured for sending out

## Support Services

The following are support services that would be important in the scalable architecture 
1. **Micro Service Discover :** All services are configured to register with the discover service which is 
what is used by all other micro-services in order to be able to locate an instance of any of the service tha they would want to get either data or communications related to loan processing 

2. **Configuration server** : This houses all configuration for the services participating in the loan processing


## Requirements
The applications run on Spring-Boot 3+
2. A working postgres server installation running postgres 11 and above 
2. JDK 21 or above
3.  Maven
4. on your running instance of postgres create the following databases
`create database customerkyc;`
`create database loanproducts;` 
`create database loanrepayments;` 
`create database loanmnagement;`
each of the services will recreate the tables that it requires to run on first time run

# Running Services

Each of the service requires to be ran manually in the following order 

1. git clone  https://github.com/mwanzias/loanprocessing-ezra.git
2. change directory to the cloned app: `cd loanprocessing-ezra`
2. navigate to the root directory of the ``microserviceConfig-Server`` to start the configurations server `cd microserviceconfig-server && mvn spring-boot:run`  
2. navigate to the root of the microservicediscovery-service and run the service ``mvn spring-boot:run``
3. Navigate to ``cd microserviceconfig-server `` from the root of the project and then run the configurations server ``mvn spring-boot:run``
4. Navigate to each of the services directory that is **kycService** and **loanmangement** and run the services and it will register with the discovery services, The other services are  not currently in a running state.


# TODO
1. Add Service tests for each of the tests
2. Add script to auto run them will be added into the repo
2. Add Api gateway service 
3. complete inter service communication with the HttpExchange 
4. Add Jwt token management in order to protect the APIs
5. Change creation of service tables to update and not re create tables to retain data 
