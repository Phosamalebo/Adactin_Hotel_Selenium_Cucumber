# 🏨 Adactin Hotel App - Automation Testing Suite

This project is a **BDD-style automation framework** built using **Cucumber**, **Selenium WebDriver**, and **JUnit** for testing the [Adactin Hotel App](https://adactinhotelapp.com/index.php). The framework validates key functionalities such as **login**, **searching hotels**, and **booking hotels**.

## 📁 Project Structure

├── features/ # Gherkin feature files  
│   ├── BookHotel.feature  
│   ├── Login.feature  
│   └── SearchHotel.feature  
├── pages/ # Page classes for each application page  
│   ├── HomePage.java  
│   ├── LoginPage.java  
│   ├── SearchHotel.java  
│   └── BookHotel.java  
├── runner/ # Test runner  
│   └── TestRunner.java  
├── stepDefinition/ # Step definitions for feature steps  
│   ├── loginPage.java  
│   ├── searchHotel.java  
│   └── bookHotel.java  
├── utilities/ # Shared WebDriver setup  
│   └── browserDriver.java  
└── README.md # Project documentation  

## ⚙️ Tools & Technologies

- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- JUnit  
- WebDriverManager  
- Optional: Maven or Gradle for build automation  

## ✅ Features Tested
###Login
-Validates user login with valid credentials.

###Search Hotel
-Searches hotels by location, room type, dates, and number of guests.

###Book Hotel
-Selects a hotel, fills in guest and payment information, and completes a booking.
