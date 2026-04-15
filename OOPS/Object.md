# Object (OOP)

---

## What is an Object?

An **object** is an instance of a class. It is a concrete entity that occupies memory in the heap.

Objects are created using the `new` keyword.

---

## Syntax

```java
ClassName objectName = new ClassName();
```

### Example

```java
Student student1 = new Student();
student1.name = "John";
student1.age = 20;
student1.study();
```

---

## Key Characteristics

- Object is a real/physical entity
- Memory is allocated for an object (in heap)
- It is created from a class
- Each object has its own copy of instance variables
- Multiple objects can have different values for the same variables

---

## Memory Concept

| Concept | Details |
|---------|---------|
| **Class** | Logical entity, no memory allocation |
| **Object** | Physical entity, memory allocated in heap |
| **Reference Variable** | Stores the memory address of the object |

---

## Real-Time Analogy

| Component | Analogy |
|-----------|---------|
| **Class** | House blueprint |
| **Object** | Actual house built from blueprint |
| **Multiple Objects** | Multiple houses built from same blueprint |

---

## Object Creation Steps

1. **Declaration** - Declare a reference variable
2. **Instantiation** - Create object using `new` keyword
3. **Initialization** - Assign values to variables/call constructor

### Example

```java
// Step 1: Declaration
Student student1;

// Step 2 & 3: Instantiation and Initialization
student1 = new Student();
```

Or in one line:

```java
Student student1 = new Student();
```

---

## Object vs Class

| Aspect | Class | Object |
|--------|-------|--------|
| **Type** | Logical entity | Physical entity |
| **Memory** | No memory allocated | Memory allocated in heap |
| **Declaration** | Declared once | Multiple objects can be created |
| **Template** | Template for objects | Instance of a class |
| **Example** | Blueprint | Actual house |

---

## Accessing Object Members

### Accessing Variables

```java
Student student1 = new Student();
student1.name = "Alice";
student1.age = 22;
System.out.println(student1.name); // Output: Alice
```

### Accessing Methods

```java
Student student1 = new Student();
student1.study(); // Calls the study() method
```

---

## Multiple Objects from Same Class

```java
class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object 1
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;

        // Object 2
        Student student2 = new Student();
        student2.name = "Alice";
        student2.age = 22;

        // Object 3
        Student student3 = new Student();
        student3.name = "Bob";
        student3.age = 21;

        student1.study(); // Output: John is studying...
        student2.study(); // Output: Alice is studying...
        student3.study(); // Output: Bob is studying...
    }
}
```

---

## Memory Allocation

### Stack Memory
- Stores reference variable (e.g., `student1`)
- Stores primitive variables

### Heap Memory
- Stores actual object
- Each object gets separate memory space

### Visualization

```
Stack Memory          Heap Memory
┌─────────────┐      ┌──────────────────┐
│ student1 ───┼─────→│ name: "John"     │
└─────────────┘      │ age: 20          │
                     └──────────────────┘

┌─────────────┐      ┌──────────────────┐
│ student2 ───┼─────→│ name: "Alice"    │
└─────────────┘      │ age: 22          │
                     └──────────────────┘
```

---

## Types of Object Members

### Instance Variables
- Separate copy for each object
- Accessed using object reference

```java
student1.name = "John";  // Different for each object
student2.name = "Alice";
```

### Instance Methods
- Called using object reference
- Can access instance variables

```java
student1.study();  // Called on object
student2.study();
```

---

## Important Points

- Object is created dynamically at runtime
- `new` keyword allocates memory in heap
- Each object has its own state (variables)
- All objects share the same behavior (methods)
- Reference variable stores memory address, not actual object

---

## Common Mistakes

❌ **Mistake 1:** Creating reference without object
```java
Student student; // Only reference created, no object
student.name = "John"; // NullPointerException!
```

✅ **Correct:**
```java
Student student = new Student(); // Both reference and object created
student.name = "John";
```

---

## Interview Answer

> An object is an instance of a class that is created at runtime using the `new` keyword. Unlike a class which is a logical blueprint, an object is a physical entity that occupies memory in the heap. Each object has its own copy of instance variables and can be accessed using reference variables. Multiple objects can be created from a single class, and each object maintains its own state independently.

