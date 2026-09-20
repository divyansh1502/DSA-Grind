# Java Set & Map — Complete Notes

> **Focus:** `Set`, `SortedSet`, `NavigableSet`, `HashSet`, `LinkedHashSet`, `TreeSet`, `Map`, `SortedMap`, `NavigableMap`, `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, `Properties`, `WeakHashMap`, `IdentityHashMap`, `EnumMap`, and `ConcurrentHashMap`.

---

# 1. Where Set and Map Fit in the Collections Framework

The Java Collections Framework contains interfaces and implementation classes that help us store and manipulate groups of objects.

A simplified hierarchy is:

```text
                         Iterable
                            │
                            ▼
                        Collection
                            │
          ┌─────────────────┼─────────────────┐
          │                 │                 │
         List              Set              Queue
          │                 │
   ArrayList          HashSet
   LinkedList         LinkedHashSet
   Vector                   │
   Stack              SortedSet
                           │
                     NavigableSet
                           │
                        TreeSet
```

`Map` is **NOT** a child of `Collection`.

```text
                         Map
                          │
          ┌───────────────┼────────────────┐
          │               │                │
       HashMap      LinkedHashMap       Hashtable
          │
      SortedMap
          │
     NavigableMap
          │
       TreeMap
```

Other important `Map` implementations:

```text
Map
│
├── HashMap
│
├── LinkedHashMap
│
├── SortedMap
│    └── NavigableMap
│         └── TreeMap
│
├── Hashtable
│    └── Properties
│
├── WeakHashMap
│
├── IdentityHashMap
│
├── EnumMap
│
└── ConcurrentHashMap
```

---

# 2. Iterator

`Iterator` is used to traverse elements of a collection.

```java
Iterator<E> iterator();
```

Hierarchy:

```text
Iterable
   │
   └── iterator()
          │
          ▼
       Iterator
          │
          ├── hasNext()
          ├── next()
          └── remove()
```

## 2.1 `iterator()`

Returns an iterator for traversing the collection.

```java
Set<String> set = new HashSet<>();

set.add("Java");
set.add("Spring");
set.add("SQL");

Iterator<String> itr = set.iterator();

while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

## 2.2 `hasNext()`

Checks whether another element exists.

```java
itr.hasNext();
```

Returns:

```text
true  → another element exists
false → no element remains
```

---

## 2.3 `next()`

Returns the next element.

```java
String value = itr.next();
```

If there is no next element:

```text
NoSuchElementException
```

---

## 2.4 `remove()`

Removes the last element returned by `next()`.

```java
Iterator<String> itr = set.iterator();

while (itr.hasNext()) {
    String value = itr.next();

    if (value.equals("Java")) {
        itr.remove();
    }
}
```

Do not directly modify the collection while iterating:

```java
for (String s : set) {
    set.remove(s);   // generally causes ConcurrentModificationException
}
```

Use:

```java
itr.remove();
```

instead.

---

# 3. Set Interface

`Set` represents a collection that:

* does not allow duplicate elements
* usually does not provide index-based access
* may or may not preserve ordering depending on implementation

```java
Set<String> set = new HashSet<>();

set.add("Java");
set.add("Java");
set.add("Spring");
```

Result:

```text
Java
Spring
```

The second `"Java"` is rejected.

---

# 4. Set Hierarchy

```text
                    Set
                     │
          ┌──────────┴──────────┐
          │                     │
      HashSet              SortedSet
          │                     │
          │               NavigableSet
          │                     │
   LinkedHashSet              TreeSet
```

Important distinction:

```text
Set
│
├── HashSet
│     └── Hash-based storage
│
├── LinkedHashSet
│     └── Hash + linked structure
│
└── SortedSet
      └── sorted elements
           │
           └── NavigableSet
                │
                └── TreeSet
```

---

# 5. Set Methods

Since `Set` extends `Collection`, it inherits all important `Collection` methods.

## 5.1 `add(E e)`

Adds an element.

```java
set.add("Java");
```

Returns:

```text
true  → element was added
false → element already existed
```

Example:

```java
Set<Integer> set = new HashSet<>();

System.out.println(set.add(10)); // true
System.out.println(set.add(10)); // false
```

---

# 6. `addAll(Collection<? extends E>)`

Adds all elements from another collection.

```java
Set<Integer> a = new HashSet<>();
Set<Integer> b = new HashSet<>();

a.add(10);
a.add(20);

b.add(20);
b.add(30);

a.addAll(b);
```

Result:

```text
[10, 20, 30]
```

Duplicates are automatically eliminated.

---

# 7. `remove(Object o)`

Removes an element.

```java
set.remove(10);
```

Returns:

```text
true  → removed
false → element wasn't present
```

---

# 8. `contains(Object o)`

Checks whether an element exists.

```java
set.contains("Java");
```

Returns:

```text
true / false
```

---

# 9. `size()`

Returns number of elements.

```java
set.size();
```

---

# 10. `isEmpty()`

Checks whether the set contains no elements.

```java
set.isEmpty();
```

---

