# 📦 Java Collections Framework — Simple Notes

---

## 🤔 Collections nu enna?

Array fix size — 5 elements declare pannittom na 5 mattum thaan.
But real life la **dynamic-a elements add/remove** pannanum — adhukku Collections!

> 🧠 **Think:** Array = fixed size box | Collections = expandable bag 🎒

---

## 🗺️ Collections Hierarchy — Big Picture

```
Collection (Interface)
├── List (Interface)        → Ordered, Duplicates allowed
│   ├── ArrayList           ✅ Most used
│   ├── LinkedList
│   └── Vector
├── Set (Interface)         → No duplicates
│   ├── HashSet             ✅ Most used
│   ├── LinkedHashSet
│   └── TreeSet
└── Queue (Interface)       → FIFO order
    ├── PriorityQueue
    └── LinkedList

Map (Interface)             → Key-Value pairs
├── HashMap                 ✅ Most used
├── LinkedHashMap
└── TreeMap
```

---

---

## 1️⃣ ArrayList — Dynamic Array

> Ordered, Duplicates allowed, Index based access

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add
        list.add("Bro");
        list.add("Java");
        list.add("Python");
        list.add("Java");       // Duplicate allowed ✅

        // Get
        System.out.println(list.get(0));    // Bro

        // Size
        System.out.println(list.size());    // 4

        // Remove
        list.remove("Python");

        // Loop
        for (String s : list) {
            System.out.println(s);
        }

        // Contains
        System.out.println(list.contains("Java")); // true
    }
}
```

**Output:**
```
Bro
4
Bro
Java
Java
true
```

---

## 2️⃣ LinkedList — Chain Based List

> ArrayList maari thaan — but insert/delete fast. Index access slow.

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.addFirst("Start"); // First la add ✅
        list.addLast("End");    // Last la add ✅

        System.out.println(list);           // [Start, A, B, End]
        System.out.println(list.getFirst()); // Start
        System.out.println(list.getLast());  // End

        list.removeFirst();
        System.out.println(list);           // [A, B, End]
    }
}
```

---

## 3️⃣ HashSet — No Duplicates!

> Unordered, No duplicates, Fast lookup

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Bro");
        set.add("Java");
        set.add("Python");
        set.add("Java");    // Duplicate — ignored ✅

        System.out.println(set);            // [Java, Bro, Python] — order vary aagum
        System.out.println(set.size());     // 3 — duplicate count aagala
        System.out.println(set.contains("Bro")); // true
    }
}
```

---

## 4️⃣ LinkedHashSet — No Duplicates + Order Maintain

> HashSet maari — but insertion order maintain pannurum

```java
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Bro");
        set.add("Java");
        set.add("Python");
        set.add("Java");    // Duplicate — ignored

        System.out.println(set); // [Bro, Java, Python] — order maintained ✅
    }
}
```

---

## 5️⃣ TreeSet — Sorted Order

> No duplicates + Automatically sorted (A-Z or 1,2,3)

```java
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(10);    // Duplicate — ignored

        System.out.println(set); // [10, 30, 50] — sorted ✅
    }
}
```

---

## 6️⃣ HashMap — Key Value Pair

> Key-Value store, No duplicate keys, Unordered

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Put
        map.put("Bro", 25);
        map.put("Java", 30);
        map.put("Python", 28);
        map.put("Bro", 99); // Duplicate key — value overwrite aagum ✅

        // Get
        System.out.println(map.get("Bro"));     // 99

        // Check key/value
        System.out.println(map.containsKey("Java"));    // true
        System.out.println(map.containsValue(30));       // true

        // Size
        System.out.println(map.size());          // 3

        // Loop
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // Remove
        map.remove("Python");
    }
}
```

---

## 7️⃣ LinkedHashMap — Key Value + Order Maintain

```java
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Bro", 25);
        map.put("Java", 30);
        map.put("Python", 28);

        System.out.println(map); // {Bro=25, Java=30, Python=28} — order maintained ✅
    }
}
```

---

## 8️⃣ TreeMap — Sorted by Key

```java
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Zebra", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);

        System.out.println(map); // {Apple=2, Mango=3, Zebra=1} — key sorted ✅
    }
}
```

---

## ⚡ Collections Comparison Table

### List:

| | ArrayList | LinkedList |
|--|-----------|------------|
| **Access** | Fast (index) | Slow |
| **Insert/Delete** | Slow (middle) | Fast |
| **Use case** | Read heavy | Insert/Delete heavy |

### Set:

| | HashSet | LinkedHashSet | TreeSet |
|--|---------|---------------|---------|
| **Order** | No order | Insertion order | Sorted |
| **Duplicates** | ❌ | ❌ | ❌ |
| **Speed** | Fastest | Medium | Slow |

### Map:

