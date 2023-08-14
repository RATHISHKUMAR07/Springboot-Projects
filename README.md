# Springboot-Projects

The Springboot-Projects repository showcases a collection of Java-based projects built using the Spring Boot framework. These projects demonstrate various aspects of web development, including RESTful APIs, data management, and more. Each project highlights Spring Boot's capabilities in creating efficient and modern applications.

# Student API Data Project

Welcome to the Spring Boot Student API Data project! This repository contains a Spring Boot application that serves as a RESTful API for managing student information. The application provides endpoints to perform CRUD (Create, Read, Update, Delete) operations on student records.
<img src="">

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Sample Outputs](#sample-outputs)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project aims to demonstrate the implementation of a simple Student API using Spring Boot framework. It showcases how to create, retrieve, update, and delete student records through RESTful endpoints.

## Features

- Create a new student record.
- Retrieve student information by ID.
- Retrieve a list of all students.
- Update an existing student's details.
- Delete a student record.
- Create a new subject record.
- Retrieve subject information by ID.
- Retrieve a list of all subjects.
- Update an existing subject's details.
- Delete a subject record.

## Technologies Used

- Java
- Spring Boot
- Maven
- Postman

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/RATHISHKUMAR07/Springboot-Projects.git
   ```

2. Navigate to the project directory:
   ```
   cd Springboot-Projects/Student-api-data
   ```

3. Build and run the application using Maven:
   ```
   mvn spring-boot:run
   ```

4. The application will start, and you can access the API endpoints.

## API Endpoints

- `GET /api/students`: Get a list of all students.
- `GET /api/students/{id}`: Get student information by ID.
- `POST /api/students`: Create a new student.
- `PUT /api/students/{id}`: Update an existing student's details.
- `DELETE /api/students/{id}`: Delete a student.
- `GET /api/students/101/subjects`: Get a list of all subjects.
- `GET /api/students/{id}/subjects/{id}`: Get subject information by ID.
- `POST /api/students/{id}/subjects/{id}`: Create a new subject.
- `PUT /api/students/{id}/subjects/CT-1`: Update an existing subject's details.
- `DELETE /api/students/{id}/subjects/CT-1`: Delete a subject.

## Sample Outputs

- Get all students:
  ```
  GET /api/students
  Response:
  [
    {
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    },
    {
      "rollNo": 102,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
    // Other students...
  ]
  ```

- Get student by RollNo:
  ```
  GET /api/students/101
  Response:
    {
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  ```

- Create a student:
  ```
  POST /api/students
  Request:
  {
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
  }
  Response:
  {
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  ```

- Update a student:
  ```
  PUT /api/students/102
  Request:
  {
      "rollNo": 102,
      "name": "Sanjai",
      "college": "BIT",
      "department": "ECE",
      "gpa": "8.88"
  }
  Response:
  {
      "rollNo": 102,
      "name": "Sanjai",
      "college": "BIT",
      "department": "ECE",
      "gpa": "8.88"
  }
  ```

- Delete a student:
  ```
  DELETE /api/students/102
  Response:
  Student with ID 102 deleted successfully.
  ```

- Get all subjects:
  ```
  GET /api/students/101/subjects
  Response:
  [
  {
    "id": "CT-1",
    "name": "Java Programming",
    "description": "Java Programming Description",
    "student":{
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    },
    {
    "id": "CT-2",
    "name": "C Programming",
    "description": "C Programming Description",
    "student":{
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
    // Other students...
  ]
  ```

- Get subject by ID:
  ```
  GET /api/students/101/subjects/CT-1
  Response:
    {
    "id": "CT-1",
    "name": "Java Programming",
    "description": "Java Programming Description",
    "student":{
      "rollNo": 101,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  ```

- Create a subject:
  ```
  POST /api/students/102/subjects
  Request:
  {
    "id": "ECE-1",
    "name": "Solidworks",
    "description": "Solidworks Description",
    "student":{
      "rollNo": 102,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  Response:
   {
    "id": "ECE-1",
    "name": "Solidworks",
    "description": "Solidworks Description",
    "student":{
      "rollNo": 102,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  ```

- Update a subject:
  ```
  PUT /api/students/102/subjects/ECE-1
  Request:
  {
    "id": "ECE-1",
    "name": "Updated Solidworks",
    "description": "Updated Solidworks Description",
    "student":{
      "rollNo": 102,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  Response:
  {
    "id": "ECE-1",
    "name": "Updated Solidworks",
    "description": "Updated Solidworks Description",
    "student":{
      "rollNo": 102,
      "name": "Rathish",
      "college": "BIT",
      "department": "CT",
      "gpa": "9.01"
    }
  ```

- Delete a Subject:
  ```
  DELETE /api/students/101/subjects/CT-2
  Response:
  Subject with ID "CT-2" deleted successfully.
  ```
## Contributing

Contributions to this project are welcome! If you find any issues or want to add new features, feel free to open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to explore the project, experiment with the API endpoints, and contribute to its development. If you have any questions, please don't hesitate to ask!