# 11. `clear()`

Removes everything.

```java
set.clear();
```

---

# 12. `containsAll(Collection<?>)`

Checks whether the current set contains every element of another collection.

```java
set.containsAll(otherSet);
```

---

# 13. `removeAll(Collection<?>)`

Removes elements that are present in another collection.

```java
set.removeAll(otherSet);
```

Conceptually:

```text
A = {1,2,3,4}
B = {3,4,5}

A.removeAll(B)

A = {1,2}
```

---

# 14. `retainAll(Collection<?>)`

Keeps only elements common to both collections.

```java
A.retainAll(B);
```

Example:

```text
A = {1,2,3,4}
B = {3,4,5}

A.retainAll(B)

A = {3,4}
```

This is essentially an intersection operation.

---

# 15. `removeIf(Predicate)`

Removes elements satisfying a condition.

```java
set.removeIf(x -> x.startsWith("J"));
```

Example:

```java
Set<Integer> numbers =
    new HashSet<>(List.of(10, 15, 20, 25));

numbers.removeIf(n -> n > 20);
```

Result:

```text
[10,15,20]
```

---

# 16. `toArray()`

Converts collection into an array.

```java
Object[] arr = set.toArray();
```

Generic form:

```java
String[] arr = set.toArray(new String[0]);
```

Modern preferred form:

```java
String[] arr = set.toArray(String[]::new);
```

---

# 17. `forEach()`

Inherited from `Iterable`.

```java
set.forEach(System.out::println);
```

or:

```java
set.forEach(x -> System.out.println(x));
```

---

# 18. SortedSet

`SortedSet` extends `Set`.

```text
Set
 │
 └── SortedSet
```

Its purpose is to maintain elements in sorted order.

Example:

```java
SortedSet<Integer> set = new TreeSet<>();

set.add(50);
set.add(10);
set.add(30);
```

Output:

```text
10
30
50
```

---

# 19. SortedSet Important Methods

## `comparator()`

Returns the comparator used for ordering.

```java
set.comparator();
```

If natural ordering is used:

```text
null
```

---

## `first()`

Returns the first/smallest element.

```java
set.first();
```

---

## `last()`

Returns the last/largest element.

```java
set.last();
```

---

## `headSet(E toElement)`

Returns elements smaller than the specified element.

```java
SortedSet<Integer> set =
    new TreeSet<>(List.of(10,20,30,40,50));

set.headSet(40);
```

Result:

```text
[10,20,30]
```

---

## `tailSet(E fromElement)`

Returns elements greater than or equal to the specified element.

```java
set.tailSet(30);
```

Result:

```text
[30,40,50]
```

---

## `subSet(E fromElement, E toElement)`

Returns:

```text
[fromElement, toElement)
```

Example:

```java
set.subSet(20, 50);
```

Result:

```text
[20,30,40]
```

`50` is excluded.

---

# 20. NavigableSet

`NavigableSet` extends `SortedSet`.

```text
Set
 │
 └── SortedSet
       │
       └── NavigableSet
```

It adds navigation methods such as:

```text
lower
floor
ceiling
higher
pollFirst
pollLast
descendingSet
descendingIterator
```

---

# 21. `lower(E e)`

Returns the greatest element strictly smaller than `e`.

```java
set.lower(30);
```

If:

```text
10 20 30 40
```

Result:

```text
20
```

---

# 22. `floor(E e)`

Returns the greatest element less than or equal to `e`.

```java
set.floor(30);
```

Result:

```text
30
```

If `30` does not exist:

```text
floor(35) → 30
```

---

# 23. `ceiling(E e)`

Returns the smallest element greater than or equal to `e`.

```java
set.ceiling(30);
```

Result:

```text
30
```

If `30` does not exist:

```text
ceiling(35) → 40
```

---

# 24. `higher(E e)`

Returns the smallest element strictly greater than `e`.

```java
set.higher(30);
```

Result:

```text
40
```

---

# 25. Navigation Memory Trick

```text
lower   → <
floor   → <=

ceiling → >=
higher  → >
```

Remember:

```text
LOWER  = <
FLOOR  = <=

CEILING = >=
HIGHER  = >
```

---

# 26. `pollFirst()`

Returns and removes the first element.

```java
set.pollFirst();
```

---

# 27. `pollLast()`

Returns and removes the last element.

```java
set.pollLast();
```

---

# 28. `descendingSet()`

Returns a reverse-order view.

```java
NavigableSet<Integer> set =
    new TreeSet<>(List.of(10,20,30));

System.out.println(set.descendingSet());
```

Output:

```text
[30,20,10]
```

---

# 29. `descendingIterator()`

Traverses the set in reverse order.

```java
Iterator<Integer> itr =
    set.descendingIterator();
```

---

# 30. HashSet

`HashSet` is the most commonly used general-purpose `Set`.

```text
HashSet
   │
   └── hash-based storage
```

Properties:

