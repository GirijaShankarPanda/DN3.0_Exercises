# Spring Rest Exercises (Part1)
## Online Bookstore - Project Overview

This project is an Online Bookstore API developed using Spring Boot. It includes various RESTful services to manage books, authors, and customers. Below is a brief overview of each exercise covered in this project:

## Exercise 1: Setting Up RESTful Services
- **Setup Spring Boot Project**: Initialize a new Spring Boot project named `BookstoreAPI` with dependencies like Spring Web, Spring Boot DevTools, and Lombok.
- **Project Structure**: Familiarize yourself with the generated project structure.
- **New Features in Spring Boot 3**: Explore and document the new features introduced in Spring Boot 3.

## Exercise 2: Creating Basic REST Controllers
- **Create Book Controller**: Develop a `BookController` class with request mappings for `/books`.
- **Handle HTTP Methods**: Implement methods to handle GET, POST, PUT, and DELETE requests for managing books.
- **Return JSON Responses**: Ensure all endpoints return JSON responses and define the `Book` entity with attributes like `id`, `title`, `author`, `price`, and `isbn`.

## Exercise 3: Handling Path Variables and Query Parameters
- **Path Variables**: Implement an endpoint to fetch a book by its ID using a path variable.
- **Query Parameters**: Create an endpoint to filter books based on query parameters like title and author.

## Exercise 4: Processing Request Body and Form Data
- **Request Body**: Develop a POST endpoint to create a new customer by accepting a JSON request body.
- **Form Data**: Implement an endpoint to process form data for customer registrations.

## Exercise 5: Customizing Response Status and Headers
- **Response Status**: Use `@ResponseStatus` to customize HTTP status codes for the book management endpoints.
- **Custom Headers**: Add custom headers to the response using `ResponseEntity`.

## Exercise 6: Exception Handling in REST Controllers
- **Global Exception Handler**: Create a `GlobalExceptionHandler` class using `@ControllerAdvice` to manage exceptions globally.
- **Exception Methods**: Define methods to handle various exceptions and return appropriate HTTP status codes.

## Exercise 7: Introduction to Data Transfer Objects (DTOs)
- **Create DTOs**: Define `BookDTO` and `CustomerDTO` classes to transfer data between the client and server.
- **Mapping Entities to DTOs**: Use libraries like MapStruct or ModelMapper to map entities to DTOs and vice versa.
- **Custom Serialization/Deserialization**: Customize JSON serialization and deserialization using Jackson annotations.
