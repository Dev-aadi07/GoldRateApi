# Gold Rate Management API

A production-style backend application built using Spring Boot to manage daily gold rates. This API allows storing, updating, and retrieving gold prices, which can be consumed by frontend applications like a Gold Calculator.

---

## 🚀 Features

* Add daily gold rates (24K and 22K)
* Fetch all stored gold rates
* Fetch gold rate by ID
* Get latest gold rate
* Update existing gold rate
* Delete gold rate
* Global exception handling with clean error responses
* DTO-based architecture (no direct entity exposure)

---

## 🏗️ Project Structure

Controller → Service → Repository → Database

```
com.example.goldrateapi
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── GoldrateapiApplication
```

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

---

## 📦 API Endpoints

| Method | Endpoint           | Description          |
| ------ | ------------------ | -------------------- |
| POST   | /gold-rates        | Create new gold rate |
| GET    | /gold-rates        | Get all gold rates   |
| GET    | /gold-rates/{id}   | Get gold rate by ID  |
| GET    | /gold-rates/latest | Get latest gold rate |
| PUT    | /gold-rates/{id}   | Update gold rate     |
| DELETE | /gold-rates/{id}   | Delete gold rate     |

---

## 📥 Sample Request

### Create Gold Rate

POST `/gold-rates`

```
{
  "date": "2026-03-17",
  "rate24k": 6200,
  "rate22k": 5700,
  "source": "Kolkata Market"
}
```

---

## 📤 Sample Response

```
{
  "id": 1,
  "date": "2026-03-17",
  "rate24k": 6200,
  "rate22k": 5700,
  "source": "Kolkata Market"
}
```

---

## ❌ Error Response Example

```
{
  "message": "Gold rate not found",
  "status": 404
}
```

---

## 🧠 Concepts Implemented

* Layered Architecture (Controller → Service → Repository)
* DTO (Data Transfer Object) pattern
* Constructor-based Dependency Injection
* Spring Data JPA (no SQL required)
* Custom query methods
* Global Exception Handling

---

## 🔗 Future Improvements

* Connect with React frontend (Gold Calculator)
* Add validation (e.g., @Valid)
* Add Swagger for API documentation
* Use MySQL/PostgreSQL instead of H2
* Add authentication (Spring Security)

---

## 👨‍💻 Author

Adarsh Kumar Jha
Institute of Engineering and Management

---
