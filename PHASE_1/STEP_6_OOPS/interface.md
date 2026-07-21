# Interface (OOP)

---

## What is an Interface?

An **interface** is a blueprint of a class that defines **what to do**, not **how to do it**.

It contains:
- **Abstract methods** (no body)
- **Constants** (public static final variables)
- **Default and static methods** (Java 8+)

---

## Syntax

```java
interface InterfaceName {
    // constants
    // abstract methods
}
```

### Example

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
```

---

## Key Characteristics

- Interface is a logical entity
- No memory is allocated for an interface
- It acts as a contract for classes
- A class can implement multiple interfaces
- Cannot create objects of an interface directly

---

## Memory Concept

| Concept | Details |
|---------|---------|
| **Interface** | No memory allocation |
| **Implementing Class Object** | Memory allocated (in heap) |

---

## Real-Time Analogy

| Component | Analogy |
|-----------|---------|
| **Interface** | Job description / rulebook |
| **Implementing Class** | Employee who follows the rules |

---

## Why Do We Use Interfaces?

- Achieves full abstraction (traditionally)
- Supports multiple inheritance (of type)
- Makes code flexible and loosely coupled
- Defines a common behavior for unrelated classes

---

## Types of Members in an Interface

### Variables (Data)
- Always `public static final` (constants) by default

### Methods (Behavior)
- Abstract methods (no body)
- Default methods (have body, Java 8+)
- Static methods (have body, Java 8+)
- Private methods (Java 9+)

---

## Important Rules

- A class uses `implements` keyword to use an interface
- A class must implement all abstract methods, or be declared `abstract`
- An interface can `extend` another interface (using `extends`, not `implements`)
- An interface cannot have constructors

---

## Interview Answer

> An interface is a blueprint in Java that contains abstract methods, constants, and (since Java 8) default and static methods. It defines a contract that implementing classes must follow. An interface does not occupy memory, and it cannot be instantiated directly, but classes that implement it can be used to create objects.

---

# Class vs Interface — Quick Comparison

| Feature | Class | Interface |
|---|---|---|
| Keyword | `class` | `interface` |
| Method body | Has body | No body (except default/static) |
| Object creation | Can create objects | Cannot create objects directly |
| Inheritance | `extends` (only 1 class) | `implements` (many interfaces allowed) |
| Variables | Any type | Always `public static final` |
| Purpose | Defines what something **is** | Defines what something **must do** |