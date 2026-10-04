# SDP-asik3 | Bridge pattern

# Cheremsha Bridge Pattern

## 1. Project Description

This project demonstrates the **Bridge Structural Design Pattern** in Java.

The topic is **Cheremsha dishes and cooking methods**.

The Bridge Pattern separates the abstraction from its implementation, allowing both parts to change independently.

## 2. Pattern Structure

* **Abstraction:** `CheremshaDish`
* **Refined Abstraction:** `CheremshaSalad`, `CheremshaSoup`
* **Implementor:** `MainCooking`
* **Concrete Implementors:** `TraditionalCooking`, `ModernCooking`
* **Client:** `Main`

```text
CheremshaDish
    |
    +-- CheremshaSalad
    +-- CheremshaSoup
    |
    +---- MainCooking
              |
              +-- TraditionalCooking
              +-- ModernCooking
```

`CheremshaDish` contains a reference to `MainCooking`. This reference is the bridge between the abstraction and implementation.

## 3. Runtime Switching

The implementation can be changed without changing the dish:

```java
CheremshaDish salad = new CheremshaSalad(traditional);

salad.prepare();

salad.setCooking(modern);

salad.prepare();
```

The same `CheremshaSalad` can use both `TraditionalCooking` and `ModernCooking`.

## 4. Clean Code

The project follows these principles:

1. **Single Responsibility** — each class has one main responsibility.
2. **Meaningful Names** — class names clearly describe their purpose.
3. **Separation of Responsibilities** — dishes and cooking methods are separated.
4. **No Duplicated Logic** — cooking logic is kept in Concrete Implementors.
5. **Easy Extension** — a new cooking method can be added without changing existing dish classes.

## 5. Conclusion

The project demonstrates how the Bridge Pattern separates **what is being prepared** from **how it is prepared**.

This makes the code flexible, reusable, and easier to extend.

