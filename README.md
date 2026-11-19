This project uses Spring Cloud OpenFeign to enable communication between the UserF Service and PostF Service.
OpenFeign is a declarative REST client that simplifies HTTP communication between microservices. 
Instead of writing REST API calls manually using RestTemplate, we can define an interface with Feign annotations.
OpenFeign provides a simple and maintainable approach for synchronous communication between microservices.
In this project, UserF Service uses OpenFeign to retrieve post details from PostF Service based on a unique User ID.

User enters a unique User ID in the UserF Service.
UserF Service invokes the PostfClient interface.
OpenFeign automatically creates an HTTP GET request.
The request is forwarded to the PostF Service.
PostF Service fetches the corresponding post details using the User ID.
The response is returned to UserF Service as a Postf object.
