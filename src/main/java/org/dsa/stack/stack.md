# Stack Data Structure - Java Implementation Guide

## Overview

A Stack is a linear data structure that follows the:

> **LIFO (Last In First Out)** principle.

The element inserted last is removed first.

Examples:
- Browser history
- Undo/Redo functionality
- Function call stack
- Expression evaluation
- Backtracking algorithms

---

# Project Structure

```text
AlgoStruct/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── dsa/
│                   ├── StackUsingArray.java
│                   ├── StackUsingLinkedList.java
│                   └── Main.java
│
│   └── test/
│       └── java/
│           └── stack/
│               └── Stack.java
│           
├── README.md
├── pom.xml 
└── .gitignore