| Property         | HashSet             |
| ---------------- | ------------------- |
| Duplicates       | No                  |
| Ordering         | No guaranteed order |
| Null             | One null allowed    |
| Average add      | O(1)                |
| Average remove   | O(1)                |
| Average contains | O(1)                |
| Thread-safe      | No                  |

Example:

```java
Set<Integer> set = new HashSet<>();

set.add(30);
set.add(10);
set.add(20);
set.add(10);
```

Duplicates disappear.

---

# 31. How HashSet Works Internally

Conceptually:

```text
HashSet
   │
   ▼
HashMap
   │
   ▼
Hash table
```

When you do:

```java
set.add("Java");
```

Internally, the implementation uses hashing to determine where the element belongs.

Conceptually:

```text
hashCode()
    ↓
hash spreading
    ↓
bucket index
    ↓
bucket
    ↓
equals() if necessary
```

For custom objects:

```java
@Override
public int hashCode() {
    ...
}

@Override
public boolean equals(Object obj) {
    ...
}
```

`equals()` and `hashCode()` must follow their contract.

---

# 32. LinkedHashSet

`LinkedHashSet` extends `HashSet`.

Its major difference is ordering.

```text
HashSet
   │
   └── LinkedHashSet
```

It maintains insertion order.

```java
Set<Integer> set = new LinkedHashSet<>();

set.add(30);
set.add(10);
set.add(20);
```

Iteration:

```text
30
10
20
```

Properties:

| Property           | LinkedHashSet   |
| ------------------ | --------------- |
| Duplicate          | No              |
| Ordering           | Insertion order |
| Null               | One null        |
| Average operations | O(1)            |
| Thread-safe        | No              |

Internally it combines hashing with linked-entry information.

---

# 33. TreeSet

`TreeSet` implements `NavigableSet`.

```text
Set
 │
 └── SortedSet
       │
       └── NavigableSet
             │
             └── TreeSet
```

It stores elements according to ordering.

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(40);
set.add(10);
set.add(30);
set.add(20);
```

Result:

```text
[10,20,30,40]
```

Typically implemented using a balanced tree structure.

Properties:

| Property   | TreeSet                                       |
| ---------- | --------------------------------------------- |
| Duplicate  | No                                            |
| Ordering   | Sorted                                        |
| Null       | Generally not supported with natural ordering |
| add        | O(log n)                                      |
| remove     | O(log n)                                      |
| contains   | O(log n)                                      |
| Navigation | Yes                                           |

---

# 34. Natural Ordering vs Comparator

Natural ordering:

```java
TreeSet<Integer> set = new TreeSet<>();
```

Uses the element's `Comparable`.

Custom ordering:

```java
TreeSet<Integer> set =
    new TreeSet<>((a, b) -> b - a);
```

Now:

```text
40
30
20
10
```

---

# 35. Set Comparison

| Feature        | HashSet         | LinkedHashSet | TreeSet       |
| -------------- | --------------- | ------------- | ------------- |
| Duplicate      | No              | No            | No            |
| Order          | None guaranteed | Insertion     | Sorted        |
| Data structure | Hash table      | Hash + links  | Balanced tree |
| Average add    | O(1)            | O(1)          | O(log n)      |
| Null           | One             | One           | Usually no    |
| Navigation     | No              | No            | Yes           |

---

# 36. Map

A `Map` stores data as:

```text
Key → Value
```

Example:

```java
Map<Integer, String> students = new HashMap<>();

students.put(101, "Rahul");
students.put(102, "Aman");
```

Conceptually:

```text
101 → Rahul
102 → Aman
```

Keys must be unique.

Values may be duplicated.

---

# 37. Map Is Not Collection

Very important interview point:

```text
Collection
   │
   ├── List
   ├── Set
   └── Queue
```

but:

```text
Map
```

is a separate hierarchy.

Why?

Because a `Collection` represents individual elements:

```text
A
B
C
```

while a `Map` represents associations:

```text
A → 100
B → 200
C → 300
```

---

# 38. Map Hierarchy

```text
                         Map
                          │
       ┌──────────────────┼──────────────────┐
       │                  │                  │
    HashMap          LinkedHashMap       Hashtable
       │                                     │
       │                                  Properties
       │
    SortedMap
       │
  NavigableMap
       │
    TreeMap

Other Map implementations:

