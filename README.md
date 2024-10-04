# Employee Management System

## Project Overview
The Employee Management System (EMS) is a Java-based web application designed to manage employee information and administrative functions. It provides features to add, update, delete, and view employee records. This system is built using the Spring Boot framework and follows a layered architecture.

## Features
- Add new employees to the system
- Update existing employee details
- Delete employee records
- View all employees with detailed information

## Technologies Used
- **Java 11**: Core language used for development
- **Spring Boot**: Framework for creating production-ready applications
- **Maven**: Dependency management and build tool
- **H2 Database**: In-memory database for development and testing
- **Thymeleaf**: Template engine for building dynamic web pages

## Project Structure
- `src/main/java`: Contains Java source files, including controllers, services, repositories, and models
- `src/main/resources`: Contains static resources, templates, and configuration files
- `pom.xml`: Project Object Model file for managing dependencies

## Getting Started
### Prerequisites
- Java 11 or higher
- Maven 3.6+

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/SeyedMohommad/EventManagementSystem
   ```
2. Navigate into the project directory:
   ```sh
   cd EMS
   ```
3. Build the project using Maven:
   ```sh
   ./mvnw clean install
   ```
4. Run the application:
   ```sh
   ./mvnw spring-boot:run
   ```

### Accessing the Application
Once the application is running, you can access it in your browser at:
```
http://localhost:8080
```

## Database
This project uses an in-memory H2 database, which can be accessed via:
```
http://localhost:8080/h2-console
```
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: *leave blank*

## Contact
For any inquiries, please contact:
- **Developer**: Sayedmohammad Aminaltolieh
- **Email**: a.amin771116@yahoo.com
