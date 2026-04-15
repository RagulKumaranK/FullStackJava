# Inheritance - Types & Rules

---

## Types of Inheritance

### 1. Single Inheritance
One child from one parent.

```java
class Animal {
    void eat() { }
}

class Dog extends Animal {
}
```

---

### 2. Multi-Level Inheritance
Chain of inheritance: GrandParent → Parent → Child

```java
class Animal {
    void eat() { }
}

class Dog extends Animal {
}

class Puppy extends Dog {
}
```

---

### 3. Hierarchical Inheritance
Multiple children from one parent.

```java
class Animal {
    void eat() { }
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class Bird extends Animal {
}
```

---

## Inheritance Rules

| Rule | Details |
|------|---------|
| **Private** | ❌ NOT inherited |
| **Static** | ❌ NOT inherited |
| **Constructor** | ❌ NOT inherited (use `super()`) |
| **Final Class** | ❌ Cannot inherit |
| **Final Method** | ❌ Cannot override |
| **Public/Protected** | ✅ Inherited |

---

## Quick Code Example

```java
class Parent {
    public void method1() { }      // ✅ Inherited
    private void method2() { }     // ❌ NOT inherited
    static void method3() { }      // ❌ NOT inherited
    final void method4() { }       // ✅ Inherited (cannot override)
    
    Parent(String name) {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child(String name) {
        super(name);  // Call parent constructor
    }
    
    public void method1() {
        System.out.println("Overridden");  // ✅ Can override
    }
    
    // ❌ Cannot override method2 (private)
    // ❌ Cannot override method3 (static)
    // ❌ Cannot override method4 (final)
}
```

---
