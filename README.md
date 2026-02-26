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

application.properties example:

spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo

---

## ▶️ Running the Project

1. Clone the repository
2. Run MongoDB locally
3. Run the application:

mvn spring-boot:run

The API will start at:

http://localhost:8080

---

## 📌 Example Endpoints

Get all users  
GET /users

Create user  
POST /users

Get posts by user  
GET /users/{id}/posts

Get post by ID  
GET /posts/{id}

Search posts with multiple criteria  
GET /posts/search?text=travel&minDate=2018-03-01&maxDate=2018-03-31

---

## 📈 What This Project Demonstrates

- RESTful API design
- MongoDB document modeling
- DTO pattern
- Embedded documents
- Custom exception handling
- Query methods
- Custom `@Query` usage
- Multiple criteria search
- Clean and organized commit history (Conventional Commits)

---

## 👨‍💻 Author

Developed by Pedro Caua  
Backend Developer | Java & Spring Boot

---

## 📄 License

This project is for educational and portfolio purposes.