Map
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
└── ConcurrentHashMap
```

---

# 39. Core Map Methods

## `put(K key, V value)`

Adds or replaces a mapping.

```java
map.put(1, "Java");
```

If the key already exists:

```java
map.put(1, "Spring");
```

the old value is replaced.

---

# 40. `get(Object key)`

Returns value associated with key.

```java
map.get(1);
```

If key doesn't exist:

```text
null
```

---

# 41. `getOrDefault()`

Returns mapped value or a default.

```java
map.getOrDefault(100, "Not Found");
```

---

# 42. `containsKey()`

Checks whether a key exists.

```java
map.containsKey(10);
```

---

# 43. `containsValue()`

Checks whether a value exists.

```java
map.containsValue("Java");
```

This can be slower than `containsKey()` for hash-based maps because values aren't used to directly locate buckets.

---

# 44. `remove(Object key)`

Removes mapping by key.

```java
map.remove(10);
```

---

# 45. `remove(Object key, Object value)`

Removes only if both match.

```java
map.remove(10, "Java");
```

---

# 46. `replace()`

```java
map.replace(10, "Spring");
```

Only replaces if key exists.

---

# 47. `replace(K key, V oldValue, V newValue)`

Conditional replacement.

```java
map.replace(
    10,
    "Java",
    "Spring"
);
```

---

# 48. `replaceAll()`

Changes every mapping using a function.

```java
map.replaceAll(
    (key, value) -> value.toUpperCase()
);
```

---

# 49. `putIfAbsent()`

Adds only if key isn't already mapped.

```java
map.putIfAbsent(10, "Java");
```

Very useful with concurrent programming.

---

# 50. `compute()`

Computes a value for a key.

```java
map.compute(
    "Java",
    (key, value) -> value == null
        ? "Beginner"
        : value + " Developer"
);
```

---

# 51. `computeIfAbsent()`

Computes a value only if absent.

```java
map.computeIfAbsent(
    "Java",
    key -> "Backend"
);
```

Very useful for grouping.

Example:

```java
Map<String, List<Integer>> map =
    new HashMap<>();

map.computeIfAbsent(
    "Java",
    k -> new ArrayList<>()
).add(100);
```

---

# 52. `computeIfPresent()`

Computes a new value only if key exists.

```java
map.computeIfPresent(
    "Java",
    (key, value) -> value + " Backend"
);
```

---

# 53. `merge()`

Useful for combining values.

Example frequency counting:

```java
Map<String, Integer> freq =
    new HashMap<>();

freq.merge("Java", 1, Integer::sum);
freq.merge("Java", 1, Integer::sum);
```

Result:

```text
Java → 2
```

---

# 54. `keySet()`

Returns a view of all keys.

```java
Set<Integer> keys = map.keySet();
```

Example:

```text
{101=Rahul, 102=Aman}

keySet()
→ [101,102]
```

---

# 55. `values()`

Returns a collection view of values.

```java
Collection<String> values =
    map.values();
```

---

# 56. `entrySet()`

Returns key-value mappings.

```java
Set<Map.Entry<Integer,String>>
    entries = map.entrySet();
```

Best way to iterate over both key and value:

```java
for (Map.Entry<Integer,String> entry
        : map.entrySet()) {

    System.out.println(
        entry.getKey() + " = "
        + entry.getValue()
    );
}
```

---

# 57. Map.Entry

`Map.Entry` represents one key-value pair.

Important methods:

```java
getKey()
getValue()
setValue()
```

Example:

```java
for (Map.Entry<Integer,String> entry
        : map.entrySet()) {

    System.out.println(entry.getKey());
    System.out.println(entry.getValue());
}
```

---

# 58. `clear()`

Removes all mappings.

```java
map.clear();
```

---

# 59. `size()`

Returns number of mappings.

```java
map.size();
```

---

# 60. `isEmpty()`

Checks whether map contains no mappings.

```java
map.isEmpty();
```

---

# 61. `forEach()`

```java
map.forEach(
    (key, value) ->
        System.out.println(key + " = " + value)
);
```

---

# 62. HashMap

`HashMap` is the most commonly used general-purpose Map.

Properties:

| Feature          | HashMap             |
| ---------------- | ------------------- |
| Duplicate keys   | No                  |
| Duplicate values | Yes                 |
| Ordering         | No guaranteed order |
| Null key         | One                 |
| Null values      | Multiple            |
| Average get      | O(1)                |
| Average put      | O(1)                |
| Thread-safe      | No                  |

Example:

```java
Map<Integer,String> map =
    new HashMap<>();

map.put(1, "Java");
map.put(2, "Spring");
map.put(1, "SQL");
```

Final:

```text
1 → SQL
2 → Spring
```

---

# 63. HashMap Internal Working

Conceptually:

```text
                 HashMap
                    │
                    ▼
                hash table
                    │
        ┌───────────┼───────────┐
        ▼           ▼           ▼
     bucket 0    bucket 1    bucket 2
                     │
                     ▼
                Entry nodes
                     │
               ┌─────┴─────┐
               │           │
             key         value
```

When:

```java
map.put(key, value);
```

conceptually:

```text
key
 ↓
hashCode()
 ↓
hash spreading
 ↓
bucket index
 ↓
bucket
 ↓
compare keys using equals()
 ↓
insert/update
```

Modern Java implementations can transform heavily-collided buckets into tree structures after certain thresholds.

---

# 64. LinkedHashMap

`LinkedHashMap` maintains predictable iteration order.

By default:

```text
Insertion order
```

Example:

```java
Map<Integer,String> map =
    new LinkedHashMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");
```

Iteration:

```text
3 → C
1 → A
2 → B
```

It can also be configured for access order:

```java
new LinkedHashMap<>(
    16,
    0.75f,
    true
);
```

This is useful for implementing LRU-style caches.

---

# 65. SortedMap

`SortedMap` maintains keys in sorted order.

```text
Map
 │
 └── SortedMap
