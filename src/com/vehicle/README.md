# Software Design Patterns — Assignment #2
 
**Topic:**Vehicle Factory  
**Language:** Java 

---

## Overview

This repository contains the implementation of **Factory Method** and **Abstract Factory** design patterns in Java for **Vehicle Factory**.

The project demonstrates:
1. **Part A (Factory Method):** Creating individual vehicle objects (`twowheeler`, `fourwheeler`) using dedicated vehicle factories without coupling client code to concrete classes.
2. **Part B (Abstract Factory):** Producing families of related vehicle accessories/parts (`engine`, `tire`) per vehicle category to guarantee product consistency.

---

## Project Structure

```text
src/
└── com/
    └── vehicle/
        ├── factorymethod/
        │   ├── vehicle.java
        │   ├── twowheeler.java
        │   ├── fourwheeler.java
        │   ├── vehiclefactory.java
        │   ├── twowheelerfactory.java
        │   └── fourwheelerfactory.java
        │
        ├── abstractfactory/
        │   ├── engine.java
        │   ├── tire.java
        │   ├── bikeengine.java
        │   ├── biketire.java
        │   ├── carengine.java
        │   ├── cartire.java
        │   ├── vehiclepartsfactory.java
        │   ├── twowheelerpartsfactory.java
        │   └── fourwheelerpartsfactory.java
        │
        └── main.java