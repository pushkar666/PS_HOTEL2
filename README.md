# Hotel Management System

## Project Overview
This project implements a simple hotel management system in Java using JDBC implementation and Collection Framework. 
It allows users to view a menu, select items, calculate bills including GST, 
and supports an admin mode for adding new menu items. 
The program continuously displays the menu and processes user choices until terminated.

## Author Information
- **Author:** PUSHKAR D
- **Email:** pushkardwarkanath@gmail.com
- **GitHub:** [https://github.com/pushkar666](https://github.com/pushkar666)
- **Project ID:** PS14APRILOF24JFS#012

## Features
- Displays a predefined menu with item names and prices.
- Allows users to select items and specify quantities.
- Calculates total bill including GST (18%).
- Admin mode with password protection to add new menu items dynamically.
- Continuously prompts the user for choices until terminated.

## Database Configuration
- **URL:** `jdbc:mysql://localhost:3306/library_db`
- **User:** `root`
- **Password:** `29587674`

Ensure the MySQL database is running and the specified database (`library_db`) and table (`hotel1`) are created before running the application.

## Dependencies
- Java Development Kit (JDK) 8 or higher
- MySQL Connector/J

## License
This project is licensed under the MIT License. See the [LICENSE](https://choosealicense.com/licenses/mit/) file for more details.