
📦 Inventory Management System
✅ Exercise Overview

This project is a simple Stock/Inventory Management System implemented in Java.
The goal is to practice using HashMap for fast product access via unique IDs, as well as to train object manipulation and method reuse.

🛠 Classes
1. Product

Represents a product with the following attributes:

id (int) → Unique identifier

name (String) → Product name

quantity (int) → Quantity in stock

price (double) → Unit price

2. Inventory

Manages a collection of products stored in a HashMap (<Integer, Product>).

Methods:

addProduct(Product p) → Adds a product if it doesn’t already exist (putIfAbsent).

removeProduct(int id) → Removes a product by its ID.

updateQuantity(int id, int quantity) → Updates the stock quantity of a product.

findProductById(int id) → Returns the product or a message if it’s not found.

listAllProducts() → Displays all registered products.

🎯 Learning Objectives

Practice using HashMap for quick lookups.

Explore the use of putIfAbsent for controlled insertions.

Train object manipulation in Java.

Encourage logic reuse inside methods (like in a banking system exercise).
