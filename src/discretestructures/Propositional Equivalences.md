# Propositional Equivalences

**Tautology**: A compound proposition that is always true

**Contradiction**: A compound proposition that is always false

**Contingency**:  A compound proposition that is neither a tautology nor a contradiction



## Logical Equivalences

| Equivalence                                                  | Name                |
| ------------------------------------------------------------ | ------------------- |
| p ∧ T ≡ p <br/>p ∨ F ≡ p                                     | Identity laws       |
| p ∨ T ≡ T <br/>p ∧ F ≡ F                                     | Domination laws     |
| p ∨ p ≡ p <br/>p ∧ p ≡ p                                     | Idempotent laws     |
| ¬(¬p) ≡ p                                                    | Double negation law |
| p ∨ q ≡ q ∨ p <br/>p ∧ q ≡ q ∧ p                             | Commutative laws    |
| (p ∨ q) ∨ r ≡ p ∨ (q ∨ r) <br/>(p ∧ q) ∧ r ≡ p ∧ (q ∧ r)     | Associative laws    |
| p ∨ (q ∧ r) ≡ (p ∨ q) ∧ (p ∨ r) <br/>p ∧ (q ∨ r) ≡ (p ∧ q) ∨ (p ∧ r) | Distributive laws   |
| ¬(p ∧ q) ≡ ¬p ∨ ¬q <br/>¬(p ∨ q) ≡ ¬p ∧ ¬q                   | De Morgan’s laws    |
| p ∨ (p ∧ q) ≡ p <br/>p ∧ (p ∨ q) ≡ p                         | Absorption laws     |
| p ∨ ¬p ≡ T <br/>p ∧ ¬p ≡ F                                   | Negation laws       |

| Logical Equivalences Involving Conditional Statements | Logical Equivalences Involving Biconditional Statements. |
| ----------------------------------------------------- | -------------------------------------------------------- |
| p → q ≡ ¬p ∨ q                                        | p ↔ q ≡ (p → q) ∧ (q → p)                                |
| p → q ≡ ¬q → ¬p                                       | p ↔ q ≡ ¬p ↔ ¬q                                          |
| p ∨ q ≡ ¬p → q                                        | p ↔ q ≡ (p ∧ q) ∨ (¬p ∧ ¬q)                              |
| p ∧ q ≡ ¬(p → ¬q)                                     | ¬(p ↔ q) ≡ p ↔ ¬q                                        |
| ¬(p → q) ≡ p ∧ ¬q                                     |                                                          |
| (p → q) ∧ (p → r) ≡ p → (q ∧ r)                       |                                                          |
| (p → r) ∧ (q → r) ≡ (p ∨ q) → r                       |                                                          |
| (p → q) ∨ (p → r) ≡ p → (q ∨ r)                       |                                                          |
| (p → r) ∨ (q → r) ≡ (p ∧ q) → r                       |                                                          |



## Examples

1. ¬(p ∨ (¬p ∧ q))  ≡ ¬p ∧ ¬q 

| Original Statement  | Result                    | Reasoning               |
| ------------------- | ------------------------- | ----------------------- |
| **¬**(p ∨ (¬p ∧ q)) | ¬p ∧ **¬**(¬p ∧ q)        | 2nd De Morgan law       |
|                     | ¬p ∧ [**¬**(**¬**p) ∨ ¬q] | 1st De Morgan Law       |
|                     | **¬p** ∧ (p ∨ ¬q)         | Double Negation Law     |
|                     | (**¬p ∧ p**) ∨ (¬p ∧ ¬q)  | Second Distributive Law |
|                     | **F ∨ (¬p ∧ ¬q)**         | 2nd Negation Law        |
|                     | **(¬p ∧ ¬q) ∨ F**         | Commutative Law         |
|                     | ¬p ∧ ¬q                   | Identity Law            |

**bolded** portions are the places where changes changes were made

2.  (p ∧ q) → (p ∨ q) is a tautology or  (p ∧ q) → (p ∨ q) ≡ T

| Original Statement | Result              | Reasoning                         |
| ------------------ | ------------------- | --------------------------------- |
| (p ∧ q) → (p ∨ q   | ¬(p ∧ q) ∨ (p ∨ q)  | p → q ≡ ¬p ∨ q                    |
|                    | (¬p ∨ ¬q) ∨ (p ∨ q) | 1st De Morgan Law                 |
|                    | (¬p ∨ p) ∨ (¬q ∨ q) | Commutative Law + Associative law |
|                    | T ∨ T               | 2nd Negation Law                  |
|                    | T                   | Domination law                    |

3. ¬(¬p ∨ q) ≡ ¬q ∧ p)

| Original Statement | Result     | Reasoning           |
| ------------------ | ---------- | ------------------- |
| ¬(¬p ∨ q)          | ¬(¬p) ∧ ¬q | 1st De Morgan Law   |
|                    | p ∧ ¬q     | Double Negation Law |
|                    | ¬q ∧ p)    | Commutative Law     |