```

Important methods:

```java
comparator()
firstKey()
lastKey()
headMap()
tailMap()
subMap()
```

---

# 66. `firstKey()`

Returns smallest key.

```java
map.firstKey();
```

---

# 67. `lastKey()`

Returns largest key.

```java
map.lastKey();
```

---

# 68. `headMap()`

Returns keys smaller than the specified key.

```java
map.headMap(50);
```

---

# 69. `tailMap()`

Returns keys greater than or equal to specified key.

```java
map.tailMap(50);
```

---

# 70. `subMap()`

Returns:

```text
[fromKey, toKey)
```

Example:

```java
map.subMap(20, 50);
```

---

# 71. NavigableMap

`NavigableMap` extends `SortedMap`.

```text
Map
 │
 └── SortedMap
       │
       └── NavigableMap
             │
             └── TreeMap
```

Navigation methods:

```text
lowerKey()
floorKey()
ceilingKey()
higherKey()

lowerEntry()
floorEntry()
ceilingEntry()
higherEntry()

firstEntry()
lastEntry()

pollFirstEntry()
pollLastEntry()

descendingMap()
descendingKeySet()
```

---

# 72. TreeMap

`TreeMap` is a sorted, navigable map.

```java
TreeMap<Integer,String> map =
    new TreeMap<>();

map.put(30, "C");
map.put(10, "A");
map.put(20, "B");
```

Iteration:

```text
10 → A
20 → B
30 → C
```

Complexity:

```text
put     → O(log n)
get     → O(log n)
remove  → O(log n)
```

---

# 73. TreeMap Navigation

Given:

```text
10, 20, 30, 40
```

```text
lowerKey(30)   → 20
floorKey(30)   → 30
ceilingKey(30) → 30
higherKey(30)  → 40
```

Same memory trick:

```text
lower   <
floor   <=

ceiling >=
higher  >
```

---

# 74. Hashtable

`Hashtable` is a legacy synchronized Map implementation.

```java
Hashtable<Integer,String> table =
    new Hashtable<>();
```

Important characteristics:

```text
Thread-safe
Synchronized
No null key
No null values
Legacy class
```

Example:

```java
table.put(1, "Java");
```

But:

```java
table.put(null, "Java");
```

throws:

```text
NullPointerException
```

and:

```java
table.put(1, null);
```

also throws:

```text
NullPointerException
```

---

# 75. Why Hashtable Is Rarely Preferred

Modern applications generally prefer:

```text
HashMap
```

for non-concurrent use and:

```text
ConcurrentHashMap
```

for concurrent use.

Reasons:

* Hashtable is legacy
* synchronization is coarse-grained
* unnecessary locking can reduce scalability
* ConcurrentHashMap provides better concurrency
* HashMap is simpler when thread safety isn't required

---

# 76. Properties

`Properties` is a subclass of `Hashtable`.

Hierarchy:

```text
Object
  │
  └── Dictionary
        │
        └── Hashtable
              │
              └── Properties
```

Therefore:

```java
Properties p =
    new Properties();
```

is a Map-like key-value structure.

It is commonly used for configuration.

Example:

```properties
db.url=jdbc:mysql://localhost:3306/hrms
db.username=root
db.password=secret
```

Java:

```java
Properties p = new Properties();

p.setProperty("db.url", "jdbc:mysql://...");
p.setProperty("db.username", "root");

String url =
    p.getProperty("db.url");
```

---

# 77. Why Properties Exists

`Properties` is designed primarily for configuration data.

Common examples:

```text
application.properties
database.properties
messages.properties
config.properties
```

Spring Boot heavily uses the `.properties` format.

Important methods:

```java
setProperty()
getProperty()
load()
store()
```

---

# 78. WeakHashMap

`WeakHashMap` is a special-purpose Map.

Its keys are held using weak references.

Conceptually:

```text
WeakHashMap

Key
 │
 └── weak reference
          │
          ▼
        Object
```

If a key is no longer strongly referenced elsewhere, the garbage collector may reclaim it.

After garbage collection, the corresponding mapping can disappear.

---

# 79. Why WeakHashMap Is Rarely Used

It is not a general replacement for `HashMap`.

It is useful only for specific memory-sensitive scenarios.

Typical idea:

```text
Object → metadata
```

where the metadata should disappear automatically when the object is no longer alive elsewhere.

Potential use cases:

* caches
* metadata associated with objects
* temporary associations
* memory-sensitive structures

But it requires understanding garbage collection and reference behavior.

---

# 80. IdentityHashMap

Normally Maps compare keys using:

```java
equals()
```

and hash-based implementations use:

```java
hashCode()
```

`IdentityHashMap` is different.

It compares keys using:

```java
==
```

rather than:

```java
equals()
```

Example:

```java
String a = new String("Java");
String b = new String("Java");
```

Normally:

```java
a.equals(b)
```

is:

```text
true
```

but:

```java
a == b
```

is:

```text
false
```

With `IdentityHashMap`:

```java
Map<String,Integer> map =
    new IdentityHashMap<>();

