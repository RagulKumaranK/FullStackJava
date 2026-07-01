# ☕ Java Exception Handling — Simple Notes

---

## 1️⃣ try-catch-finally

### 🧠 Simple Idea:
- `try` → Problem vara koodiya code idha podu
- `catch` → Problem vara → idha vandhu handle pannu
- `finally` → Exception vara vara → **always** run aagum

---

### 📌 Basic Example:

```java
try {
    int a = 10 / 0;                          // ❌ Problem line
} catch (ArithmeticException e) {
    System.out.println("Zero divide error!"); // ✅ Idhu run aagum
} finally {
    System.out.println("Always run aaveen!"); // ✅ Idhu always run aagum
}
```

**Output:**
```
Zero divide error!
Always run aaveen!
```

---

### 📌 Multiple catch Example:

```java
try {
    int[] arr = new int[3];
    arr[10] = 5;                                          // ❌ Array limit exceed
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array limit exceed pannite!");    // ✅ Idhu catch aagum
} catch (ArithmeticException e) {
    System.out.println("Math error!");
} finally {
    System.out.println("Cleanup done.");                  // ✅ Always run
}
```

**Output:**
```
Array limit exceed pannite!
Cleanup done.
```

---

### ⚠️ finally — எப்பவும் run aagum (Even if no exception!)

```java
try {
    System.out.println("No problem here!"); // ✅ Normal run
} catch (Exception e) {
    System.out.println("Caught!");
} finally {
    System.out.println("Still runs!");      // ✅ Idhu always run aagum
}
```

**Output:**
```
No problem here!
Still runs!
```

> 💡 **finally use case:** DB connection close, File close — cleanup work

---

---

## 2️⃣ throw vs throws

---

### 🧠 Simple Idea:
- `throw` → Nee **manually** exception create panre (trigger panre)
- `throws` → Method "naan handle pannala, caller nee paarru" nu **warn** panre

---

### 📌 throw — Manual Exception Trigger:

```java
static void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("18 below not allowed!"); // Nee throw panre
    }
    System.out.println("Welcome!");
}

public static void main(String[] args) {
    checkAge(15); // ❌ Exception vara poidum
}
```

**Output:**
```
Exception in thread "main" java.lang.ArithmeticException: 18 below not allowed!
```

---

### 📌 throws — Caller ku Responsibility Pass:

```java
static void readFile() throws Exception {   // "Naan handle pannala" nu solre
    throw new Exception("File not found!"); // Exception create panre
}

public static void main(String[] args) {
    try {
        readFile();                          // Caller handle pannanum
    } catch (Exception e) {
        System.out.println(e.getMessage()); // ✅ "File not found!"
    }
}
```

**Output:**
```
File not found!
```

---

### 🔑 throw vs throws — Simple Table:

| | `throw` | `throws` |
|---|---------|---------|
| **Edha use** | Method **body** la | Method **header** la |
| **Enna pannum** | Exception trigger pannum | Caller ku warn pannum |
| **Eppadi** | `throw new Exception()` | `void m() throws Exception` |
| **Etha mattum** | One exception mattum | Multiple exceptions possible |

---

### 📌 Both Together — Real Example:

```java
// throws — header la
static void withdraw(double amount) throws Exception {
    if (amount > 1000) {
        throw new Exception("Balance illa!"); // throw — body la
    }
    System.out.println("Withdrawal: " + amount);
}

public static void main(String[] args) {
    try {
        withdraw(5000); // ❌ Balance illa
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage()); // ✅ Catch aagum
    }
}
```

**Output:**
```
Error: Balance illa!
```

---

---

## 🎯 Interview Questions & Answers

---

**Q1. What is an Exception in Java?**

> Program run aagum pothu unexpected-a vara oru problem/error.
> Example: Zero la divide pannumbo → `ArithmeticException`

---

**Q2. What is the difference between try-catch and finally?**

> - `try-catch` → Exception handle pannurom
> - `finally` → Exception vara vara always run aagum — cleanup work ku use panrom (DB close, file close)

---

**Q3. Can we have try without catch?**

> Aama — `try-finally` possible. But `try` alone not possible.

```java
try {
    int a = 10 / 2;
} finally {
    System.out.println("Always runs!"); // ✅ Valid
}
```

---

**Q4. What is the difference between throw and throws?**

> - `throw` → Method body la manually exception trigger panrom
> - `throws` → Method header la declare panrom — caller ku handle pannanu solrom

---

**Q5. Can finally block be skipped?**

> Almost never. Only one case la skip aagum:
> `System.exit(0)` call pannumbo — JVM itself stop aagum, finally run aagaathu.

---

**Q6. What is Checked vs Unchecked Exception?**

> - **Checked** → Compile time la compiler warn pannum — must handle (`IOException`, `SQLException`)
> - **Unchecked** → Runtime la vara — optional handle (`NullPointerException`, `ArithmeticException`)

---

**Q7. Can we throw multiple exceptions?**

> `throw` — one exception mattum throw pannalam.
> But `throws` — multiple declare pannalam.

```java
void method() throws IOException, SQLException { // ✅ Multiple
    // ...
}
```

---

**Q8. What happens if exception is not caught?**

> Program crash aagum — JVM default handler exception message print pannum and program stop aagum.

---

**Q9. Can we write code after throw?**

> Illa — `throw` ku appuram irukka code **unreachable** — compiler error varum.

```java
throw new Exception("Error!");
System.out.println("Idhu run aagaathu"); // ❌ Unreachable code
```

---

**Q10. What is re-throwing an exception?**

> Catch pannitu, same exception-ah again throw pannurom — upper layer handle pannatum nu.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Caught here!");
    throw e; // ✅ Re-throw — upper layer ku pass
}
```

---

## ⚡ One Line Summary

| Keyword | Enna |
|---------|------|
| `try` | Risky code podu |
| `catch` | Exception handle pannu |
| `finally` | Always run — cleanup |
| `throw` | Manually exception trigger pannu |
| `throws` | Caller ku responsibility kudu |