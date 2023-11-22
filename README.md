# Online Store Project

## Project Description

This project is a Java application that builds a simple online store utilizing Remote Method Invocation (RMI). It is made up of two primary parts: a client that communicates with the server to carry out tasks including item administration, user registration, and login, and a server that oversees the store's operations and inventory.

## Files:

1. **User.java:** Defines the User class with login and registration functionality.
2. **Item.java:** Manages item details and operations like updating, removing, and adding items.
3. **ShoppingCart.java:** Implements a shopping cart with methods for adding, removing, and purchasing items.
4. **Client.java:** Orchestrates user interactions and the overall system.
5. **Server.java:** Creates a registry, binds the StoreImpl object, and starts the server.
6. **StoreImpl.java:** Manages the inventory of items, user registration, and shopping cart functionality.
7. **StoreInterface.java:** Defines the remote interface with methods for user registration, browsing items, adding/removing items, etc.

## Features

- User registration and login
- Browsing items in the store
- Adding items to a shopping cart
- Updating items in inventory
- Removing items
- Admin functionality for managing inventory
- Purchasing items

## Prerequisites

To run this project, you will need:
- Java Development Kit (JDK), version 8 or newer
- Basic knowledge of Java and RMI concepts

## Compiling the Project

The project comes with a `MAKEFILE` for easy compilation. To compile the project, run:

- make compile 
- make jar

This command compiles the source files and places the output in the `bin` directory. The `MAKEFILE` is configured to handle various tasks related to building and running the application.

## Running the Application
The application can be run in two modes: Server and Client. Use the following commands to start each component:

**Run the Server**

java -jar OnlineStore.jar server

**Run the Client**

open a new terminal and run 

java -jar OnlineStore.jar client
