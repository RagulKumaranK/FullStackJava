# ☕ Java Lambda Expressions — Complete Notes

---

## 📌 Definition

A **lambda expression** is an **anonymous function** used to provide implementation for a **Functional Interface** (an interface with exactly one abstract method).

> 💡 **Simple Idea (Tamil):**
> Lambda na — Class create pannama, direct-a logic ezhudradhu!
> Instead of writing a full class or anonymous class, just write the logic directly.

---

## 🔹 Syntax

```java
(parameters) -> expression
```

Or with a block body:

```java
(parameters) -> {
    // multiple statements
    return value;
}
```

---

## 🔹 Example

```java
interface Add {
    int sum(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        Add obj = (a, b) -> a + b;
        System.out.println(obj.sum(2, 3)); // 5
    }
}
```

**Output:**
```
5
```

---

## 🔹 Lambda vs Anonymous Inner Class

```java
// ❌ Old way — Anonymous Inner Class (verbose)
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Running...");
    }
};

// ✅ New way — Lambda (clean & short)
Runnable r2 = () -> System.out.println("Running...");
```

Same result, much less code!

---

## 🔹 Key Points

- ✔ Works **only** with Functional Interface
- ✔ Reduces boilerplate code
- ✔ Replaces anonymous inner class
- ✔ Improves readability
- ✔ Introduced in **Java 8**
- ✔ Can access `final` or effectively final local variables (closure)

---

## 🔹 Use Cases

### 1. Collections — `forEach`

```java
List<String> names = Arrays.asList("Ram", "Sam", "Raj");
names.forEach(name -> System.out.println(name));
```

**Output:**
```
Ram
Sam
Raj
```

---

### 2. Sorting

```java
List<Integer> nums = Arrays.asList(5, 2, 8, 1);
Collections.sort(nums, (a, b) -> a - b);
System.out.println(nums); // [1, 2, 5, 8]
```

---

### 3. Threads — `Runnable`

```java
Thread t = new Thread(() -> System.out.println("Thread running!"));
t.start();
```

---

### 4. Stream API

```java
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
nums.stream()
    .filter(n -> n % 2 == 0)
    .forEach(n -> System.out.println(n));
```

**Output:**
```
2
4
```

---

## 🔹 Syntax Variations

| Scenario | Syntax |
|---|---|
| No parameter | `() -> expression` |
| One parameter | `x -> expression` |
| Multiple parameters | `(x, y) -> expression` |
| Multiple statements | `(x, y) -> { stmt1; return stmt2; }` |
| With type declaration | `(int x, int y) -> x + y` |

```java
// No parameter
Runnable r = () -> System.out.println("Hello");

// One parameter (parentheses optional)
Consumer<String> c = name -> System.out.println(name);

// Multiple parameters
Comparator<Integer> comp = (a, b) -> a - b;

// Block body with return
Add obj = (a, b) -> {
    int result = a + b;
    return result;
};
```

---

## 🔥 Quick Summary

| Feature | Lambda |
|---|---|
| Introduced in | Java 8 |
| Works with | Functional Interface only |
| Has a name? | ❌ No (anonymous) |
| Has a class? | ❌ No |
| Replaces | Anonymous Inner Class |
| Can access local variables? | ✅ Only `final` / effectively final |

---

## 🎯 Interview Questions & Answers

---

### Q1. What is a Lambda Expression in Java?

**Answer:**
A lambda expression is an anonymous function introduced in **Java 8**. It provides a concise way to implement a **functional interface** without writing a full class or anonymous inner class.

```java
// Without lambda
Runnable r = new Runnable() {
    public void run() { System.out.println("Hi"); }
};

// With lambda
Runnable r = () -> System.out.println("Hi");
```

---

### Q2. What is a Functional Interface? Name some built-in ones.

**Answer:**
A **Functional Interface** is an interface with **exactly one abstract method**. Lambda expressions can only be used with functional interfaces.

The `@FunctionalInterface` annotation is optional but recommended.

```java
@FunctionalInterface
interface MyFunc {
    void doSomething();
}
```

**Built-in Functional Interfaces (java.util.function):**

| Interface | Method | Description |
|---|---|---|
| `Runnable` | `run()` | No input, no output |
| `Callable<V>` | `call()` | No input, returns value |
| `Predicate<T>` | `test(T t)` | Takes input, returns boolean |
| `Function<T,R>` | `apply(T t)` | Takes input, returns output |
| `Consumer<T>` | `accept(T t)` | Takes input, no output |
| `Supplier<T>` | `get()` | No input, returns output |
| `Comparator<T>` | `compare(T a, T b)` | Compares two objects |

---

### Q3. Can a lambda expression access variables from the enclosing scope?

