# Axon-framework-with-CQRS

What is AXON Framework ?

AXON is built on three major concepts CQRS (Command Query Responsibility   
Segregation), Event Sourcing and DDD (Domain Driven Design).  
AXON are best suitable for Microservices Architecture. 


Event Sourcing

Event Sourcing is a method to store the data as events in append log. Event which are stored represent a change or fact in the application, which states what happened in the application. 
Event Sourcing is a perfect fit with CQRS. In CQRS, command model is not stored infect the sequence of events are stored.  
Query Model is updated continuously for containing the certain state of current model, which are based on events. 

