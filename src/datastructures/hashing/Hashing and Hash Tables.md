# Hashing and Hash Tables

**Hash Table** is a data structure which stores data in an associative manner. In a hash table, data is stored in an array format, where each data value has its own unique index value. Access of data becomes very fast if we know the index of the desired data.

**Hashing** is a technique to convert a range of key values into a range of indexes of an array.

**Process:** Key -> Hash Function -> Array Index



## Factors that affect hashing performance

**Hash function** 

1. Should distribute the keys and entries evenly throughout the entire table 
2. Should **minimize collisions** 



**Collision resolution strategy** 

1. **Open Addressing:** store the key/entry in a different position 

1. **Separate Chaining:** chain several keys/entries in the same position 



**Table size** 

1. **Too large** a table, will cause a **wastage of memory** 
2. **Too small** a table will cause **increased collisions and eventually force rehashing** (creating a new hash table of larger size and copying the contents of the current hash table into it) 
3. The size should be appropriate to the hash function used and should typically be a prime number. 



## Selecting Hash Functions

**Modular Arithmetic**: Compute the index by dividing the key with some value and use the remainder as the index. This forms the basis of the next two techniques.

​	index = key % arraySize

**Truncation:** Ignoring part of the key and using the rest as the array index. The problem with this approach is that there may not always be an even distribution throughout the table

**Strings:** Modular hashing works for long keys such as strings, too: we simply treat them as huge integers.

​	For a String s, and where R is a small prime integer (Java uses 31).

​	int hash = 0; 

​	for (int *i* = 0; *i* < *s*.length(); *i*++) 

​	hash = (R * hash + *s*.charAt(*i*)) % arraySize; where R is a small 

**Folding:** Begins by dividing the item into equal-size pieces (the last piece may not be of equal size). These pieces are then added together to give the resulting hash value.



## Collision Resolution

**Open Addressing:**

- **Linear probing:** 
  - When a collision occurs at index *i* of the table. probe (i.e., examine) the next location, the location after that, and so on, until either an open (unoccupied) location is found or you return to the starting location, *i*.
  - The main problem with linear probing is that as more and more entries are hashed into a table, they tend to **form clusters** that get bigger and bigger. This causes the number of probes on collisions to increase, ultimately **slowing down the hashing process**.
- **Quadratic probing:** Instead of probing in unit steps, as in linear probing, **take steps of length**
  **equal to the square** (hence quadratic) of the step number.

**Closed Addressing:**

* **Chaining:** The entries are inserted as **nodes in a linked list**. The hash table itself is an array of head pointers.
* **Load Factor** = n/N = Number of elements in the array/Size of the array

**Rehashing:** Process by which a hash table's capacity is increased

* In java the default load factor is 0.75
* When load factor threshold is exceeded the hash table will rehash