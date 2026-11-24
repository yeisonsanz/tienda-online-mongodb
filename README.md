
# 🛒 E-Commerce API

Backend REST API for an e-commerce application built with **Java, Spring Boot, and MongoDB**. This project aims to implement the core functionalities of an online store while applying backend development best practices, clean architecture principles, and scalable application design.

## 🚀 About the Project

This project is a backend application for an online store, designed to manage products and support the development of e-commerce functionalities through RESTful APIs.

The main goal is to practice and implement modern backend development concepts, including separation of concerns, data persistence with MongoDB, REST API design, and maintainable code architecture.

## 🛠️ Technologies

- **Java** – Programming language
- **Spring Boot** – Backend application framework
- **Spring Web** – REST API development
- **MongoDB** – NoSQL database
- **Spring Data MongoDB** – Database integration
- **Maven** – Dependency management and build tool

## 📋 Features

- [x] Project initialization with Spring Boot
- [x] MongoDB database integration
- [ ] Product management (CRUD)
- [ ] Product search and filtering
- [ ] Category management
- [ ] Shopping cart
- [ ] Order management
- [ ] User management
- [ ] Authentication and authorization

## 🏗️ Architecture

The application follows a layered architecture to separate responsibilities and improve maintainability.

```text
src/main/java/com/ecommerce
│
├── controller      # REST endpoints
├── service        # Business logic
├── repository     # Data access layer
├── model         # MongoDB documents
├── dto           # Data Transfer Objects
└── config        # Application configuration
```

## ⚙️ Requirements

Before running the application, make sure you have installed:

- Java 21+
- Maven 3.9+
- MongoDB
- Git

## 🔧 Configuration

Configure your MongoDB connection in the `application.properties` file:

```properties
spring.application.name=ecommerce-api

spring.data.mongodb.uri=mongodb://localhost:27017/tienda_online
```

> Adjust the connection URI according to your local or remote MongoDB environment.

## ▶️ Running the Application

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/ecommerce-api.git
```

### 2. Navigate to the project directory

```bash
cd ecommerce-api
```

### 3. Run the application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## 📡 API Endpoints

Endpoints will be documented here as the application evolves.


## 🧪 Testing

Run the tests using Maven:

```bash
mvn test
```

## 📌 Roadmap

- [ ] Implement product CRUD operations
- [ ] Implement DTOs and validation
- [ ] Implement exception handling
- [ ] Add pagination and sorting
- [ ] Implement categories
- [ ] Implement shopping cart functionality
- [ ] Implement order processing
- [ ] Implement authentication with Spring Security
- [ ] Add unit and integration tests
- [ ] Containerize the application using Docker

## 👨‍💻 Author

Developed as a backend engineering project to explore and apply modern Java technologies, MongoDB, and scalable application design.

---

⭐ If you find this project interesting, feel free to explore it or contribute.
