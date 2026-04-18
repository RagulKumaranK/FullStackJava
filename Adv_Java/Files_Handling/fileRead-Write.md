# 📁 Java File Handling — Simple Notes

---

## 🤔 File Handling nu enna?

Java la **file create panrom, write panrom, read panrom** — adhu thaan file handling.

> 🧠 **Think:** Notepad la type panrom, save panrom, open panrom — same concept, but code la!

---

## 1️⃣ File Write — File la Ezhudu

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt"); // File create aagum
            fw.write("Hello Bro! Naan file la ezhudhinen!"); // Write panrom
            fw.close(); // ⚠️ Always close pannanum!
            System.out.println("Write successful!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

**Output:**
```
Write successful!
```
> 📁 `test.txt` file create aagi, antha text ulla poidum!

---

## 2️⃣ File Read — File la Padhi

```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr); // Line by line padikum

            String line;
            while ((line = br.readLine()) != null) { // null = file end
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File illa bro!: " + e.getMessage());
        }
    }
}
```

**Output:**
```
Hello Bro! Naan file la ezhudhinen!
```

---

## 3️⃣ File Append — Existing File la Add Panrom

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // true = append mode ✅ | false or empty = overwrite ⚠️
            FileWriter fw = new FileWriter("test.txt", true);
            fw.write("\nNew line add panninen!");
            fw.close();
            System.out.println("Append successful!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

## 4️⃣ File Exist Check + Delete

```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("test.txt");

        if (f.exists()) {
            System.out.println("File iruku!");
            f.delete(); // Delete pannurom
            System.out.println("Deleted!");
        } else {
            System.out.println("File illa bro!");
        }
    }
}
```

---

## 5️⃣ New File Create — mkdir

```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("myFolder/test.txt");
        f.getParentFile().mkdirs(); // Folder create pannurom
        try {
            f.createNewFile();      // File create pannurom
            System.out.println("File created: " + f.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

## 6️⃣ try-with-resources — Auto Close ✅ (Best Practice)

> manually `close()` pannanum nu worry vendam — Java auto close pannurum!

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // try ends aana odanee auto close aagum ✅
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

> 💡 **Real projects la idha use panrom** — manual close pannama vitaa memory leak varum, idhu safe!

---

## ⚡ Class Quick Reference

| Class | Use |
|-------|-----|
| `FileWriter` | File la write panrom |
| `FileReader` | File la read panrom |
| `BufferedReader` | Line by line efficiently read panrom |
| `BufferedWriter` | Efficiently write panrom |
| `File` | File check, delete, create panrom |

---

## ⚠️ Common Mistakes

| Mistake | Fix |
|---------|-----|
| `close()` pannama vitaa | `try-with-resources` use pannu |
| File illa pothu read pannaa | `catch (IOException)` handle pannu |
| Append vs Overwrite confuse | `true` pass pannaa append, illana overwrite |
| Path wrong-a kudutaa | Absolute path or correct relative path kudu |

---

---

## 🎯 Interview Questions & Answers

---

**Q1. What is File Handling in Java?**

> Java la files create pannuradhu, write pannuradhu, read pannuradhu, delete pannuradhu — ithelam serthu File Handling nu solrom. `java.io` package use panrom.

---

**Q2. What is the difference between FileWriter and BufferedWriter?**

> - `FileWriter` → Direct-a file la write pannum — slow for large data
> - `BufferedWriter` → Data-ah buffer la store pannitu batch-a write pannum — fast & efficient
>
> Real projects la `BufferedWriter` preferred.

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt")); // ✅ Best
bw.write("Hello!");
bw.close();
```

---

**Q3. What is the difference between FileReader and BufferedReader?**

> - `FileReader` → Character by character read pannum — slow
> - `BufferedReader` → Line by line read pannum (`readLine()`) — fast & easy
>
> Always `BufferedReader` use panrom.

---

**Q4. How to append content to an existing file?**

> `FileWriter` la **second parameter true** pass pannanum.

```java
FileWriter fw = new FileWriter("test.txt", true); // true = append ✅
fw.write("\nNew content!");
fw.close();
```

> `true` illana → file overwrite aagum, previous content delete aagum ⚠️

---

**Q5. What is try-with-resources? Why use it?**

> Java 7+ la vandha feature. `try` block end aana odanee **auto-a close** pannurum.
> Manual-a `close()` pannanum nu worry vendam — memory leak avoid aagum.

```java
try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    System.out.println("Error!");
}
// br auto close aagum ✅
```

---

**Q6. What exception does File Handling throw?**

> `IOException` — checked exception, so **must handle** — try-catch or throws use pannanum.
> File illa pothu → `FileNotFoundException` (IOException subclass).

---

**Q7. How to check if a file exists in Java?**

```java
File f = new File("test.txt");
if (f.exists()) {
    System.out.println("File iruku!");
}
```

---

**Q8. How to delete a file in Java?**

```java
File f = new File("test.txt");
if (f.delete()) {
    System.out.println("Deleted!");
} else {
    System.out.println("Delete failed!");
}
```

---

**Q9. What is the difference between absolute path and relative path?**

> - **Absolute path** → Full path from root → `C:/Users/Bro/test.txt`
> - **Relative path** → Current project folder from → `test.txt` or `src/test.txt`
>
> Java projects la relative path use panrom mostly.

---

**Q10. What happens if we don't close a file?**

> - **Memory leak** varum — resources waste aagum
> - File locked aagum — other programs access pannala
> - Data loss vara chance irukku — buffer flush aagaama poidum
>
> Always `close()` pannu or `try-with-resources` use pannu ✅

---

## 🧠 One Line Summary

| Keyword | Enna |
|---------|------|
| `FileWriter` | File la write panrom |
| `FileReader` | File la read panrom |
| `BufferedReader` | Line by line read — fast |
| `File` | File operations — check, delete, create |
| `try-with-resources` | Auto close — best practice |
| `true` in FileWriter | Append mode |
| `IOException` | File handling exception — must catch |