# SQW-TEMPLATE: Service Queue Worker Template

I feel that `service queue worker` is one of the common SOA design. 
This is just a scalable template created with spring-boot-starter with 4 distinct modules.

### Features
- All for 4 modules can be easily abstracted out to use managed service.
- Clone & Run
- Docker build
- Monolithic or Containerized
- Postgres JPA
- 

## Core
Core is implemented by all module. 
This should be where all your core `@Bean` and data `Model` are at for sharing across module.

## Queue
Queue is just where the JMS configuration is held.
The Configuration is an abstract config to allow you to offload the queue to any JMS compliant service.

##### You can replace this with hosted RabbitMQ, ActiveMQ, Amazon SQS or Amazon MQ.


## Service
Service is just REST Application/Microservice. 
I find that exposing REST is more dynamic for prototyping than directly calling the mq.

##### You can replace this with Serverless Function, AWS API Gateway or just call the MQ. This module generate a docker image.


## Worker
Worker is just a daemon service to process the message in active mq.

##### You can replace this with AWS Lambda or just run it standalone. This module generate a docker image.

## Core
Finally the root module `sqw-template` itself is a docker image that can be run as a monolithic app. 
You don't need to run them separately if you don't want/need to.  
