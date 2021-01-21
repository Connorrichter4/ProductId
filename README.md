# Retrieving the Product Details Using the Product ID

## Project Description

Create a servlet-based application that shows a form to enter a product ID. The product ID is then validated, and product details are retrieved from the database and displayed to the user. You need to create a product table in MySQL and prepopulate it with data. Use JDBC to do all database processing.

As a part of developing an e-commerce web application, the admin backend requires a module that can retrieve product information based on the product ID.

## Technologies Used

- Eclipse as the IDE
- Apache Tomcat as the web server
- MySQL Connector for JDBC functionality

## Requirements

- Create an HTML page to take in a product ID
- Set up JDBC to work with the application
- Create a servlet that will take the product ID and use JDBC to query the database for the product
- If the product is found, the servlet will display the product details, otherwise it will show an error message
- Document the step-by-step process involved in completing this task

## Examples

### Product ID search page

![Screen Shot 2021-01-21 at 9 31 51 AM](https://user-images.githubusercontent.com/58124052/105373467-560bc500-5bcc-11eb-850c-160993458f18.png)

### Found Product ID

![Screen Shot 2021-01-21 at 9 32 18 AM](https://user-images.githubusercontent.com/58124052/105373480-5906b580-5bcc-11eb-9210-de9d88176e1e.png)

### Could not find Product ID

![Screen Shot 2021-01-21 at 9 32 31 AM](https://user-images.githubusercontent.com/58124052/105373497-5d32d300-5bcc-11eb-9e0d-147a194d8451.png)

### ID entered was not valid

![Screen Shot 2021-01-21 at 9 32 53 AM](https://user-images.githubusercontent.com/58124052/105373519-61f78700-5bcc-11eb-8af1-3fe160b3f947.png)