**Answer:**
Yes, but only **final or effectively final** local variables. A variable is "effectively final" if it is never reassigned after initialization.

```java
int x = 10; // effectively final
Runnable r = () -> System.out.println(x); // ✅ OK

int y = 10;
y = 20; // reassigned — NOT effectively final
Runnable r2 = () -> System.out.println(y); // ❌ Compile error
```

---

### Q4. What is the difference between Lambda and Anonymous Inner Class?

**Answer:**

| Feature | Anonymous Inner Class | Lambda |
|---|---|---|
| Syntax | Verbose | Concise |
| Works with | Any interface/class | Functional Interface only |
| Has `this` keyword? | Refers to inner class itself | Refers to enclosing class |
| Can have state (fields)? | ✅ Yes | ❌ No |
| Performance | Slightly heavier | Lighter (invokedynamic) |
| Java version | All versions | Java 8+ only |

---

### Q5. What does `this` refer to inside a Lambda?

**Answer:**
Inside a lambda, `this` refers to the **enclosing class instance** — NOT the lambda itself. This is different from an anonymous inner class where `this` refers to the anonymous class itself.

```java
class Test {
    String name = "Outer";

    void demo() {
        Runnable r = () -> System.out.println(this.name); // "Outer"
        r.run();
    }
}
```

---

### Q6. Can a Lambda throw a checked exception?

**Answer:**
Only if the **functional interface's method declares** that exception. If the method doesn't declare it, the lambda cannot throw a checked exception.

```java
@FunctionalInterface
interface MyFunc {
    void execute() throws Exception; // declared
}

MyFunc f = () -> { throw new Exception("Error"); }; // ✅ OK
```

---

### Q7. What is a Method Reference? How is it related to Lambda?

**Answer:**
A **method reference** is a shorthand for a lambda that simply calls an existing method. It uses the `::` operator.

```java
// Lambda
names.forEach(name -> System.out.println(name));

// Method Reference (shorter)
names.forEach(System.out::println);
```

**Types of Method References:**

| Type | Syntax | Example |
|---|---|---|
| Static method | `ClassName::staticMethod` | `Math::abs` |
| Instance method (specific object) | `object::instanceMethod` | `str::toUpperCase` |
| Instance method (arbitrary object) | `ClassName::instanceMethod` | `String::toLowerCase` |
| Constructor | `ClassName::new` | `ArrayList::new` |

---

### Q8. What is the difference between `Predicate`, `Function`, and `Consumer`?

**Answer:**

```java
// Predicate<T> — takes input, returns boolean
Predicate<Integer> isEven = n -> n % 2 == 0;
System.out.println(isEven.test(4)); // true

// Function<T, R> — takes input, returns output
Function<String, Integer> length = str -> str.length();
System.out.println(length.apply("Hello")); // 5

// Consumer<T> — takes input, returns nothing
Consumer<String> print = str -> System.out.println(str);
print.accept("Hello"); // Hello
```

---

### Q9. Can we use Lambda with interfaces that have default or static methods?

**Answer:**
Yes! A functional interface **can have** default and static methods — as long as it has only **one abstract method**. Lambda only implements the abstract method.

```java
@FunctionalInterface
interface MyInterface {
    void abstractMethod();       // only one abstract method

    default void defaultMethod() {
        System.out.println("Default");
    }

    static void staticMethod() {
        System.out.println("Static");
    }
}

MyInterface obj = () -> System.out.println("Lambda!");
obj.abstractMethod(); // Lambda!
obj.defaultMethod();  // Default
```

---

### Q10. Where exactly is Lambda used in real projects?

**Answer:**
Lambda expressions are used heavily in:

1. **Stream API** — filtering, mapping, reducing collections
2. **Event Handling** — button clicks, listeners
3. **Multithreading** — passing `Runnable` to Thread or ExecutorService
4. **Sorting** — custom Comparators
5. **Optional** — `map()`, `filter()`, `ifPresent()`
6. **Spring Framework** — security configs, routing in Spring WebFlux

```java
// Real example: filter + transform a list
List<String> names = Arrays.asList("Ram", "Sam", "Raj", "Tom");

List<String> result = names.stream()
    .filter(name -> name.startsWith("R"))  // filter
    .map(name -> name.toUpperCase())        // transform
    .collect(Collectors.toList());

System.out.println(result); // [RAM, RAJ]
```

---

### Bonus Tip 💡

> **Q: What is the difference between Lambda and Stream API?**
>
> Lambda and Streams are **different but work together**.
> - **Lambda** = how you write logic (short anonymous function)
> - **Stream API** = a pipeline to process collections
>
> Lambda is used *inside* Stream operations like `filter()`, `map()`, `forEach()`.