map.put(a, 1);
map.put(b, 2);
```

Both entries can exist because their object identities differ.

---

# 81. Where IdentityHashMap Is Used

It is useful when **object identity** matters instead of logical equality.

Examples include:

* graph algorithms involving object identity
* object graph traversal
* serialization-related algorithms
* tracking already-visited object instances
* deep-copy algorithms

Memory trick:

```text
HashMap
→ "Are these logically equal?"

IdentityHashMap
→ "Are these the exact same object?"
```

---

# 82. EnumMap

`EnumMap` is a Map implementation designed specifically for enum keys.

Example:

```java
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}
```

Then:

```java
EnumMap<Day, String> map =
    new EnumMap<>(Day.class);

map.put(Day.MONDAY, "Java");
map.put(Day.TUESDAY, "Spring");
```

---

# 83. Why EnumMap Does Not Use Normal Hashing

Enums have a very special property.

Every enum constant has an ordinal:

```java
enum Day {
    MONDAY,     // ordinal 0
    TUESDAY,    // ordinal 1
    WEDNESDAY   // ordinal 2
}
```

Conceptually:

```text
MONDAY    → 0
TUESDAY   → 1
WEDNESDAY → 2
```

Therefore `EnumMap` can internally use an array indexed by ordinal rather than a normal hash-table structure.

Conceptually:

```text
EnumMap

Array
 │
 ├── [0] → MONDAY value
 ├── [1] → TUESDAY value
 ├── [2] → WEDNESDAY value
 └── ...
```

This is why it can be extremely efficient.

---

# 84. Why EnumMap Is Memory Efficient

A general-purpose HashMap needs structures for:

```text
hashing
buckets
entries
hash values
links/tree nodes where applicable
```

EnumMap knows:

```text
The key belongs to one fixed enum type.
```

Therefore it can exploit the enum's ordinal positions.

Conceptually:

```text
EnumMap

key.ordinal()
     ↓
array index
     ↓
value
```

This avoids the normal hash-table machinery.

---

# 85. EnumMap Null Rules

Important:

```text
Null key → NOT allowed
```

because there is no enum constant representing `null`.

But:

```text
Null value → allowed
```

Example:

```java
map.put(Day.MONDAY, null);
```

is valid.

So remember:

```text
EnumMap
    null key   ❌
    null value ✅
```

---

# 86. EnumMap Iteration Order

`EnumMap` has a predictable iteration order.

Entries are returned in the natural order of enum constants.

Example:

```java
enum Priority {
    LOW,
    MEDIUM,
    HIGH
}
```

Even if inserted:

```java
map.put(Priority.HIGH, "H");
map.put(Priority.LOW, "L");
map.put(Priority.MEDIUM, "M");
```

iteration follows enum declaration order:

```text
LOW
MEDIUM
HIGH
```

So:

```text
EnumMap → enum declaration order
```

---

# 87. EnumMap Complexity

For typical operations:

```text
get    → O(1)
put    → O(1)
remove → O(1)
```

It is one of the best choices when:

```text
KEY TYPE = enum
```

---

# 88. ConcurrentHashMap

`ConcurrentHashMap` is designed for concurrent access.

```java
ConcurrentHashMap<String,Integer> map =
    new ConcurrentHashMap<>();
```

Multiple threads can operate on the map safely.

---

# 89. Why HashMap Is Not Thread-Safe

Suppose:

```text
Thread A
Thread B
Thread C
```

all modify the same `HashMap`.

Without synchronization, simultaneous modifications can cause race conditions and visibility problems.

Example:

```java
map.put("A", 100);
map.put("B", 200);
```

from different threads requires proper concurrency control.

---

# 90. Hashtable vs ConcurrentHashMap

Both provide thread-safe map operations, but their concurrency characteristics differ significantly.

```text
Hashtable
    ↓
legacy synchronization

ConcurrentHashMap
    ↓
modern concurrent design
```

`ConcurrentHashMap` is designed to allow much greater concurrent access.

---

# 91. ConcurrentHashMap Does Not Allow Null

Very important interview question:

```text
ConcurrentHashMap
```

does NOT allow:

```text
null key
null value
```

Why?

Because in concurrent code, `null` can create ambiguity.

For example:

```java
V value = map.get(key);
```

If `null` were allowed, then:

```text
null could mean:

1. key doesn't exist
2. key exists and value is null
```

ConcurrentHashMap avoids this ambiguity.

Therefore:

```text
null key   ❌
null value ❌
```

---

# 92. ConcurrentHashMap Atomic Operations

ConcurrentHashMap provides useful atomic methods such as:

```java
putIfAbsent()
compute()
computeIfAbsent()
computeIfPresent()
merge()
replace()
remove(key, value)
```

Example:

```java
map.putIfAbsent("Java", 1);
```

This operation is performed atomically.

---

# 93. ConcurrentHashMap and Iteration

Its iterators are designed for concurrent environments.

They are:

```text
weakly consistent
```

This means they do not generally throw:

```text
ConcurrentModificationException
```

just because another thread modifies the map during iteration.

However, the iterator does not represent a frozen snapshot.

It may reflect some modifications occurring during iteration.

---

# 94. ConcurrentHashMap Internal Idea

Modern Java uses a sophisticated concurrent hash-table design.

Conceptually:

```text
ConcurrentHashMap
        │
        ▼
   hash table
        │
 ┌──────┼───────┐
 ▼      ▼       ▼
