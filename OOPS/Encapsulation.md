# Encapsulation - Simple

---

## What is Encapsulation?

Make variables `private` and provide `public` methods to access them.

---

## Example

```java
class Student {
    private int age;  // private - cannot access directly
    
    // Getter - to read value
    public int getAge() {
        return age;
    }
    
    // Setter - to set value
    public void setAge(int a) {
        age = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);              // Set
        System.out.println(student.getAge());  // Get
    }
}

// Output: 20
```

---

## Private vs Public

```java
class Person {
    private String name;      // ❌ Cannot access directly
    public int age;           // ✅ Can access directly
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.age = 25;                    // ✅ OK
        System.out.println(p.name);    // ❌ ERROR! private
    }
}
```

---

## 3 Steps of Encapsulation

1. Make variable `private`
2. Create `getter` method (read)
3. Create `setter` method (write)

```java
class Account {
    private double balance;
    
    // Getter
    public double getBalance() {
        return balance;
    }
    
    // Setter
    public void setBalance(double b) {
        balance = b;
    }
}
```

---

## Why Encapsulation?

✅ Protect data  
✅ Control access  
✅ Hide details  

---

## Interview Answer

> Encapsulation is using `private` variables and providing `public` getter and setter methods to access them. It protects data and controls how it's used.

---
