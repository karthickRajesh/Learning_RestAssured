# Learning RestAssured - Comprehensive Guide

A comprehensive learning project demonstrating various REST API testing concepts and techniques using RestAssured framework with TestNG. This project is the outcome of self-learning about RestAssured using Java and covers practical API automation examples using real-world REST APIs.

## Table of Contents

- [Overview](#overview)
- [Technologies & Dependencies](#technologies--dependencies)
- [Project Coverage](#project-coverage)
- [Key Components](#key-components)
- [Test Cases Practiced](#test-cases-practiced)
- [Learning Topics Covered](#learning-topics-covered)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Running Tests](#running-tests)
- [Quick Start](#quick-start)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

## Overview

This project is a hands-on learning resource for understanding REST API testing automation using RestAssured. It demonstrates:

- **Practical API Testing**: Real-world examples using RESTful Booker API
- **Complete HTTP Coverage**: GET, POST, PUT, PATCH, and DELETE operations
- **JSON Processing**: Multiple approaches to creating and handling JSON data
- **Best Practices**: Industry-standard patterns and testing methodologies
- **Advanced Features**: BDD approach, custom filters, logging, and performance testing

## Technologies & Dependencies

| Tool/Library | Version | Purpose |
|--------------|---------|---------|
| Java | 8+ | Programming Language |
| Maven | 3.x | Build Tool |
| RestAssured | 5.4.0 | REST API Testing Library |
| TestNG | 7.10.2 | Testing Framework |
| Jackson | 2.18.3 | JSON Processing |
| Log4j | 2.25.3 | Logging Framework |
| Hamcrest | 3.0 | Assertion Library |
| JAXB API | 2.3.1 | XML Binding |

## Project Coverage

### 1. HTTP Methods Testing

- **GET Requests**: Retrieving bookings and booking details
- **POST Requests**: Creating tokens and creating bookings
- **PUT Requests**: Updating booking information
- **PATCH Requests**: Partial updates to bookings
- **DELETE Requests**: Deleting bookings

### 2. Request Building & Specification

- Using RequestSpecification for API calls
- Different ways of calling HTTP methods on RequestSpecifications
- Request builder patterns and configuration
- Query parameters and request filtering
- Default specification setup

### 3. JSON Handling

- Creating JSON objects using Jackson API
- Creating JSON arrays using Jackson API
- Creating nested JSON arrays
- Creating request body using Maps
- Serialization and Deserialization with Jackson

### 4. Response Handling

- Response validation and assertions
- Extracting data from responses
- Working with ValidatableResponse
- Response time measurement
- Writing responses to files
- Response schema validation

### 5. POJO Classes & Data Mapping

- Employee POJO for serialization/deserialization
- List of employees handling
- Object-to-JSON and JSON-to-Object conversion

### 6. Advanced Features

- BDD-style assertions (Behavior Driven Development)
- Static imports for cleaner code
- Custom filters and logging
- API response logging
- File uploads as payload
- Response schema validation
- Test listeners and lifecycle management

### 7. Testing & Reporting

- TestNG framework integration
- Custom TestListener for test lifecycle management
- Test execution reporting
- Logging with Log4j 2
- GitHub Actions integration

### 8. API Practice

- RESTful Booker API (https://restful-booker.herokuapp.com)
- Token-based authentication
- Booking CRUD operations

## Key Components

| Component | Purpose |
|-----------|---------|
| **GetBookingsAPI.java** | GET request examples with assertions |
| **CreateTokenPOSTAPI.java** | POST request with token creation |
| **UpdateBookingPUTAPI.java** | PUT request for full updates |
| **PartialUpdateBookingPATCHAPI.java** | PATCH request for partial updates |
| **deleteBookingDELETEAPI.java** | DELETE request operations |
| **GetBookingAPIBDD.java** | BDD-style test approach |
| **GetBookingAPIBDDStaticImport.java** | BDD with static imports |
| **Employee.java** | POJO model class |
| **EmployeeSerializationDeserialization.java** | Object serialization examples |
| **CreateJsonObjectUsingJacksonAPI.java** | JSON object creation |
| **CreateJsonArrayUsingJacksonAPI.java** | JSON array creation |
| **CreatingNestedJsonArray.java** | Nested JSON structures |
| **CreatingRequestBodyUsingMap.java** | Map-based request bodies |
| **DefaultRequestSpecificationExample.java** | Default specification setup |
| **RequestSpecBuilderExample.java** | Using RequestSpecBuilder |
| **MeasuringResponseTime.java** | Performance measurement |
| **WriteResponseInTextFile.java** | File I/O operations |
| **SendFileAsPayload.java** | File upload functionality |
| **GetBookingsAPIwithFilterandLogger.java** | Custom filters and logging |
| **QueryingRequestSpecification.java** | Query parameter examples |

## Test Cases Practiced

### API CRUD Operations
- Create a POST Request and validate (`CreateTokenPOSTAPI.java`)
- Create a PUT Request and validate (`UpdateBookingPUTAPI.java`)
- Create a PATCH Request and validate (`PartialUpdateBookingPATCHAPI.java`)
- Create a GET Request and validate (`GetBookingsAPI.java`)
- Create a DELETE Request and validate (`deleteBookingDELETEAPI.java`)

### Request Body Creation
- Creating and Sending RequestBody as Map (`CreatingRequestBodyUsingMap.java`)
- Creating JSONObject using Jackson API (`CreateJsonObjectUsingJacksonAPI.java`)
- Creating JSONARRAY using Jackson API (`CreateJsonArrayUsingJacksonAPI.java`)
- Creating nested JSON structures (`CreatingNestedJsonArray.java`)

### Serialization & Deserialization
- Serialization and Deserialization of objects (`EmployeeSerializationDeserialization.java`)
- List of employees serialization/deserialization

### File Handling
- Writing response in TextFile (`WriteResponseInTextFile.java`)
- Sending File as Payload (`SendFileAsPayload.java`)

### Advanced Testing
- BDD approach with RestAssured
- Custom filters and logging
- Test listeners and lifecycle management
- GitHub Actions integration

## Learning Topics Covered

✅ RESTful API basics  
✅ HTTP methods (GET, POST, PUT, PATCH, DELETE)  
✅ Request/Response handling  
✅ JSON processing and manipulation  
✅ POJO serialization/deserialization  
✅ BDD testing approach  
✅ Test listeners and lifecycle management  
✅ Logging and debugging  
✅ Assertions and validations  
✅ API authentication  
✅ Performance testing (response time)  
✅ File operations  
✅ Custom filters and interceptors  
✅ Response schema validation  
✅ Request specification builders  

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
- **Apache Maven** 3.6.0 or higher
- **Git** (optional, for version control)

Verify installation:
```bash
java -version
mvn -version
```

## Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd Learning_RestAssured
   ```

2. **Install dependencies**:
   ```bash
   mvn clean install
   ```

3. **Verify installation**:
   ```bash
   mvn -version
   ```

## Running Tests

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=GetBookingsAPI
```

### Run with TestNG Suite
```bash
mvn test -Dsuite=testng.xml
```

### Run Specific Test Method
```bash
mvn test -Dtest=GetBookingsAPI#getBookingsAPIandvalidatewithResponse
```

### View Test Reports
After test execution, open the HTML report:
```bash
open test-output/index.html
```

### View Logs
Check detailed logs:
```bash
tail -f logs/app.log
```

## Quick Start

1. **Clone the repository**
2. **Install dependencies**: `mvn clean install`
3. **Explore test files** in `src/test/java/practiceRestfulBooker/`
4. **Run tests**: `mvn test`
5. **View logs** in `logs/app.log`
6. **Check reports** in `test-output/`

## Project Structure

```
Learning_RestAssured/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── practiceRestfulBooker/      # Test files
│       └── resources/
├── logs/                                   # Log files
│   └── app.log
├── test-output/                           # TestNG reports
├── target/                                # Build artifacts
├── pom.xml                               # Maven configuration
├── testng.xml                            # TestNG configuration
└── README.md                             # This file
```

## Practice Resources

- **RESTful Booker API**: https://restful-booker.herokuapp.com/apidoc/index.html
- Official RestAssured Documentation: https://rest-assured.io/
- TestNG Documentation: https://testng.org/

## Project Purpose

This project serves as a comprehensive learning resource for:

- **Beginners**: Learning REST API testing fundamentals
- **Intermediate Users**: Understanding RestAssured framework features
- **Advanced Users**: Practicing advanced testing patterns and best practices
- **Practitioners**: Real-world API automation examples

## Key Learning Outcomes

By exploring this project, you will understand:

1. How to write automated tests for REST APIs
2. Different ways to build and send HTTP requests
3. How to handle JSON data in various formats
4. Best practices for organizing test code
5. How to implement logging and test listeners
6. Advanced testing patterns (BDD, custom filters)
7. Performance testing for APIs
8. File operations in test automation

## Best Practices

1. **Use BDD Syntax**: Make tests more readable and maintainable
2. **Organize Tests**: Group related tests together
3. **Use POJO Models**: Map JSON responses to objects
4. **Implement Logging**: Track execution for debugging
5. **Handle Errors**: Implement proper error handling
6. **Validate Responses**: Always assert response data and status codes
7. **Clean Logs**: Monitor and manage log files

## Troubleshooting

### Common Issues

**1. Connection Refused**
- Verify internet connection
- Ensure RESTful Booker API is accessible
- Check firewall settings

**2. Maven Build Failure**
- Clear Maven cache: `mvn clean install -U`
- Check Java version compatibility
- Verify Maven configuration

**3. Test Failures**
- Check API response format
- Verify test data
- Review logs for detailed error messages

**4. No Test Output**
- Ensure test methods are annotated with `@Test`
- Check testng.xml configuration
- Verify test class names match patterns

## Contributing

To contribute to this project:

1. Create a feature branch (`git checkout -b feature/YourFeature`)
2. Commit your changes (`git commit -m 'Add YourFeature'`)
3. Push to the branch (`git push origin feature/YourFeature`)
4. Create a Pull Request

## Contact & Support

For issues, questions, or suggestions, please reach out to the development team or create an issue in the repository.

---

**Framework Version**: 1.0-SNAPSHOT  
**Last Updated**: March 20, 2026  
**Status**: Active Learning Project

This comprehensive guide covers everything you need to understand and work with the Learning_RestAssured project. Happy learning!