bucket bucket  bucket
  │
  ├── node
  ├── node
  └── tree/bin when needed
```

Modern implementations use fine-grained synchronization/CAS-based mechanisms rather than putting one giant lock around the entire map.

The exact internal implementation has evolved across JDK versions, so avoid memorizing the old interview statement:

> "ConcurrentHashMap always uses 16 segments."

That describes an older implementation and is **not how modern Java ConcurrentHashMap is implemented**.

---

# 95. ConcurrentHashMap vs HashMap

| Feature           | HashMap                              | ConcurrentHashMap               |
| ----------------- | ------------------------------------ | ------------------------------- |
| Thread-safe       | No                                   | Yes                             |
| Null key          | One allowed                          | No                              |
| Null value        | Multiple                             | No                              |
| Concurrent access | Unsafe without external coordination | Designed for it                 |
| Iterator          | Fail-fast behavior possible          | Weakly consistent               |
| Performance       | Excellent single-threaded            | Excellent concurrent use        |
| Atomic operations | Limited                              | Many atomic compound operations |

---

# 96. Complete Set Hierarchy

```text
                         Iterable
                            │
                            ▼
                        Collection
                            │
                           Set
                            │
          ┌─────────────────┴─────────────────┐
          │                                   │
      HashSet                            SortedSet
          │                                   │
   LinkedHashSet                         NavigableSet
                                              │
                                           TreeSet
```

---

# 97. Complete Map Hierarchy

```text
                           Map
                            │
       ┌────────────────────┼─────────────────────┐
       │                    │                     │
    HashMap            LinkedHashMap          Hashtable
       │                                          │
       │                                      Properties
       │
    SortedMap
       │
  NavigableMap
       │
    TreeMap

Special-purpose Maps:

Map
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
└── ConcurrentHashMap
```

---

# 98. Set vs Map

| Set                           | Map                       |
| ----------------------------- | ------------------------- |
| Stores elements               | Stores key-value mappings |
| Duplicate elements prohibited | Duplicate keys prohibited |
| One object per entry          | Key + value               |
| `add()`                       | `put()`                   |
| `contains()`                  | `containsKey()`           |
| `remove()`                    | `remove(key)`             |
| `iterator()`                  | `entrySet()` / `keySet()` |
| HashSet                       | HashMap                   |
| TreeSet                       | TreeMap                   |

---

# 99. HashSet vs HashMap

Conceptually:

```text
HashSet
   │
   └── internally backed by HashMap
```

A simplified conceptual representation is:

```text
HashSet element
      │
      ▼
HashMap key

element → PRESENT
```

The actual implementation details should be treated as JDK implementation details, but this relationship is useful for understanding why HashSet gets hash-based behavior.

---

# 100. TreeSet vs TreeMap

```text
TreeSet
    ↓
stores sorted elements

TreeMap
    ↓
stores sorted keys + values
```

Both provide:

```text
O(log n)
```

for their fundamental tree operations.

Both provide navigation:

```text
lower
floor
ceiling
higher
```

---

# 101. Ordering Cheat Sheet

```text
HashSet
→ no guaranteed iteration order

LinkedHashSet
→ insertion order

TreeSet
→ sorted order

HashMap
→ no guaranteed iteration order

LinkedHashMap
→ insertion order by default
→ access order if configured

TreeMap
→ sorted key order

EnumMap
→ enum declaration order
```

---

# 102. Null Cheat Sheet

```text
HashSet
→ one null

LinkedHashSet
→ one null

TreeSet
→ null generally not supported with natural ordering

HashMap
→ one null key
→ multiple null values

LinkedHashMap
→ one null key
→ multiple null values

TreeMap
→ null key generally not allowed with natural ordering
→ null values allowed

Hashtable
→ null key ❌
→ null value ❌

Properties
→ follows Hashtable restrictions for its Hashtable-based map behavior

WeakHashMap
→ null keys/values have special semantics; do not treat it like HashMap blindly

IdentityHashMap
→ permits null key/value

EnumMap
→ null key ❌
→ null value ✅

