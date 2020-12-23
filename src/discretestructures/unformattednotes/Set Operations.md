# Set Operations

**Union of Sets**

* Let A and B be sets. The union of the sets A and B, denoted by A ∪ B, is the set that contains those elements **that are either in A or in B, or in both.**
* **A ∪ B** = {x | x ∈ A ∨ x ∈ B}

**Intersection of Sets**

* Let A and B be sets. The intersection of the sets A and B, denoted by A ∩ B, is the set containing those elements **in both A and B.**
* **A ∩ B** = {x | x ∈ A ∧ x ∈ B}
* If A ∩ B  = ∅ then A and B are said to be disjoint

Complement

* Let A be a set. The complement of set A with respect to U is U - A.
* ¬A = {x | x ∈ U | x !∈ A}



## Set Identities

| Identity                                                     | Name                |
| ------------------------------------------------------------ | ------------------- |
| A ∩ U = A <br/>A ∪ ∅ = A                                     | Identity laws       |
| A ∪ U = U <br/>A ∩ ∅ = ∅                                     | Domination laws     |
| A ∪ A = A <br/>A ∩ A = A                                     | Idempotent laws     |
| ¬(A) = A                                                     | Complementation law |
| A ∪ B = B ∪ A <br/>A ∩ B = B ∩ A                             | Commutative laws    |
| A ∪ (B ∪ C) = (A ∪ B) ∪ C <br/>A ∩ (B ∩ C) = (A ∩ B) ∩ C     | Associative laws    |
| A ∪ (B ∩ C) = (A ∪ B) ∩ (A ∪ C) <br/>A ∩ (B ∪ C) = (A ∩ B) ∪ (A ∩ C) | Distributive laws   |
| ¬(A ∩ B) = ¬A ∪ ¬B <br/>¬(A ∪ B) = ¬A ∩ ¬B                   | De Morgan’s laws    |
| A ∪ (A ∩ B) = A <br/>A ∩ (A ∪ B) = A                         | Absorption laws     |
| A ∪ ¬A = U <br/>A ∩ ¬A = ∅                                   | Complement laws     |



## Proving Set Identities

* Prove each set in the identity is a subset of the other

ex. ¬(A ∩ B) = ¬A ∪ ¬B

* Need to show that ¬(A ∩ B) ⊆ ¬A ∪ ¬B and that ¬A ∪ ¬B ⊆ ¬(A ∩ B)

| Steps for ¬(A ∩ B) ⊆ ¬A ∪ ¬B | Reasoning                               |
| ---------------------------- | --------------------------------------- |
| x ∈ ¬(A ∩ B)                 | By assumption                           |
| x !∈ A ∩ B                   | Definition of complement                |
| ¬((x ∈ A) ∧ (x ∈ B))         | Definition of intersection              |
| ¬(x ∈ A) ∨ ¬(x ∈ B)          | De Morgan's Law for Propositional Logic |
| x !∈ A ∨ x !∈ B              | Definition of a negation                |
| x ∈ ¬A ∨ x ∈ ¬B              | Definition of complement                |
| x ∈ ¬A ∪ ¬B                  | Definition of a union                   |

| Steps for ¬A ∪ ¬B ⊆ ¬(A ∩ B) | Reasoning                               |
| ---------------------------- | --------------------------------------- |
| x ∈ ¬A ∪ ¬B                  | By assumption                           |
| x ∈ ¬A ∨ x ∈ ¬B              | Definition of a union                   |
| x !∈ A ∨ x !∈ B              | Definition of complement                |
| ¬(x ∈ A) ∨ ¬(x ∈ B)          | Definition of a negation                |
| ¬((x ∈ A) ∧ (x ∈ B))         | De Morgan's Law for Propositional Logic |
| ¬(x ∈ A ∩ B)                 | Definition of intersection              |
| x ∈ ¬(A ∩ B)                 | Definition of complement                |