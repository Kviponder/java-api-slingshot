# DevExercise Project- Java API

## Description
The DevExercise Project for Campus Inc. is a Spring Boot application that provides a RESTful API to manage course information. It allows users to interact with a PostgreSQL database to perform CRUD operations on course data.

## Features
- REST API to access course information.
- Integration with PostgreSQL for data persistence.
- Utilizes Spring Data JPA for ORM and repository patterns.
- Spring Boot DevTools for rapid development.

## Prerequisites
- JDK 11
- Maven 3.2+
- PostgreSQL 10 or higher

## Dependencies
- Spring Boot Starter Data JPA
- Spring Boot DevTools (Optional, for development)
- PostgreSQL JDBC Driver
- Spring Boot Starter Test (for testing)
- Jackson Annotations
- Spring Web
- Spring Boot Starter Web

## Installation

### Setting up the Database
1. Install PostgreSQL and start the PostgreSQL service.
2. Create a database named `java_dev_api`.
3. Configure the `src/main/resources/application.properties` with the database connection properties utilizing your own Database username and password.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/java_dev_api
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
```

### Building the Application
1. Clone the repository to your local machine.
2. Navigate to the root directory of the project via terminal or command prompt.
3. Run the Maven build command:

```sh
mvn clean install
```

### Running the Application
1. After a successful build, you can run the application using:

```sh
mvn spring-boot:run
```

2. The server will start on the default port 8080. You can access the API at:

```
http://localhost:8080/api/courseInfo
```

Certainly! Based on your controller's endpoints and the provided URL examples, here's how you could structure the "Usage" section of the README to reflect the functionality of your API:

## Usage
Interact with the API using tools such as Postman or cURL. Below are examples of how to use the API endpoints:

### Retrieve All Courses
To fetch a list of all courses:

```
GET http://localhost:8082/api/courseInfo/all
```

### Retrieve Courses by Prefix and/or Number
You can filter the courses based on `courseCodePrefix` and/or `courseCodeNumber`. These are optional query parameters.

- To filter by course code prefix:
```
GET http://localhost:8082/api/courseInfo?courseCodePrefix=EDU
```

- To filter by course code number:
```
GET http://localhost:8082/api/courseInfo?courseCodeNumber=270
```

- To filter by both course code prefix and number:
```
GET http://localhost:8082/api/courseInfo?courseCodePrefix=EDU&courseCodeNumber=270
```

Replace `EDU` and `270` with the actual course code prefix and number you wish to filter by.

### Add a New Course
To add a new course (excluding the `id`, as it is auto-generated):

```
POST http://localhost:8082/api/courseInfo
Content-Type: application/json

{
  "advisingRequisiteCode": "EDU270",
  "coreLiteratureRequirement": "yourValue",
  "courseCatalogText": "Description text about your course",
  ... other fields ...
}
```

Make sure to replace the placeholder values (like `"yourValue"`) with the actual course information you wish to add.

---

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)


