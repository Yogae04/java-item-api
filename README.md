# Java Backend REST API – Item Management

This project is a simple Java Spring Boot backend application that implements a RESTful API
for managing a collection of items (E-commerce style).

The application uses in-memory data storage (ArrayList) and provides basic API endpoints
to add and retrieve items.

## Tech Stack
- Java
- Spring Boot
- Maven
- REST API
- Postman (for API testing)

## Features
- Add a new item
- Get an item by ID
- Input validation
- In-memory data storage using ArrayList
- RESTful API implementation

## Item Model
Each item contains the following fields:
- id (auto-generated)
- name
- description
- price

## API Endpoints

### Add Item
POST /items

Request Body:
{
  "name": "Mobile",
  "description": "Samsung",
  "price": 20000
}

Response:
{
  "id": 1,
  "name": "Mobile",
  "description": "Samsung",
  "price": 20000.0
}

### Get Item by ID
GET /items/{id}

Example:
GET /items/1

Response:
{
  "id": 1,
  "name": "Mobile",
  "description": "Samsung",
  "price": 20000.0
}

## Input Validation
- Name should not be empty
- Price should be greater than 0
- Proper error messages are returned for invalid input or item not found

## How to Run the Application Locally
1. Clone the repository
2. Open the project in Eclipse
3. Run the main Spring Boot application
4. The application will start at http://localhost:8080

## Deployment
The application is deployed on a public hosting platform.
The live API URL can be used to test the endpoints.

## Author
Yoga Eswaran