ConcurrentHashMap
→ null key ❌
→ null value ❌
```

---

# 103. Complexity Cheat Sheet

| Collection        |   Search |   Insert |   Delete | Ordering         |
| ----------------- | -------: | -------: | -------: | ---------------- |
| HashSet           |    O(1)* |    O(1)* |    O(1)* | None             |
| LinkedHashSet     |    O(1)* |    O(1)* |    O(1)* | Insertion        |
| TreeSet           | O(log n) | O(log n) | O(log n) | Sorted           |
| HashMap           |    O(1)* |    O(1)* |    O(1)* | None             |
| LinkedHashMap     |    O(1)* |    O(1)* |    O(1)* | Insertion/access |
| TreeMap           | O(log n) | O(log n) | O(log n) | Sorted keys      |
| EnumMap           |     O(1) |     O(1) |     O(1) | Enum order       |
| ConcurrentHashMap |    O(1)* |    O(1)* |    O(1)* | No sorting       |

`*` = average/expected complexity, assuming suitable hashing behavior.

---

# 104. Which One Should You Choose?

## Need unique elements + fastest general-purpose operations?

```java
HashSet
```

## Need unique elements + insertion order?

```java
LinkedHashSet
```

## Need unique elements + sorted/navigation operations?

```java
TreeSet
```

## Need key-value storage?

```java
HashMap
```

## Need key-value storage + insertion order?

```java
LinkedHashMap
```

## Need sorted keys?

```java
TreeMap
```

## Keys are enum constants?

```java
EnumMap
```

## Need object identity rather than equals?

```java
IdentityHashMap
```

## Need keys to disappear when no strong references remain?

```java
WeakHashMap
```

## Need concurrent Map operations?

```java
ConcurrentHashMap
```

## Legacy synchronized Map?

```java
Hashtable
```

---

# 105. Most Important Interview Traps

### Trap 1

> Is Map a Collection?

**No.**

```text
Map ≠ Collection
```

They are separate interfaces.

---

### Trap 2

> Does Set allow duplicates?

No.

---

### Trap 3

> Does HashSet maintain insertion order?

No guaranteed ordering.

Use:

```java
LinkedHashSet
```

for insertion order.

---

### Trap 4

> Does TreeSet use hashing?

No.

It is tree-based and sorted.

---

### Trap 5

> Does TreeMap sort values?

No.

It sorts **keys**.

---

### Trap 6

> Can HashMap have duplicate keys?

No.

Putting the same key again replaces the value.

---

### Trap 7

> Can HashMap have duplicate values?

Yes.

```java
map.put(1, "Java");
map.put(2, "Java");
```

is valid.

---

### Trap 8

> Does ConcurrentHashMap allow null?

No.

Neither null key nor null value.

---

### Trap 9

> Does EnumMap use hashing?

It does not rely on the normal hash-table approach. Its specialized representation exploits the fixed enum key universe and enum ordinals.

---

### Trap 10

> Why is EnumMap fast?

Because enum keys come from a fixed set and can be represented efficiently using ordinal-based indexing.

---

### Trap 11

> IdentityHashMap uses equals()?

No.

It uses reference identity semantics:

```java
==
```

---

### Trap 12

> Is Hashtable modern?

No. It is a legacy synchronized Map. Modern applications normally use HashMap or ConcurrentHashMap depending on concurrency requirements.

---

# 106. 30-Second Interview Summary

> `Set` stores unique elements, while `Map` stores key-value pairs with unique keys. `HashSet` and `HashMap` use hashing and generally provide O(1) average basic operations. `LinkedHashSet` and `LinkedHashMap` preserve predictable insertion order, while `TreeSet` and `TreeMap` maintain sorted order using tree-based structures and provide O(log n) operations. `NavigableSet` and `NavigableMap` add navigation methods such as lower, floor, ceiling, and higher. `Hashtable` is a legacy synchronized Map that doesn't allow null keys or values. `Properties` extends Hashtable and is commonly used for configuration. `WeakHashMap` uses weak references for keys, `IdentityHashMap` uses reference identity rather than equals, `EnumMap` is specialized for enum keys and exploits their fixed ordinal structure, and `ConcurrentHashMap` is designed for efficient concurrent access and doesn't permit null keys or values.`

---

# 107. Final Memory Map

```text
COLLECTION
│
├── LIST
│
├── SET
│   │
│   ├── HashSet
│   │     └── LinkedHashSet
│   │
│   └── SortedSet
│         │
│         └── NavigableSet
│               │
│               └── TreeSet
│
└── QUEUE


MAP
│
├── HashMap
│     └── LinkedHashMap
│
├── SortedMap
│     └── NavigableMap
│           └── TreeMap
│
├── Hashtable
│     └── Properties
│
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
└── ConcurrentHashMap
```

## The four navigation operators

```text
lower(x)    → greatest element < x

floor(x)    → greatest element <= x

ceiling(x)  → smallest element >= x

higher(x)   → smallest element > x
```

## The three major Set choices

```text
HashSet
   ↓
fast + unique

LinkedHashSet
   ↓
fast + unique + insertion order

TreeSet
   ↓
unique + sorted + navigation
```

## The three major Map choices

```text
HashMap
   ↓
fast key-value storage

LinkedHashMap
   ↓
fast + predictable order

TreeMap
   ↓
sorted keys + navigation
```

## Special Maps

```text
WeakHashMap
→ weak-key lifecycle behavior

IdentityHashMap
→ reference identity (==)

EnumMap
→ enum keys + efficient specialized representation

ConcurrentHashMap
→ concurrent access
```
