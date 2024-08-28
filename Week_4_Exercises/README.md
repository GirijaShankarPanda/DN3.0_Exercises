# Spring REST Exercises (Part 1)

## Online Bookstore - Project Overview

This project is an Online Bookstore API developed using Spring Boot. It includes various RESTful services to manage books, authors, and customers. Below is a brief overview of each exercise covered in this project:

## Exercise 1: Setting Up RESTful Services
1. **Setup Spring Boot Project**:
   - Initialize a new Spring Boot project named `BookstoreAPI`.
2. **Add Dependencies**:
   - Include dependencies like Spring Web, Spring Boot DevTools, and Lombok.
3. **Explore New Features**:
   - Discover the new features introduced in Spring Boot 3 and document them.

## Exercise 2: Creating Basic REST Controllers
1. **Create Book Controller**:
   - Develop a `BookController` class with request mappings for `/books`.
2. **Handle HTTP Methods**:
   - Implement methods to handle GET, POST, PUT, and DELETE requests for managing books.
3. **Return JSON Responses**:
   - Ensure all endpoints return JSON responses.
   - Define the `Book` entity with attributes like `id`, `title`, `author`, `price`, and `isbn`.

## Exercise 3: Handling Path Variables and Query Parameters
1. **Path Variables**:
   - Implement an endpoint to fetch a book by its ID using a path variable.
2. **Query Parameters**:
   - Create an endpoint to filter books based on query parameters like title and author.

## Exercise 4: Processing Request Body and Form Data
1. **Request Body**:
   - Develop a POST endpoint to create a new customer by accepting a JSON request body.
2. **Form Data**:
   - Implement an endpoint to process form data for customer registrations.

## Exercise 5: Customizing Response Status and Headers
1. **Response Status**:
   - Use `@ResponseStatus` to customize HTTP status codes for the book management endpoints.
2. **Custom Headers**:
   - Add custom headers to the response using `ResponseEntity`.

## Exercise 6: Exception Handling in REST Controllers
1. **Global Exception Handler**:
   - Create a `GlobalExceptionHandler` class using `@ControllerAdvice` to manage exceptions globally.
2. **Exception Methods**:
   - Define methods to handle various exceptions and return appropriate HTTP status codes.

## Exercise 7: Introduction to Data Transfer Objects (DTOs)
1. **Create DTOs**:
   - Define `BookDTO` and `CustomerDTO` classes to transfer data between the client and server.
2. **Mapping Entities to DTOs**:
   - Use libraries like MapStruct or ModelMapper to map entities to DTOs and vice versa.
3. **Custom Serialization/Deserialization**:
   - Customize JSON serialization and deserialization using Jackson annotations.
