# Discrete Notes

[TOC]

# Propositional Logic

**Proposition**: a declarative sentence that is either true or false

Examples:

```
The Moon is made of green cheese.
Trenton is the capital of New Jersey.
Toronto is the capital of Canada.
1 + 0 = 1
0 + 0 = 2
```

Examples that are not propositions

```
Sit down!
What time is it?
x + 1 = 2
x + y = z
```

Propositional Variables: p, q, r, s, ...

The proposition that is always true is denoted by **T** and the proposition that is always false is denoted by **F**.



## Compound Propositions

* Propositions can be combined in several ways to create **compound propositions**
* This can be made by using **Propositional Formulas**

| Name                    | Symbol | Logic                  | Definition                                                   | Example                                                      |
| ----------------------- | ------ | ---------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Proposition             | p      | p                      | A declarative statement                                      | I **will** go shopping today                                 |
| Negation                | ¬p     | **not** p              | Contradiction of a statement                                 | I will **not** go shopping today                             |
| Conjunction             | p ∩ q  | p **and** q            | A compound proposition that is true **if and only if all** of its component propositions are true. | I will go to work **and** I will go shopping today           |
| Disjunction             | p ∪ q  | p **or** q             | A compound proposition that is true **if and only if at least one** of a number of alternatives is true. | John is at the library **or** John is studying               |
| Exclusive Or            | p ⊕ q  | p **xor** q            | A compound proposition that is true if and only if at least one of a number of alternatives is true exclusively. | This summer, I am going to London, **or** I am going to Paris |
| Conditional/Implication | p ⇒ q  | **if** p **then** q    | An if-then statement in which p is a hypothesis and q is a conclusion. | **If** I do my homework, **then** I get an allowance.        |
| Biconditional           | p ⇔ q  | p **if and only if** q | True whenever both parts have the same truth value           | I will take out the trash **if and only if** you do the dishes |

| Different Ways of Expressing p ⇒ q        |
| ----------------------------------------- |
| **if** p, **then** q                      |
| **if** p, q                               |
| q **unless** ¬p                           |
| q **if** p                                |
| q **whenever** p                          |
| q **follows from** p                      |
| p **implies** q                           |
| p **only if** q                           |
| q **when** p                              |
| p **is sufficient for** q                 |
| q **is necessary for** p                  |
| **a necessary condition for** p **is** q  |
| **a sufficient condition for** q **is** p |

| Different Ways of Expressing Biconditional p ⇔ q |
| ------------------------------------------------ |
| p **is necessary and sufficient for** q          |
| **if** p **then** q , and conversely             |
| p **iff** q                                      |

