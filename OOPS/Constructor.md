# Constructor (OOP)

---

## What is a Constructor?

A **constructor** is a special method that is automatically called when an object is created.

It is used to initialize the object's data members (variables).

---

## Key Characteristics

- Has the same name as the class
- No return type (not even `void`)
- Called automatically when object is created using `new` keyword
- Used to initialize instance variables

---

## Syntax

```java
class ClassName {
    ClassName() {
        // Constructor body
        // Initialize variables
    }
}
```

### Example

```java
class Student {
    String name;
    int age;

    // Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
}
```

---

## Types of Constructors

### 1. Default Constructor (No-Argument Constructor)

A constructor with no parameters.

```java
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name); // Output: Unknown
        System.out.println(student1.age);  // Output: 0
    }
}
```

### 2. Parameterized Constructor

A constructor with parameters. Used to initialize variables with values.

```java
class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        System.out.println(student1.name); // Output: John
        System.out.println(student1.age);  // Output: 20
    }
}
```

---

## Constructor vs Method

| Aspect | Constructor | Method |
|--------|-------------|--------|
| **Name** | Same as class name | Any name |
| **Return Type** | No return type | Has return type (void, int, etc.) |
| **Called** | Automatically when object created | Called explicitly |
| **Purpose** | Initialize object | Perform specific task |

---

## Default Constructor (Implicit)

If you don't define any constructor, Java provides a **default constructor** automatically.

```java
class Student {
    String name;
    int age;
    // No constructor defined
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(); // Default constructor called implicitly
        System.out.println(student.name); // Output: null
        System.out.println(student.age);  // Output: 0
    }
}
```

**Note:** Once you define any constructor, the default constructor is no longer provided.

---

## `this` Keyword in Constructor

Used to refer to the current object's variables and distinguish them from parameters.

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // this.name refers to instance variable
        this.age = age;    // age parameter assigned to this.age
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        System.out.println(student.name); // Output: John
        System.out.println(student.age);  // Output: 20
    }
}
```

---

## Memory Allocation in Constructor

When a constructor is called:
1. Memory is allocated in heap
2. Instance variables are initialized
3. Reference variable points to the object

```
new Student("John", 20)
    ↓
1. Memory allocated in heap
2. Constructor executes
3. Instance variables initialized
4. Reference points to object
```

---

## Important Rules

- Constructor name must match class name exactly
- Constructor has no return type
- Constructor is called automatically with `new` keyword
- Default constructor is provided if no constructor is defined
- Once you define a constructor, the default constructor is not provided

---

## Common Mistakes

❌ **Mistake 1:** Constructor with return type
```java
void Student() {  // WRONG! void keyword should not be there
    name = "John";
}
```

✅ **Correct:**
```java
Student() {  // No return type
    name = "John";
}
```

---

❌ **Mistake 2:** Forgetting to initialize variables
```java
Student() {
    // Variables not initialized, will have default values
}
```

✅ **Correct:**
```java
Student() {
    name = "Unknown";
    age = 0;
}
```

---

## Interview Answer

> A constructor is a special method in Java that is automatically called when an object is created using the `new` keyword. It has the same name as the class and no return type. Constructors are used to initialize the instance variables of an object. There are two types: default constructor (no parameters) and parameterized constructor (with parameters).

