# Pokemon RestService
### This is a Java Spring Boot application that provides REST API endpoints to interact with Pokemon data. It utilizes the PokeAPI to fetch information about different Pokemon based on their IDs and generations.
Requirements
- Java 11 or higher
- Maven
- Redis
#### or
- Docker

## Getting Started Local
#### 1.Clone the repository to your local machine.
#### 2.Make sure you have a Redis server running on the default port (6379). You can modify the Redis configuration in src/main/java/com/kadirgurturk/PoekmonRestTemplate/config/RedisConfig.java
#### 3.Build the project using Maven:
```
    mvn clean package
```
#### 4.Run this app:
```
    mvn spring-boot:run
```
#### The application will start and be accessible at localhost:8080.

## Getting Started With Docker
#### 1.Clone the repository to your local machine.
#### 2. Make sure you have Docker installed and running on your system.
#### 3.Build the Docker image:
```
    docker build -t poekmon-rest-template:latest .
```
#### 4.Start the Docker Compose stack::
```
    docker-compose up
```

### The application will start, and the services will be accessible at the following URLs:

PokemonRestTemplate Application: localhost:8085
Redis: localhost:6379
Please note that the application will be accessible at localhost:8085 instead of localhost:8080 as specified in the Docker Compose file. This is because we've mapped the container's port 8080 to the host's port 8085 in the Compose file.

## Endpoints
### Find Pokemon by ID
- URL: /api/pokemon/find/
- Method: GET
- Query Parameter: id (Long, required) - The ID of the Pokemon to fetch.
- Success Response:
- Status Code: 200 OK
- Body: JSON representation of the Pokemon data.

### Get Pokemon List by Generation
- URL: /api/pokemon/list/
- Method: GET
- Query Parameter: gen (int, required) - The generation number (1 to 5) to fetch Pokemon from.
- Success Response:
- Status Code: 200 OK
- Body: JSON representation of the list of Pokemon for the specified generation.

### Get Paged Pokemon List by Generation
- URL: /api/pokemon/
- Method: GET
- Query Parameters:
- gen (int, required) - The generation number (1 to 5) to fetch Pokemon from.
- page (int, required) - The page number for pagination.
- size (int, required) - The number of Pokemon to include in each page.
- Success Response:
- Status Code: 200 OK
- Body: JSON representation of the paged list of Pokemon for the specified generation.


## Error Handling
- 1.NotFoundExcepiton: Thrown when a requested Pokemon is not found (status code 404 Not Found).
- 2.BadRequestExcepiton: Thrown when an invalid request is made (status code 400 Bad Request).
  
##Caching
#### The application uses Redis as a caching mechanism to improve the performance of repeated API calls. Cached data is stored for a specified duration and can be customized in the RedisConfig class.













