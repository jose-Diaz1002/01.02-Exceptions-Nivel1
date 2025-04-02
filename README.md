# 01.02-Exceptions-Nivel1

📄 **Description - Exercise Statement**

Create a class called "Product" with the attributes name and price, and another class called "Sale". 
This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception "EmptySaleException" 
and displays on screen "To make a sale you must first add products" if the product collection is empty. If 
the collection contains products, it should iterate through the collection and store the sum of all product 
prices in the total price attribute of the sale.

The custom exception "EmptySaleException" must inherit from the Exception class. We must pass the message 
"To make a sale you must first add products" to its constructor, and when we catch the exception, we should 
display it on screen using the exception's getMessage() method.

Write the necessary code to generate and catch an exception of type "IndexOutOfBoundsException".

This project implements a product and sales management system with custom exception handling. It 
demonstrates object-oriented programming principles and proper exception management in Java.

💻 **Technologies Used**
- Java 11
- Maven (for dependency management)

📋 **Requirements**
- JDK 11+
- Maven 3.6.3+
- JUnit 5 (for testing)

🛠️ **Installation**
1. Clone this repository:
```bash
git clone https://github.com/yourusername/product-sales-system.git

