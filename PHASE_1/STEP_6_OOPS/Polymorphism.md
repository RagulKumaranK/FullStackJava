# Polymorphism - Simple

---

## What is Polymorphism?

One name, many forms.

Same method name, different behavior in different classes.

---

## Simple Example

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Woof Woof
        
        Cat cat = new Cat();
        cat.sound();  // Output: Meow
    }
}
```

Same method name `sound()`, different output.

---

## Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

Same method name, different parameters.

```java
class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    
    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);        // Output: 15
        calc.add(5.5, 10.5);    // Output: 16.0
    }
}
```

---

### 2. Runtime Polymorphism (Method Overriding)

Parent reference, child object.

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.sound();  // Output: Woof
        
        Animal animal2 = new Cat();
        animal2.sound();  // Output: Meow
    }
}
```

Parent reference can point to child object.

---

## Key Points

| Type | Details |
|------|---------|
| **Compile-Time** | Same method name + different parameters |
| **Runtime** | Parent class reference + child class object |
| **Benefit** | Write once, use with multiple classes |

---

## Why Polymorphism?

✅ Write flexible code  
✅ Reuse code easily  
✅ Same code works with different objects

---

## Interview Answer

> Polymorphism means "many forms". There are two types: compile-time (method overloading - same method name, different parameters) and runtime (method overriding - child class overrides parent method). Polymorphism allows same method name to behave differently in different classes.

---
