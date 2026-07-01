# OOP Interview Questions & Answers

---

## Q1: What is OOP?

**A:** OOP is Object-Oriented Programming. It organizes code using objects and classes. Four main concepts: Inheritance, Polymorphism, Abstraction, Encapsulation.

---

## Q2: What is a Class?

**A:** A class is a blueprint or template to create objects. It defines what data and behavior an object will have.

```java
class Student {
    String name;
    int age;
}
```

---

## Q3: What is an Object?

**A:** An object is a real/physical entity created from a class. It occupies memory in the heap.

```java
Student student = new Student();  // Object created
```

---

## Q4: What is a Constructor?

**A:** A constructor is a special method that runs automatically when an object is created. It initializes the object's variables.

```java
class Student {
    Student() {  // Constructor
        name = "Unknown";
    }
}
```

---

## Q5: What is Inheritance?

**A:** Inheritance is when a child class takes methods and variables from a parent class using `extends`. It promotes code reuse.

```java
class Dog extends Animal {  // Dog inherits from Animal
}
```

---

## Q6: What is Polymorphism?

**A:** Polymorphism means "many forms". Same method name behaves differently in different classes.

```java
Dog dog = new Dog();
dog.sound();  // Woof

Cat cat = new Cat();
cat.sound();  // Meow
```

---

## Q7: What is Abstraction?

**A:** Abstraction is hiding implementation details and showing only what's necessary. Done using abstract classes and interfaces.

```java
abstract class Shape {
    abstract void draw();  // Method without body
}
```

---

## Q8: What is Encapsulation?

**A:** Encapsulation is using `private` variables and providing `public` getter/setter methods. It protects data.

```java
class Student {
    private int age;  // private
    
    public int getAge() {  // getter
        return age;
    }
}
```

---

## Q9: What is the difference between Class and Object?

**A:** 
- **Class**: Logical entity, blueprint, no memory
- **Object**: Physical entity, created from class, occupies memory

---

## Q10: What are the types of Inheritance?

**A:**
1. **Single**: One child from one parent
2. **Multi-Level**: GrandParent → Parent → Child
3. **Hierarchical**: Multiple children from one parent

---

## Q11: What is Method Overloading?

**A:** Same method name with different parameters (compile-time polymorphism).

```java
void add(int a, int b) { }
void add(double a, double b) { }
```

---

## Q12: What is Method Overriding?

**A:** Child class changes parent class method (runtime polymorphism).

```java
class Dog extends Animal {
    void sound() {  // Overridden
        System.out.println("Woof");
    }
}
```

---

## Q13: What is `super` keyword?

**A:** Used to call parent class methods or constructor from child class.

```java
super.method();   // Call parent method
super(name);      // Call parent constructor
```

---

## Q14: What is the `this` keyword?

**A:** Refers to current object's variables. Used to distinguish variables from parameters.

```java
class Student {
    String name;
    
    Student(String name) {
        this.name = name;  // this.name = parameter name
    }
}
```

---

## Q15: Can we inherit private members?

**A:** No. Private members are not inherited. Only public and protected members are inherited.

---

## Q16: Can static members be inherited?

**A:** No. Static members belong to the class, not objects. They are not inherited but can be accessed through class name.

---

## Q17: Are constructors inherited?

**A:** No. Constructors are not inherited. Child class must define its own constructor using `super()` to call parent constructor.

---

## Q18: What is an abstract class?

**A:** A class with abstract methods that cannot be instantiated. Child classes must implement abstract methods.

```java
abstract class Animal {
    abstract void sound();
}
```

---

## Q19: What is an interface?

**A:** A blueprint for classes. All methods are abstract. Implemented using `implements` keyword.

```java
interface Animal {
    void sound();
    void eat();
}
```

---

## Q20: What is the difference between abstract class and interface?

**A:**
- **Abstract Class**: Can have methods with body + abstract methods
- **Interface**: All methods are abstract (no body)

---

## Q21: Can a class be `final`?

**A:** Yes. A `final` class cannot be inherited.

```java
final class Parent {  // Cannot be extended
}
```

---

## Q22: Can a method be `final`?

**A:** Yes. A `final` method cannot be overridden.

```java
class Parent {
    final void method() {  // Cannot override
    }
}
```

---

## Q23: What is the purpose of getters and setters?

**A:** Getters read values, setters modify values. They provide controlled access to private variables.

```java
public int getAge() { return age; }
public void setAge(int a) { age = a; }
```

---

## Q24: Why use OOP?

**A:**
- Code reusability
- Better organization
- Easy maintenance
- Real-world modeling
- Secure data

---

## Q25: What are the 4 pillars of OOP?

**A:**
1. **Inheritance**: Reuse code from parent class
2. **Polymorphism**: Same name, different behavior
3. **Abstraction**: Hide implementation details
4. **Encapsulation**: Protect data with getters/setters

---