| | HashMap | LinkedHashMap | TreeMap |
|--|---------|---------------|---------|
| **Order** | No order | Insertion order | Key sorted |
| **Duplicate Key** | ❌ | ❌ | ❌ |
| **Speed** | Fastest | Medium | Slow |

---

## 🔥 Useful Collections Methods

```java
import java.util.*;

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

Collections.sort(list);          // [1, 2, 5, 8, 9] — Sort
Collections.reverse(list);       // [9, 8, 5, 2, 1] — Reverse
Collections.shuffle(list);       // Random order — Shuffle
Collections.max(list);           // Max value
Collections.min(list);           // Min value
Collections.frequency(list, 5);  // Count of element
```

---

---

## 🎯 Interview Questions & Answers

---

**Q1. What is Collections Framework in Java?**

> Java la dynamic data store, retrieve, manipulate pannuradhukkு ready-made classes and interfaces kollection — adhu thaan Collections Framework. `java.util` package la irukku.

---

**Q2. What is the difference between Array and ArrayList?**

| | Array | ArrayList |
|--|-------|-----------|
| Size | Fixed | Dynamic |
| Type | Primitive + Object | Object only |
| Methods | No built-in | add, remove, contains etc |
| Performance | Fast | Slightly slow |

---

**Q3. What is the difference between ArrayList and LinkedList?**

> - `ArrayList` → Index based, random access fast, insert/delete middle-la slow
> - `LinkedList` → Chain based, insert/delete fast, random access slow
>
> Read heavy → ArrayList | Insert/Delete heavy → LinkedList

---

**Q4. What is the difference between HashSet, LinkedHashSet, and TreeSet?**

> - `HashSet` → No order, fastest, no duplicates
> - `LinkedHashSet` → Insertion order maintain, no duplicates
> - `TreeSet` → Automatically sorted, no duplicates, slowest
>
> Duplicate check mattum → HashSet | Order venuma → LinkedHashSet | Sorted venuma → TreeSet

---

**Q5. What is the difference between HashMap and Hashtable?**

| | HashMap | Hashtable |
|--|---------|-----------|
| Thread safe | ❌ No | ✅ Yes |
| Null key | ✅ 1 allowed | ❌ Not allowed |
| Speed | Fast | Slow |
| Use | Single thread | Multi thread (old) |

> Modern code la HashMap use panrom. Hashtable outdated.

---

**Q6. Can HashMap have duplicate keys?**

> Illa — duplicate key add pannumbo **value overwrite** aagum. Keys unique, values duplicate allowed.

```java
map.put("Bro", 25);
map.put("Bro", 99); // Value overwrite — key same
System.out.println(map.get("Bro")); // 99
```

---

**Q7. What is the difference between HashMap and LinkedHashMap?**

> - `HashMap` → No order guaranteed
> - `LinkedHashMap` → Insertion order maintain pannurum
>
> Order matter pannadhey → HashMap | Order matter pannuthu → LinkedHashMap

---

**Q8. How to iterate a HashMap?**

```java
// Method 1 — keySet()
for (String key : map.keySet()) {
    System.out.println(key + " = " + map.get(key));
}

// Method 2 — entrySet() ✅ Best practice
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

---

**Q9. What is the difference between List and Set?**

| | List | Set |
|--|------|-----|
| Duplicates | ✅ Allowed | ❌ Not allowed |
| Order | Maintained | Not guaranteed |
| Index access | ✅ Yes | ❌ No |

---

**Q10. What is Collections class? (not Collection interface)**

> `Collections` (with s) → Utility class with static helper methods.
> `Collection` (without s) → Interface — List, Set, Queue extend pannurum.

```java
Collections.sort(list);    // Sort
Collections.max(list);     // Max
Collections.reverse(list); // Reverse
```

---

**Q11. When to use which Collection?**

| Situation | Use |
|-----------|-----|
| Order + Duplicates venuma | `ArrayList` |
| Fast insert/delete | `LinkedList` |
| Duplicates vendam | `HashSet` |
| Duplicates vendam + Order | `LinkedHashSet` |
| Duplicates vendam + Sorted | `TreeSet` |
| Key-Value, order matter illa | `HashMap` |
| Key-Value + Order | `LinkedHashMap` |
| Key-Value + Sorted keys | `TreeMap` |

---

## 🧠 One Line Summary

| Collection | Enna |
|------------|------|
| `ArrayList` | Dynamic array — most used list |
| `LinkedList` | Chain — insert/delete fast |
| `HashSet` | No duplicates — no order |
| `LinkedHashSet` | No duplicates — insertion order |
| `TreeSet` | No duplicates — sorted |
| `HashMap` | Key-Value — no order |
| `LinkedHashMap` | Key-Value — insertion order |
| `TreeMap` | Key-Value — key sorted |