# Spring Core & Maven
## Library Management Application

This project is a comprehensive guide to building a library management application using the Spring Framework and Spring Boot. It covers various essential concepts such as dependency injection, aspect-oriented programming, and RESTful web services. Below is a summary of the exercises included in the project:

## Exercise 1: Configuring a Basic Spring Application
- **Objective**: Set up a basic Spring application using Maven.
- **Steps**:
  1. Create a Maven project named `LibraryManagement`.
  2. Add Spring Core dependencies in `pom.xml`.
  3. Configure `applicationContext.xml` to define beans for `BookService` and `BookRepository`.
  4. Create service and repository classes in respective packages.
  5. Run the application to test the configuration.

## Exercise 2: Implementing Dependency Injection
- **Objective**: Manage dependencies between `BookService` and `BookRepository` using Spring's IoC and DI.
- **Steps**:
  1. Update `applicationContext.xml` to wire `BookRepository` into `BookService`.
  2. Add a setter method for `BookRepository` in `BookService`.
  3. Test the configuration by running the main class.

## Exercise 3: Implementing Logging with Spring AOP
- **Objective**: Add logging capabilities using Spring AOP.
- **Steps**:
  1. Add Spring AOP dependency in `pom.xml`.
  2. Create a `LoggingAspect` class to log method execution times.
  3. Enable AspectJ support in `applicationContext.xml`.
  4. Test the aspect by observing log messages.

## Exercise 4: Creating and Configuring a Maven Project
- **Objective**: Set up a new Maven project with necessary Spring dependencies.
- **Steps**:
  1. Create a new Maven project named `LibraryManagement`.
  2. Add dependencies for Spring Context, Spring AOP, and Spring WebMVC.
  3. Configure Maven Compiler Plugin for Java version 1.8.

## Exercise 5: Configuring the Spring IoC Container
- **Objective**: Centralize the configuration of beans and dependencies.
- **Steps**:
  1. Create `applicationContext.xml` and define beans for `BookService` and `BookRepository`.
  2. Add a setter method in `BookService` for `BookRepository`.
  3. Test the configuration by running the main class.

## Exercise 6: Configuring Beans with Annotations
- **Objective**: Simplify bean configuration using annotations.
- **Steps**:
  1. Enable component scanning in `applicationContext.xml`.
  2. Use `@Service` for `BookService` and `@Repository` for `BookRepository`.
  3. Test the annotation-based configuration.

## Exercise 7: Implementing Constructor and Setter Injection
- **Objective**: Use both constructor and setter injection for better bean control.
- **Steps**:
  1. Configure constructor injection for `BookService` in `applicationContext.xml`.
  2. Configure setter injection and ensure the setter method exists in `BookService`.
  3. Test both injection methods.

## Exercise 8: Implementing Basic AOP with Spring
- **Objective**: Implement basic AOP for logging and transaction management.
- **Steps**:
  1. Create `LoggingAspect` in the `com.library.aspect` package.
  2. Define advice methods for logging before and after method execution.
  3. Register the aspect and enable AspectJ auto-proxying in `applicationContext.xml`.
  4. Test the AOP functionality.

## Exercise 9: Creating a Spring Boot Application
- **Objective**: Simplify configuration and deployment using Spring Boot.
- **Steps**:
  1. Use Spring Initializr to create a new Spring Boot project named `LibraryManagement`.
  2. Add dependencies for Spring Web, Spring Data JPA, and H2 Database.
  3. Configure database properties in `application.properties`.
  4. Define `Book` entity and `BookRepository`.
  5. Create `BookController` to handle CRUD operations.
  6. Run the application and test the REST endpoints.
