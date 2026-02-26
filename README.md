# 📌 User & Post API

RESTful API built with **Spring Boot** and **MongoDB** to manage users, posts, and comments.

This project demonstrates backend development concepts such as layered architecture, DTO usage, exception handling, and advanced query operations.

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot 3
- Spring Data MongoDB
- MongoDB
- Maven
- Postman (for API testing)

---

## 📂 Project Features

### 👤 User
- Create user
- Get all users
- Get user by ID
- Update user
- Delete user
- Get posts from a specific user

### 📝 Post
- Create post
- Get post by ID
- Add comments to a post
- Search posts by title (Query Methods)
- Custom queries using `@Query`
- Search with multiple criteria (text and date range)

### 💬 Comments
- Embedded comments inside posts
- Author data projection using DTO

---

## 🧱 Architecture

The project follows a layered architecture:

- **Controller** → Handles HTTP requests
- **Service** → Business logic
- **Repository** → Data access layer
- **DTO** → Data transfer objects
- **Exception Handling** → Global exception handler with custom responses

---

## ⚙️ Database Configuration

Make sure MongoDB is running locally.

`application.properties` example:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
