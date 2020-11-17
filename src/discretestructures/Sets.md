# Sets

* **Set**: unordered collection of objects
* **Elements**: An object in the set
* a **∈** A to denote that a is an element of the set A.
*  a **̸∈** A denotes that a is not an element of the set A

## Important Sets

| Number Set | Description                                                  |
| ---------- | ------------------------------------------------------------ |
| **N**      | {0,1,2,3,...}, the set of **natural numbers**                |
| **Z**      | {...,−2,−1,0,1,2,...}, the set of **integers**               |
| **Z^+^**   | {1,2,3,...}, the set of **positive integers**                |
| **Q**      | {p/q \| p ∈ **Z**, q ∈ **Z**, and q != 0}, the set of **rational numbers** |
| **R**      | the set of **real numbers**                                  |
| **R^+^**   | the set of **positive real numbers**                         |

## Set Notation

**Roster Notation**: Used with discrete sets (countable)

* S = {1, 2, 3, 4, 5}
* Not roster notation: 0 <= x <= 1

**Set-Builder Notation**: Can be used for any type of set

* S = {x | x ∈ N, 1 <= x <= 5}
* | = "such that"

**Interval Notation**: Used with continuous sets

* B = {x |0 <= x <= 1} = **[0, 1]**

**Universal Set**: The set of all elements under consideration

**Empty Set**: { } or ∅



## Set Relationships

**Set Equality**

* Sets are equal if and only if they have the same elements
* ∀x(x ∈ A ↔ x ∈ B, Notation: A = B if A and B are equal sets

**Subsets**

* The set A is a subset of B if and only if every element of A is also an element of B. 
* ∀x(x ∈ A → x ∈ B), Notation: A ⊆ B
  * **Showing that A is a Subset of B:** To show that A ⊆ B, show that if x belongs to A then x also belongs to B.
  * **Showing that A is Not a Subset of B**: To show that A ̸⊆ B, find a single x ∈ A such that
    x ̸∈ B.
  * **Showing Two Sets are Equal:** To show that two sets A and B are equal, show that A ⊆ B and B ⊆ A.
* **Proper subset:** When we wish to emphasize that a set A is a subset of a set B but that A != B, we write A ⊂ B

**Cardinality**

* The number of distinct elements of a set
* A = {1, 2, 3, 3, 3, 4}, Cardinality Notation: |A|= 4

**Power Sets**

* The set of all subsets of a set
* A = {0, 1, 2}, Power Set Notation: P(A) = {∅, {0}, {1}, {2}, {0, 1}, {0, 2}, {1, 2}, {0, 1, 2}}
* Cardinality of a power set of a set with n elements is 2^n^

**Cartesian Product**

* The set of ordered pair (a, b) where a ∈ A and b ∈ B, resulting from A x B
* Notation: A × B = {(a,b) | a ∈ A ∧ b ∈ B}
* A = {0, 1}, B = {a, b, c}
  * A x B =  {(1, a), (1, b), (1, c), (2, a), (2, b), (2, c)}
  * B x A =  {(a, 1), (a, 2), (b, 1), (b, 2), (c, 1), (c, 2)}

**Truth Set**

* A truth set of P is the set of elements in x in D such that P(x) is true
* Notation: {x ∈ D | P(x)}











