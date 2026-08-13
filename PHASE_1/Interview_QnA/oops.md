# Question 1

**What is the difference between a class and an object in Java? And when you write `Dog myDog = new Dog();`, walk me through what's happening at each part of that line — where does `myDog` live, and where does the actual object live?**

## My Answer

Class is a blueprint or a template of an object and also class where in the metaspaces, object is a instance of a class and it store in heap.

## What's Missing / Imprecise

You didn't mention where `myDog` itself lives. In `Dog myDog = new Dog();`, there are actually three things happening:

1. `Dog` — the class definition, already loaded into Metaspace by the JVM's classloader.
2. `new Dog()` — allocates a new `Dog` object on the heap, runs the constructor, and returns a reference (essentially a pointer/address) to that memory location.
3. `myDog` — a local variable that lives on the stack (since it's a local variable in a method), and it stores the reference (address) to the heap object — not the object itself.

## Interview-Ready Phrasing

> A class is a blueprint that defines the structure and behavior objects will have — it's metadata, stored in the Metaspace. An object is a runtime instance of that class, allocated on the heap. In `Dog myDog = new Dog()`, `new Dog()` allocates memory on the heap for the object and returns a reference to it; `myDog` is a local variable on the stack that holds that reference, not the object itself.

# Question 2

**What is the difference between a class and an object in Java? And when you write `Dog myDog = new Dog();`, walk me through what's happening at each part of that line — where does `myDog` live, and where does the actual object live?**

## My Answers

Class is a blueprint or a template of an object and also class where in the metaspaces, object is a instance of a class and it store in heap.

## What's Missing / Imprecise

You didn't mention where `myDog` itself lives. In `Dog myDog = new Dog();`, there are actually three things happening:

1. `Dog` — the class definition, already loaded into Metaspace by the JVM's classloader.
2. `new Dog()` — allocates a new `Dog` object on the heap, runs the constructor, and returns a reference (essentially a pointer/address) to that memory location.
3. `myDog` — a local variable that lives on the stack (since it's a local variable in a method), and it stores the reference (address) to the heap object — not the object itself.

## Interview-Ready Phrasing

> A class is a blueprint that defines the structure and behavior objects will have — it's metadata, stored in the Metaspace. An object is a runtime instance of that class, allocated on the heap. In `Dog myDog = new Dog()`, `new Dog()` allocates memory on the heap for the object and returns a reference to it; `myDog` is a local variable on the stack that holds that reference, not the object itself.