More conditional statements related to p ⇒ q ("It raining is a sufficient condition for my not going to town.":

| Name           | Symbol  | Logic                       | Example                                       |
| -------------- | ------- | --------------------------- | --------------------------------------------- |
| Converse       | q ⇒ p   | **if** p **then** q         | If I do not go to town, then it is  raining.  |
| Contrapositive | ¬q ⇒ ¬p | **if** not q **then** not p | If it is not raining, then I will go to town. |
| Inverse        | ¬p ⇒ ¬q | **if** not p **then** not q | If I go to town, then it is not raining.      |

* Always first write statements in if then form
* Contrapositive will have the same truth values as p ⇒ q

## Truth Tables

* A representation of all the combinations of logical operators can be done through a tool called a "Truth Table" which can tell us the values of the propositions

* Rows: Need a row for every possible combination of values  for the  atomic propositions.

* Columns: 

  * Need a column for the compound proposition (usually at far right)
  * Need a column for the truth value of each expression that occurs in the compound proposition as it is built up.

* Truth Tables:

  * Proposition vs Negation

  | p    | ¬p   |
  | ---- | ---- |
  | T    | F    |
  | F    | T    |

   * Conjunction

  | p    | q    | p ∩ q |
  | ---- | ---- | ----- |
  | T    | T    | T     |
  | T    | F    | F     |
  | F    | T    | F     |
  | F    | F    | F     |

    * Disjunction

  | p    | q    | p ∪ q |
  | ---- | ---- | ----- |
  | T    | T    | T     |
  | T    | F    | T     |
  | F    | T    | T     |
  | F    | F    | F     |

    * Exclusive Or

  | p    | q    | p ⊕ q |
  | ---- | ---- | ----- |
  | T    | T    | F     |
  | T    | F    | T     |
  | F    | T    | T     |
  | F    | F    | F     |

     * Conditional

  | p    | q    | p ⇒ q |
  | ---- | ---- | ----- |
  | T    | T    | T     |
  | T    | F    | F     |
  | F    | T    | T     |
  | F    | F    | T     |

  * Biconditional

  | p    | q    | p ⇔ q |
  | ---- | ---- | ----- |
  | T    | T    | T     |
  | T    | F    | T     |
  | F    | T    | T     |
  | F    | F    | T     |


### Precedence of Logical Operators

| Operator | Precedence |
| -------- | ---------- |
| ¬        | 1          |
| ∩<br/>∪  | 2<br/>3    |
| ⇒<br/>⇔  | 4<br/>5    |

### Compound Propositions

* Rows: Need a row for every possible combination of values for the compound propositions which in turn would be 2^propositions^ .

* Columns: Need a column for each proposition variable, need a column for the truth value of each expression that occurs in the compound proposition as it is built up, and need a column for the compound proposition. 

  

# Applications of Propositional Logic

## Translating English Sentences

1. **Identify atomic propositions**
2. **Determine appropriate logical connectives**



**ex.** **If** <u>I go to the store</u> **or** <u>the movies</u>, <u>I **won't** do my homework</u>.

​	**Atomic propositions:**	

​		p: I go to the store

​		q: I go to the movies

​		r: I do my homework

​	Logical connectives:

​		if, or, won't	

​	**Representation:** (p ∪ q) ⇒ ¬r



**ex.** <u>The automated reply **can't** be sent</u> **when** <u>the system is full</u>

​	**Atomic propositions:**	

​		p: The system is full

​		q: The automated reply can be sent

​	Logical connectives:

​		can't, when

​	**Representation:** p ⇒ ¬q



## Translating Propositions

**ex.**  

q: You can ride the rollercoaster

r: You are under 4 feet tall

s: You are older than 16 years old

Translate: (r ∪ ¬s) ⇒ ¬q

Might be helpful to write shell: if r or not s, then not q

**If** <u>you are under 4 feet tall</u> **or** <u>**not** older than 16 years old</u> **then** <u>you can **not** ride the rollercoaster</u>



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



# Nested Quantifiers

ex. Let Q(x,y) denote “x + y = 5.” Domain is all real numbers.

* ∃y∀xQ(x,y) 
  * For all real numbers x there exists a real number y such that x + y = 5
  * TRUE

* ∀x∃yQ(x,y)
  * There exists a real number y such that for all real numbers x, x + y = 5
  * FALSE, y = 0 , x = 2, 2 + 0 != 5



**Quantification of Two Variables**

| Statement                 | When True?                                          | When False?                                          |
| ------------------------- | --------------------------------------------------- | ---------------------------------------------------- |
| ∀x∀yP(x,y)<br/>∀y∀xP(x,y) | P(x,y) is true for every pair x,y                   | There is a pair x,y for which P(x,y) is false.       |
| ∀x∃yP(x,y)                | For every x there is a y for which P(x,y) is true.  | There is an x such that P(x,y) is false for every y. |
| ∃x∀yP(x,y)                | There is an x for which P(x,y) is true for every y. | For every x there is a y for which P(x,y) is false.  |
| ∃x∃yP(x,y)<br/>∃y∃xP(x,y) | There is a pair x,y for which P(x,y) is true.       | P(x,y) is false for every pair x,y.                  |



## Negation

ex. Let P(x,y) denote (x = -y). Find the negation of ∀x∃yP(x,y)

* No negation to precede a quantifier

  ¬(∀x∃yP(x,y)) = ∃x¬(∃yP(x,y)) = ∃x∀y¬P(x,y) = There exists a real number x such that for all real numbers y, x != -y



## Translation

**ex.** Translate "The sum of two positive integers is always positive"

* For all positive integers x and y, x+y > 0
* Let P(x,y) denote x+y > 0
* ∀x∀y(P(x,y)), domain Z^+^



**ex.** Let E(x,y) denote "x sent y an email" and T(x,y) denote "x sent y a text." Domain: students in class

a. Every student in the class sent an email to Joe

* ∀xE((x != Joe) → E(x, Joe))

b. There is a student in class who has not received a text or email from any other student in class

* ∃y∀x((x != y) → ¬(E(x,y) ∨ T(x,y))) = ∃y∀x((x != y) → (¬E(x,y) ∧ ¬T(x,y)))



**ex.** There is a man that has taken a flight on every airline in the world

* Let P(x, y) denote x has taken flight y
* Let Q(y, z) denote y is a flight on airline z
* ∃m∀a∃f(P(m, f) ∧ Q(f, a)) | m = man, a = airline, and f = flight



# Rules of Inference

**Argument:** a sequence of propositions p<sub>1</sub>, p<sub>2</sub> ... p<sub>n</sub>

* All but the final proposition in the argument are called **premises**
* The final proposition is called the **conclusion**
* An argument is valid if the truth of all its premises implies that the conclusion is true.
* p<sub>1</sub>, p<sub>2</sub> ... p<sub>n</sub> and conclusion q is valid, when (p<sub>1</sub> ∧ p<sub>2</sub> ∧ ··· ∧ p<sub>n</sub> ) → q is a tautology.



| Rule of Inference            | Tautology                                                    | Name                                         |
| ---------------------------- | ------------------------------------------------------------ | -------------------------------------------- |
| p<br/>p → q<br/>∴ q          | (p ∧ (p → q)) → q                                            | Modus Ponens                                 |
| ¬q<br/>p → q<br/>∴ ¬p        | (¬q ∧ (p → q)) → ¬p<br/>≡ (¬q ∧ (¬q → ¬p)) → ¬p              | Modus Tollens                                |
| p → q<br/>q → r<br/>∴ p → r  | ((p → q) ∧ (q → r)) → (p → r)                                | Hypothetical Syllogism (Transitive Property) |
| p ∨ q<br/>¬p<br/>∴ q         | ((p ∨ q) ∧ ¬p) → q<br/>* p or q occurred but p didn't occur implies that q occurred | Disjunctive Syllogism                        |
| p<br/>∴ p ∨ q                | p → (p ∨ q)                                                  | Addition                                     |
| p ∧ q<br/>∴ p                | (p ∧ q) → p<br/>(p ∧ q) → q                                  | Simplification                               |
| p<br/>q<br/>∴ p ∧ q          | ((p) ∧ (q)) → (p ∧ q)                                        | Conjunction                                  |
| p ∨ q<br/>¬p ∨ r<br/>∴ q ∨ r | ((p ∨ q) ∧ (¬p ∨ r)) → (q ∨ r)<br/>* if p = T then ¬p = F, which makes q = T and r can be T or F<br/>* if p = F then ¬p = T, which makes q = T or F and r = T | Resolution                                   |

ex. From the proposition p ∧ (p → q), show that q is a conclusion

| Statement   | Reason                                     |
| ----------- | ------------------------------------------ |
| p ∧ (p → q) | Premise                                    |
| P           | Simplification on 1: (p ∧ q) → p           |
| p → q       | Simplification on 2: (p ∧ q) → q           |
| q           | Modus Ponens on 2 and 3: (p ∧ (p → q)) → q |

ex. From the propositions p, p → ¬q, and ¬q → ¬r, show that ¬r is a conclusion

| Statement | Reason                                     |
| --------- | ------------------------------------------ |
| p         | Premise                                    |
| p → ¬q    | Premise                                    |
| ¬q        | Modus Ponens on 1 and 2: (p ∧ (p → q)) → q |
| ¬q → ¬r   | Premise                                    |
| ¬r        | Modus Ponens on 3 and 4: (p ∧ (p → q)) → q |



# Proofs

## Useful Definitions

* **Even integer:** The integer n is even if there exists an integer k such that n = 2k
* **Odd integer:** The integer n is odd  if there exists an integer k such that n = 2k + 1
* **Rational number**: The real number r is rational if there exist integers p and q with q != 0 such that r = p/q.



## Direct Proof

* In a direct proof, we assume the antecedent is true, then use rules of inference, axioms, definitions and/or previously proven theorems to show the consequent is true.

ex. If n is an odd integer, the n^2^ is odd

* **Assume** n is an odd integer
  * Then n = 2k+1, k ∈ Z by definition of an odd integer
  * Then square both sides: (n)^2^ = (2k+1)^2^ → n^2^ = 4k^2^ + 4k + 1
  * n^2^ = 2(2k^2^ + 2k) + 1
  * n^2^ = 2r + 1 where r = 2k^2^ + 2k, r ∈ Z
  * Therefore n^2^ is odd

ex. The sum of two even integers is even

* If I add two even integers, then the sum is even
* **Assume** a and b are even integers
  * then a = 2k, k ∈ Z and b = 2m, m ∈ Z by definition of an even integer
  * a + b = 2k + 2m
  * a + b = 2(k + m)
  * a + b = 2r where r = k + m,  r ∈ Z



## Proof by Contraposition

* A type of indirect proof that makes use of the fact that p → q is equivalent to its contrapositive ¬q → ¬p. So we assume ¬q is true, then work to prove ¬p is true.

ex. If n is an integer and 3n+2 is odd, then n is odd

*  p → q ≡ ¬q → ¬p

*  Assume n is even. So n = 2k,  k ∈ Z by definition of an even integer
   * 3n+2 = 3(2k)+2
   * 3n+2 = 6k+2
   * 3n+2 = 2(3k+1)
   * 3n+2 = 2r where r = 3k + 1, r ∈ Z
   * Therefore 3n + 2 is even when n is odd and then by contraposition 3n + 2 is odd when n is odd



# Sets

* **Set**: unordered collection of objects
* **Elements**: An object in the set
* a **∈** A to denote that a is an element of the set A.
* a **̸∈** A denotes that a is not an element of the set A

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



# Sequences

* An ordered list of elements created by a function mapping the integers to a set S
* Notation: a<sub>n</sub> represents the nth term



## Arithmetic Sequence

* A sequence formed by adding the initial term, a, and the product of the common difference, d, and the term number, n.
* {a<sub>n</sub>} = a,a + d,a + 2d,...,a + nd | **a<sub>n</sub> = a + dn**

ex. Let a = 5 and d = 2. Find the first 5 terms of {a<sub>n</sub>}

​	a<sub>n</sub> = 5 + 2n: {5, 7, 9, 11, 13}; a<sub>4</sub> = 5+2(4) = 13

ex. Find a and d for the sequence {7, 4, 1, -2, ...}

​	a<sub>n</sub> = a + dn

​	a<sub>n</sub> = 7 + dn; a<sub>1</sub>-a<sub>0</sub> = 4 - 7 = -3 = d

​	a<sub>n</sub> = 7  - 3n



## Geometric Sequence

* A sequence formed by multiplying the initial term, a, by the common ratio to the nth power, r^n^
* {a<sub>n</sub>} = a, ar, ar^2^ ,..., ar^n^ | **a<sub>n</sub> = ar^n^**

ex. Let a = 4 and r = 3. Find the first 5 terms of the geometric progression.

​	a<sub>n</sub> = 4(3)^n^ = {4, 12, 36, 108, 324}; a~3~ = 4(3)^3^ = 36

ex. Find a and r for {a~n~} = {3, 3/2, 3/4, 3/8}

​	a~n~ = ar^n^

​	a~n~ = 3r^n^; a<sub>1</sub>/a<sub>0</sub> = (3/2)/3 = 1/2 = r

​	a~n~ = 3(1/2)^n^



## Recurrence Relation

* **An equation** that expresses a~n~ in terms of one ore more of the previous terms of the sequence. **Initial conditions** are required to specify terms that preceded the first term where the relation takes effect. 

ex. a~n~ = a~n-1~ + 2a~n-2~ for n >= 2 where a~0~ = 2 and a~1~ = 5

​	a~2~ = a~1~+2a~0~ = 5 + 2(2) = 9

​	a~3~ = a~2~+2a~1~ = 9 + 5(2) = 19

ex. Let a~n~ be the sequence that satisfies the recurrence relation a~n~ = a~n-1~ + 6 for n >=1

​	a. If a~0~ = 3, find a~1~, a~2~, a~3~

​	a~1~ = 3 + 6 = 9

​	a~2~ = 9 + 6 = 15

​	a~3~ = 15 + 6 = 21

​	a<sub>n</sub> = a + dn: a<sub>n</sub> = 3 + 6n

ex. Fibonacci Sequence: 0, 1, 1, 2, 3,4, 8, 13, 21, 34... Express the recurrence relation.

​	$f_0 = $ 0

​	$f_1 = $ 1

​	$f_n = $ $f_{n-1} + f_{n-2}$ for n >= 2

ex. Let a~n~ be the sequence that satisfies the recurrence relation a~n~ = a~n-1~ + 3 for n>=1 with a~0~ = 2

​	a = 2, d = 3 therefore a~n~ = 2 + 3n



**Some Useful Sequences**

| nth Term | First 10 Terms                                 |
| -------- | ---------------------------------------------- |
| n^2^     | 1,4,9,16,25,36,49,64,81,100,...                |
| n^3^     | 1,8,27,64,125,216,343,512,729,1000,...         |
| n^4^     | 1,16,81,256,625,1296,2401,4096,6561,10000,...  |
| 2^n^     | 2,4,8,16,32,64,128,256,512,1024,...            |
| 3^n^     | 3,9,27,81,243,729,2187,6561,19683,59049,...    |
| n!       | 1,2,6,24,120,720,5040,40320,362880,3628800,... |
| $f_n$    | 1,1,2,3,5,8,13,21,34,55,89,...                 |



# Summation and Mathematical Induction

**Sigma Notation**

* To express the sum of the terms of the sequence a~n~ = {a~m~,a~m+1~,...,a~n~}, we write:

  $\displaystyle\sum_{i=m}^{n} a_{i}$ = $\sum_{i=m}^{n} a_{i}$ = $\displaystyle\sum_{m \leq i \leq n} a_{i}$

  which represents a~m~ + ,a~m+1~ + ,a~m+2~ + a~n~

ex. Use sigma notation to express the sum of the first 100 terms of the sequence $a_i$ where  $a_i$= $1/i$ for i = 1, 2, ...

​	$\displaystyle\sum_{i=m}^{n} a_{i}$ = $\displaystyle\sum_{i=1}^{100} 1/i$

ex. What is the value of $\displaystyle\sum_{i=5}^{9} i^2$

= 25 + 36 + 49 + 64 + 81 = 255



## Summation Properties

* $\displaystyle\sum_{k=1}^{n} ca_{k} = c\displaystyle\sum_{k=1}^{n} a_{k}$
* $\displaystyle\sum_{k=1}^{n} c = cn$
* $\displaystyle\sum_{k=1}^{n} (a_{k} \pm b_{k}) = \displaystyle\sum_{k=1}^{n} a_{k} \pm \displaystyle\sum_{k=1}^{n} b_{k}$
* $\displaystyle\sum_{k=1}^{n} a_{k} = \displaystyle\sum_{k=1}^{j} a_{k} + \displaystyle\sum_{k=j+1}^{n} a_{k}$ for $i \leq j < j + 1 < n$



## Summation Formulas

* $\displaystyle\sum_{k=1}^{n} k = \frac {n(n+1)}{2}$ 
* $\displaystyle\sum_{k=1}^{n} k^2 = \frac {n(n+1)(2n+1)}{6}$ 
* $\displaystyle\sum_{k=1}^{n} k^3 = \frac {n^2(n+1)^2}{4}$
* $\displaystyle\sum_{k=1}^{\infty} x^k = \frac {1}{1-x}$
* $\displaystyle\sum_{k=1}^{\infty} kx^{k-1} = \frac {1}{(1-x)^2}$
* ex. $\displaystyle\sum_{k=n}^{2n} k = \displaystyle\sum_{k=1}^{2n} k - \displaystyle\sum_{k=1}^{n-1} k$
* Geometric progression: $\displaystyle\sum_{k=0}^{n} ar^k = \frac {ar^{n+1}-a}{r-1}$ 



## Mathematical Induction

### Proving Equalities

* To prove P(x) is true for x ∈ Z^+^, where P(x) is a propositional function, we complete two steps:
  1. **Basis step** - verify P(1) is true
  2. **Inductive step** - verify if P(k) is true, then P(k + 1) is true ∀k ∈ Z^+^
     * Inductive Hypothesis: P(k) is true
     * Must show: P(k)  → P(k+1)
  3. **Conclusion**: P(x) is true ∀k ∈ Z^+^



ex. $\displaystyle\sum_{k=1}^{n} k = \frac {n(n+1)}{2}$ , show 1 + 2 + 3 + ... + n = $\frac {n(n+1)}{2}$

Let P(n): 1 + 2 + 3 + ... + n = $\frac {n(n+1)}{2}$

**Basis Step:** 

​	P(1): n = 1 

​	1 =  $\frac {1(1+1)}{2}$ = 1 

**Inductive Step**: P(k)  → P(k+1)

​	**Inductive Hypothesis:** P(k) = 1 + 2 + 3 + ... + k = $\frac {k(k+1)}{2}$

​	**Must Show P(k+1)** = 1 + 2 + 3 + ... + k + (k+1) = $\frac {(k+1)((k+1)+1)}{2} = \frac {(k+1)(k+2)}{2}$

|                          LHS | RHS                                     | Steps                           |
| ---------------------------: | --------------------------------------- | ------------------------------- |
| 1 + 2 + 3 + ... + k +(k+1) = | $\frac {k(k+1)}{2}$+(k+1)               | Add (k+1) to both sides of P(k) |
|                            = | $\frac {k(k+1)}{2} + \frac {2(k+1)}{2}$ | Get common denominator          |
|                            = | $\frac {k(k+1)+2(k+1)}{2}$              | Get common denominator          |
|                            = | $\frac {(k+1)(k+2)}{2}$                 | Factor by grouping              |
|                              | $\frac {(k+1)(k+2)}{2}$                 | = Result of P(k+1)              |



ex. Use mathematical induction to show that for all non-neg integers n, 1 + 2 + 2^2^ + ... + 2^n^ = 2^n+1^ - 1

non-negative integers means integers  $n \geq 0$

Let P(n): 1 + 2 + 2^2^ + ... + 2^n^ = 2^n+1^ - 1

**Basis Step:** 

​	P(0): n = 2^0^ 

​	2^0^ = 1 = 2^0+1^ - 1 = 2 - 1 = 1 

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** 1 + 2 + 2^2^ + ... + 2^k^ = 2^k+1^ - 1

​	**Must Show P(k+1):** 1 + 2 + 2^2^ + ... + 2^k^ + 2^k+1^ = 2^(k+1)+1^ - 1 = 2^k+2^ - 1

|                                  LHS | RHS                 | Steps                                                      |
| -----------------------------------: | ------------------- | ---------------------------------------------------------- |
| 1 + 2 + 2^2^ + ... + 2^k^ + 2^k+1^ = | 2^k+1^ - 1 + 2^k+1^ | Add 2^k+1^ to both sides of P(k)                           |
|                                    = | 2(2^k+1^)-1         | Combine like terms                                         |
|                                    = | 2^1^(2^k+1^)-1      | Properties of exponents                                    |
|                                    = | 2^k+2^-1            | Properties of exponents                                    |
|                                      | 2^k+2^-1            | = Result of P(k+1), P(n) is true for all $n \geq 0$, n ∈ Z |



ex. Prove 1 + 3 + 5 + ... + (2n - 1) = n^2^ for first n positive odd integers

Let P(n): 1 + 3 + 5 + ... + (2n - 1) = n^2^

**Basis Step:** 

​	P(1) = 2n-1

​	2(1) - 1 = 1 = 1^2^ = 1

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** 1 + 3 + 5 + ... + (2k - 1) = k^2^

​	**Must Show P(k+1):** 1 + 3 + 5 + ... + (2k - 1) + (2k+1) = (k+1)^2^; (2k+1) as that 2 more (odd integer)

|                                   LHS | RHS           | Steps                            |
| ------------------------------------: | ------------- | -------------------------------- |
| 1 + 3 + 5 + ... + (2k - 1) + (2k+1) = | k^2^ + (2k+1) | Add (2k+1) to both sides of P(k) |
|                                     = | k^2^ + 2k + 1 | Expand and organize the terms    |
|                                     = | (k+1)^2^      | Factor                           |
|                                       | (k+1)^2^      | = Result of P(k+1)               |

### Proving Inequalities

ex. Prove n < 2^n^ ∀n ∈ Z^+^ using mathematical induction

Let P(n): n < 2^n^

**Basis Step:** 

​	P(1) = n

​	1 < 2^1^ $\equiv$ 1 < 2

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** k < 2^k^

​	**Must Show P(k+1):** k+1 < 2^k+1^

|    LHS | RHS         | Steps                                                        |
| -----: | ----------- | ------------------------------------------------------------ |
| k +1 < | 2^k^ + 1    | Add 1 to both sides of P(k)                                  |
|      < | 2^k^ + 2^k^ | As P(1) showed that 1 < 2^k^  ∀n ∈ Z^+^ so replace 1 with 2^k^ |
|      < | 2(2^k^)     | Factor                                                       |
|      < | 2^1^(2^k^)  | Properties of exponents                                      |
|      < | 2^k+1^      | Properties of exponents                                      |
|        | 2^k+1^      | = Result of P(k+1)                                           |



ex. Prove 2^n^ < n!  ∀n ∈ Z^+^ and $n \geq 4$

Let P(n): 2^n^ < n!

**Basis Step:** 

​	P(4) = 2^n^

​	 2^4^ < 4! $\equiv 16 < 4 * 3 * 2 * 1 \equiv 16 < 24$

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** 2^k^ < k!

​	**Must Show P(k+1):** 2^k+1^ < (k+1)!

|           LHS | RHS        | Steps                                               |
| ------------: | ---------- | --------------------------------------------------- |
| 2^k^ * 2^1^ < | k! * 2^1^  | Multiply 2^1^ to both sides of P(k)                 |
|      2^k+1^ < | k! * (k+1) | (k+1) > 2 so replace 2 with (k+1)                   |
|             < | k(k+1)!    | Formatting                                          |
|             < | (k+1)!     | k! = k * k-1 ..., so (k+1)! = (k+1) * k * (k-1) ... |
|               | (k+1)!     | = Result of P(k+1)                                  |

ex. Prove 3^n^ > 2n for all integer $n \geq 1$

Let P(n):  3^n^ > 2n

**Basis Step:**

​	P(1) = 3^n^

​	3^1^ > 2(1) $\equiv 3 > 2$

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** 3^k^ > 2k

​	**Must Show P(k+1):** 3^k+1^ > 2(k+1)

|           LHS | RHS       | Steps                               |
| ------------: | --------- | ----------------------------------- |
| 3^k^ * 3^1^ > | 2k * 3^1^ | Multiply 3^1^ to both sides of P(k) |
|       3^k+1^> | 6k        | Simplification                      |
|             > | 2(k+1)    | Since 6k > 2(k+1) for $k \geq 1$    |
|             > | 2(k+1)    | = Result of P(k+1)                  |

Note: $6k > 2(k+2) \equiv 6k > 2k+2 \equiv k > \frac{1}{2}$

ex.  Prove $1+\frac{1}{4}+\frac{1}{9}+...+\frac{1}{n^2}\leq 2 - \frac{1}{n}$ for integer $n \geq 1$

Let P(n): $1+\frac{1}{4}+\frac{1}{9}+...+\frac{1}{n^2}\leq 2 - \frac{1}{n}$

**Basis Step:** 

​	P(1) = $\frac{1}{n^2}$

​	$\frac{1}{1^2} \leq 2 - \frac{1}{n} \equiv 1 \leq 2 - 1 \equiv 1 \leq 1$

**Inductive Step:** P(k)  → P(k+1)

​	**Inductive Hypothesis:** $1+\frac{1}{4}+\frac{1}{9}+...+\frac{1}{k^2}\leq 2 - \frac{1}{k}$

​	**Must Show P(k+1):** $1+\frac{1}{4}+\frac{1}{9}+...+\frac{1}{k^2}+\frac{1}{(k+1)^2}\leq 2 - \frac{1}{k+1}$

|                                                          LHS | RHS                                 | Steps                                                        |
| -----------------------------------------------------------: | ----------------------------------- | ------------------------------------------------------------ |
| $1+\frac{1}{4}+\frac{1}{9}+...+\frac{1}{k^2}+\frac{1}{(k+1)^2}\leq$ | $2 - \frac{1}{k}+\frac{1}{(k+1)^2}$ | Add $\frac{1}{(k+1)^2}$ to both sides of P(k)                |
|                                                       $\leq$ | $2 - \frac{1}{k+1}$                 | Since $2 - \frac{1}{k}+\frac{1}{(k+1)^2} \leq 2 - \frac{1}{k+1}$ for $k \geq 1$ * |
|                                                              | $2 - \frac{1}{k+1}$                 | = Result of P(k+1)                                           |

Note: $2 - \frac{1}{k}+\frac{1}{(k+1)^2} \leq 2 - \frac{1}{k+1} \equiv \frac{1}{(k+1)^2} \leq \frac{1}{k(k+1)}$

# Strong Induction and Well-Ordering

## The Well-Ordering Principle

* Every non-empty set of non-negative integers has a least element.
  * If Z^+^ then least element will be n = 1
  * If non-negative integers then least element will be n = 0

### Using Induction

**ex.** Prove that every amount of postage of 0.12 dollars or more can be formed using 0.04 dollars and 0.05 dollars stamps.

Let P(n) be the statement that postage of n-cents can be formed using 4-cent and 5-cent stamps if $n \geq 12$

**Basis Step:** Show postage of 12-cents can be made

​	12-cents = 3(4)-cent stamps

**Inductive Step:** Show if P(k) is true, then P(k+1) is true for $k \geq 12$ 

​	**Inductive Hypothesis:** We can have postage of k-cents using 4- and 5-cent stamps

​	**Must Show P(k+1):** I can make postage of k+1 cents using 4- and 5-cent stamps

​	**Case 1:** I have used one or more 4-cent stamps

​		If I have used a 4-cent stamp for k-cent postage, then I can replace my 4-cent stamp with a 5-cent 		stamp. $\therefore$ k+1 postage was formed.

​	**Case 2:** I have NOT used a 4-cent stamp

​		If no 4-cent stamp was used, then I have used at least 3 5-cent stamps because $n\geq 12$, so I can 		replace 3 5-cent stamps with 4 4-cent stamps $\therefore$ k+1 postage was formed. 

### Using Strong Induction

**ex.** Prove that every amount of postage of 0.12 dollars or more can be formed using 0.04 dollars and 0.05 dollars stamps.

Let P(n) be the statement that postage of n-cents can be formed using 4-cent and 5-cent stamps if $n \geq 12$

**Basis Step:** Show postage of 12, 13, 14, and 15-cents can be made

​	12-cents = 3(4)-cent stamps

​	13-cents = 2(4)-cent stamps + 1(5)-cent stamp

​	14-cents = 1(4)-cent stamps + 2(5)-cent stamps

​	15-cents = 3(5)-cent stamps

**Inductive Step:** Show if P(j) is true, for $12 \leq j\leq k$, where $k \geq 15$, then P(k+1) is true. 

​	**Inductive Hypothesis:** P(k-3) is true

​	**Must Show P(k+1):**

​		If I can make postage of k-3 cents, then I can make postage of k+1 cents by adding a 4-cent stamp