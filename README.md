01.02-Exception-Nivel1
statament:
Create a class called "Product" with the attributes name and price, and another class called "Sale". This class has as attributes a collection of products and the total sale price.
The "Sale" class has a method called calculateTotal() that throws the custom exception "EmptySaleException" and displays on the screen "To make a sale, you must first add products" if the product collection is empty. If the collection contains products, it should iterate through the collection and store the sum of all product prices in the total sale price attribute.
The custom exception "EmptySaleException" must inherit from the Exception class. Its constructor should receive the message "To make a sale, you must first add products", and when we catch the exception, we should display it using the exception's getMessage() method.
Write the necessary code to generate and catch an exception of type "IndexOutOfBoundsException".

Description:
This project involves creating a Product class and a Sale class to manage a collection of 
products and calculate the total price of a sale.
 
Technologies Used:
Java
IntelliJ IDEA

Requirements:
Java Development Kit (JDK) 11 or later
IntelliJ IDEA or any Java-compatible IDE

🛠️ Installation:
Clone this repository
Navigate to the project directory
Open the project in IntelliJ IDEA or another Java IDE
Compile and run the program.

Execution:
Create Product instances with different names and prices
Add products to a Sale instance
Call calculateTotal(), which:
Calculates and prints the total sale price.
Throws an exception if no products are added.
Demonstrate handling IndexOutOfBoundsException by trying to access an invalid list index.

Deployment.
This is a simple Java program intended for local execution. If needed, it can be packaged as a .jar file for easy distribution.

Contributions:
Contributions are welcome! Follow these steps to contribute
Fork the repository.
Create a new branch.
Make your changes and commit them
Push your changes to your branch
Create a Pull Request.

