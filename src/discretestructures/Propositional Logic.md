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

|   Name       |   Symbol  |  Logic     | Definition     | Example |
|--------------|-----------|------------|---------------------|---------|
|  Proposition |    p     |     p      | A declarative statement | I **will** go shopping today|
|    Negation  |   ¬p      |  **not** p     | Contradiction of a statement | I will **not** go shopping today|
| Conjunction |p ∩ q| p **and** q |A compound proposition that is true **if and only if all** of its component propositions are true. | I will go to work **and** I will go shopping today|
|  Disjunction |p ∪ q| p **or** q  | A compound proposition that is true **if and only if at least one** of a number of alternatives is true. | John is at the library **or** John is studying|
| Exclusive Or |p ⊕ q| p **xor** q | A compound proposition that is true if and only if at least one of a number of alternatives is true exclusively.| This summer, I am going to London, **or** I am going to Paris |
| Conditional/Implication |p ⇒ q| **if** p **then** q | An if-then statement in which p is a hypothesis and q is a conclusion.  | **If** I do my homework, **then** I get an allowance. |
|Biconditional | p ⇔ q | p **if and only if** q | True whenever both parts have the same truth value| I will take out the trash **if and only if** you do the dishes |

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



## Truth Tables
* A representation of all the combinations of logical operators can be done through a tool called a "Truth Table" which can tell us the values of the propositions

* Rows: Need a row for every possible combination of values  for the  atomic propositions.

* Columns: 

  * Need a column for the compound proposition (usually at far right)
  * Need a column for the truth value of each expression that occurs in the compound proposition as it is built up.

* Truth Tables:
   * Proposition vs Negation

  |   p    |   ¬p  |
  |--------|-------|
  |    T   |   F   |
  |    F   |   T   |

   * Conjunction

  |   p    |   q   | p ∩ q |
  |--------|-------|-------|
  |    T   |   T   |   T   |
  |    T   |   F   |   F   |
  |    F   |   T   |   F   |
  |    F   |   F   |   F   |

    * Disjunction

  |   p    |   q   | p ∪ q |
  |--------|-------|-------|
  |    T   |   T   |   T   |
  |    T   |   F   |   T   |
  |    F   |   T   |   T   |
  |    F   |   F   |   F   |

    * Exclusive Or

  |   p    |   q   | p ⊕ q |
  |--------|-------|-------|
  |    T   |   T   |   F   |
  |    T   |   F   |   T   |
  |    F   |   T   |   T   |
  |    F   |   F   |   F   |

     * Conditional

  |   p    |   q   | p ⇒ q |
  |--------|-------|-------|
  |    T   |   T   |   T   |
  |    T   |   F   |   F   |
  |    F   |   T   |   T   |
  |    F   |   F   |   T   |

  * Biconditional

  |   p    |   q   | p ⇔ q |
  |--------|-------|-------|
  |    T   |   T   |   T   |
  |    T   |   F   |   T   |
  |    F   |   T   |   T   |
  |    F   |   F   |   T   |



