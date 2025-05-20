# Quizzly

This is a web application that offers quizzes and study notes for various programming languages and frameworks. It is built using Spring Boot for the backend with RESTful APIs, and MySQL for storing all questions, options, and answers. The frontend is developed using HTML, CSS, and JavaScript. APIs are tested using Postman.

## Features

- Quizzes for different programming languages
- Notes section for languages and frameworks
- All questions, options, and answers stored in MySQL
- RESTful API backend using Spring Boot
- Frontend built with HTML, CSS, and JavaScript
- API tested using Postman

## Tech Stack

- **Backend:** Spring Boot
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **Tools:** Postman (for API testing)

## Getting Started

### 1. Clone the Repository


git clone https://github.com/RajasSamarth/Quiz-App.git
cd your-repo-name

2. Set Up the Database
Create a new MySQL database (e.g., quiz_app)

Import the SQL schema with questions, options, and answers

Update the application.properties file in the backend:
spring.datasource.url=jdbc:mysql://localhost:3306/quiz
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3. Run the Spring Boot Application
Open the project in your IDE

Run the application using main method in the Spring Boot starter class

Backend should be available at http://localhost:8080

4. Open the Frontend
Navigate to the project folder

Open index.html in your browser

API Overview
Example endpoints:

GET /api/questions – Retrieve all quiz questions

