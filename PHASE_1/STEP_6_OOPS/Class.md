# Class (OOP)

---

## What is a Class?

A **class** is a blueprint or template used to create objects.

It defines:
- **Data** (variables)
- **Behavior** (methods)

---

## Syntax

```java
class ClassName {
    // variables
    // methods
}
```

### Example

```java
class Student {
    String name;
    int age;

    void study() {
        System.out.println("Studying...");
    }
}
```

---

## Key Characteristics

- Class is a logical entity
- No memory is allocated for a class
- It acts as a template for objects
- Multiple objects can be created from one class

---

## Memory Concept

| Concept | Details |
|---------|---------|
| **Class** | No memory allocation |
| **Object** | Memory allocated (in heap) |

---

## Real-Time Analogy

| Component | Analogy |
|-----------|---------|
| **Class** | House blueprint |
| **Object** | Actual house |

---

## Why Do We Use Classes?

- Organizes code properly
- Supports reusability
- Models real-world entities
- Makes code easy to maintain

---

## Types of Members in a Class

### Variables (Data)
- Instance variables
- Static variables

### Methods (Behavior)
- Instance methods
- Static methods

---

## Important Rules

- Only one public class per file
- File name must match public class name

---

## Interview Answer

> A class is a user-defined blueprint or template in Java that is used to create objects. It defines the properties (variables) and behavior (methods) of an object. A class itself does not occupy memory, but objects created from it do.

---

