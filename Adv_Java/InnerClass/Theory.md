# ☕ Java Inner Classes — Complete Notes

---

## 📌 What is an Inner Class?

A class defined **inside another class** is called an **Inner Class**.

- The class that contains it → **Outer Class**
- The class inside → **Inner Class**
- Inner class can access **all members** of outer class (even private!)

---

## 1️⃣ Member Inner Class (Nested Inner Class)

Defined **inside a class**, but **outside any method**.

✅ **Key Points:**
- Needs an outer class object to be instantiated
- Can access all (including private) members of the outer class
- Cannot have static members

📌 **Example:**

```java
class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}
```

**Output:**
```
Value of x: 10
```

---

## 2️⃣ Local Inner Class

Defined **inside a method**.

✅ **Key Points:**
- Accessible only within that method
- Used for temporary logic
- Cannot use access modifiers (`public`, `private`, etc.)

📌 **Example:**

```java
class Outer {
    void show() {
        class LocalInner {
            void msg() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInner obj = new LocalInner();
        obj.msg();
    }
}
```

**Output:**
```
Inside Local Inner Class
```

---

## 3️⃣ Anonymous Inner Class

A class **without a name**, used only once.

✅ **Key Points:**
- Used for quick, one-time implementations
- Common in event handling, threads, and callbacks
- Must implement an interface or extend a class
- Ends with a **semicolon** `;`

📌 **Example:**

```java
abstract class Animal {
    abstract void sound();
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };
        a.sound();
    }
}
```

**Output:**
```
Dog barks
```

---

## 4️⃣ Static Inner Class

Declared with the `static` keyword.

✅ **Key Points:**
- Cannot access non-static members of outer class directly
- No need to create an outer class object
- Can have its own static members

📌 **Example:**

```java
class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Inner Class");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
```

**Output:**
```
Static Inner Class
```

---

## 🔥 Quick Comparison Table

| Type | Needs Outer Object? | Access Outer Members | Use Case |
|---|---|---|---|
| **Member Inner Class** | ✅ Yes | ✅ All members | Strong relationship between classes |
| **Local Inner Class** | ❌ No (inside method) | ✅ Limited (method scope) | Temporary / one-method logic |
| **Anonymous Inner Class** | ❌ No | ✅ Limited | One-time use, event handling |
| **Static Inner Class** | ❌ No | ❌ Only static members | Utility / helper class |

---

## 🎯 Interview Questions & Answers

---

### Q1. What is an inner class in Java? Why do we use it?

**Answer:**
An inner class is a class defined inside another class. We use it to:
- Logically group classes that belong together
- Increase encapsulation
- Access private members of the outer class easily

---

### Q2. What is the difference between a static nested class and a non-static inner class?

**Answer:**

| Feature | Non-Static Inner Class | Static Nested Class |
|---|---|---|
| Needs outer object? | Yes | No |
| Access outer instance members? | Yes | No |
| Access outer static members? | Yes | Yes |
| Can have static members? | No | Yes |

---

### Q3. How do you instantiate a non-static inner class?

**Answer:**
You must first create an instance of the outer class, then use it to create the inner class object.

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
```

---

### Q4. What is an anonymous inner class? Give a real-world use case.

**Answer:**
An anonymous inner class is a class with no name, created and used only once. A very common real-world use case is **button click event handling** in Android or Swing:

```java
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});
```

---

### Q5. Can an inner class access private members of the outer class?

**Answer:**
Yes! A **non-static inner class** can directly access all members (including `private`) of its outer class. This is one of the biggest advantages of inner classes.

```java
class Outer {
    private int secret = 42;

    class Inner {
        void reveal() {
            System.out.println(secret); // ✅ Allowed
        }
    }
}
```

---

### Q6. What is a local inner class? What are its limitations?

**Answer:**
A local inner class is defined inside a method. Its limitations:
- Only accessible within that method — not outside
- Cannot be declared `public`, `private`, `protected`, or `static`
- Can only access `final` or effectively final local variables from the enclosing method

---

### Q7. What happens when inner class and outer class have the same variable name?

**Answer:**
Use `OuterClassName.this.variableName` to refer to the outer class variable.

```java
class Outer {
    int x = 100;

    class Inner {
        int x = 200;

        void show() {
            System.out.println(x);             // 200 (inner)
            System.out.println(Outer.this.x);  // 100 (outer)
        }
    }
}
```

---

### Q8. Can we have a static method inside a non-static inner class?

**Answer:**
No (in Java versions before Java 16). A non-static inner class **cannot have static members**. If you need a static method, use a **static nested class** instead.

> ⚠️ From **Java 16+**, inner classes are allowed to have static members.

---

### Q9. Why is an anonymous inner class's declaration followed by a semicolon?

**Answer:**
Because the entire anonymous inner class expression is a **statement** (it's assigned to a variable or passed as an argument). In Java, statements end with a semicolon.

```java
Animal a = new Animal() {
    void sound() { System.out.println("Roar"); }
}; // ← semicolon ends the assignment statement
```

---

### Q10. What is the difference between a Local Inner Class and an Anonymous Inner Class?

**Answer:**

| Feature | Local Inner Class | Anonymous Inner Class |
|---|---|---|
| Has a name? | ✅ Yes | ❌ No |
| Can be reused within method? | ✅ Yes (create multiple objects) | ❌ No (used once) |
| Can extend a class AND implement interface? | ✅ Yes | ❌ Only one (either extend or implement) |
| Readability | More readable for complex logic | Compact for simple one-liners |

---

### Bonus Tip 💡

> If you are asked *"When would you prefer a Lambda over an Anonymous Inner Class?"* — answer:
> From **Java 8+**, if the interface has only **one abstract method** (functional interface), you can replace an anonymous inner class with a **lambda expression** for cleaner code.
>
> ```java
> // Anonymous Inner Class
> Runnable r = new Runnable() {
>     public void run() { System.out.println("Running"); }
> };
>
> // Lambda (Java 8+)
> Runnable r = () -> System.out.println("Running");
> ```

