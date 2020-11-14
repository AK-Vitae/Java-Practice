# Predicates and Quantifiers

## Predicate Logic Components

* **Variables:** **x,y,z** these are the subjects of the statement(s)
* **Predicates:** A property the variable can have
  * ex. "x < 2" and "x + y = z"
  * **Propositional Function**: P(x), where P is the predicate and x is the variable
* **Quantifiers**



## Common Number Sets

| Number Set | Description                                                  |
| ---------- | ------------------------------------------------------------ |
| **N**      | {0,1,2,3,...}, the set of **natural numbers**                |
| **Z**      | {...,−2,−1,0,1,2,...}, the set of **integers**               |
| **Z^+^**   | {1,2,3,...}, the set of **positive integers**                |
| **Q**      | {p/q \| p ∈ **Z**, q ∈ **Z**, and q != 0}, the set of **rational numbers** |
| **R**      | the set of **real numbers**                                  |
| **R^+^**   | the set of **positive real numbers**                         |



## Quantifiers

* Universal Quantifier ∀
  * ∀xP(x) tells us that the proposition P(x) must be true for **all** values of x in the domain of the discourse/universe
* Existential Quantifier ∃
  * ∃xP(x) tells us that the proposition P(x) must be true for **some** value(s) of x in the domain of the discourse/universe

| Statement | When True?                            | When False?                            |
| --------- | ------------------------------------- | -------------------------------------- |
| ∀xP(x)    | P(x) is true for every x.             | There is an x for which P(x) is false. |
| ∃xP(x)    | There is an x for which P(x) is true. | P(x) is false for every x              |



## Translating and Negating with Quantifiers

**De Morgan’s Laws for Quantifiers**

| Negation | Equivalent Statement |
| -------- | -------------------- |
| ¬∃xP(x)  | ∀x¬P(x)              |
| ¬∀xP(x)  | ∃x¬P(x)              |

**ex.** "There is an honest politician" and "All Americans eat cheeseburgers"

​	Let H(x) represent "x is honest" for domain of all politicians

​	Therefore ∃xH(x)

​	Negation:  ¬∃xH(x) = ∀x¬H(x) = Every politician is dishonest

​	

​	Let C(x) represent "x eat cheeseburgers" for domain of all Americans

​	Therefore: ∀xC(x)

​	Negation:  ¬∀xC(x) = ∃x¬C(x) = Not every American eats cheeseburgers



**ex.** "Every student in this class has visited Canada or Mexico"

​	Domain: Students in this class

​	Let M(x) represent "x has visited Mexico"

​	Let C(x) represent "x has visited Canada"

​	Therefore ∃x(C(x)  ∨ M(x))

​	Domain: All people

​	Let M(x) represent "x has visited Mexico"

​	Let C(x) represent "x has visited Canada"

​	Let S(x) represent "x is a student in this class"

​	Therefore ∀x(S(x) → (C(x) ∨ M(x)))