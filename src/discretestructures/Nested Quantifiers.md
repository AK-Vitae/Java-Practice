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