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

* Assume n is even. So n = 2k,  k ∈ Z by definition of an even integer
  * 3n+2 = 3(2k)+2
  * 3n+2 = 6k+2
  * 3n+2 = 2(3k+1)
  * 3n+2 = 2r where r = 3k + 1, r ∈ Z
  * Therefore 3n + 2 is even when n is odd and then by contraposition 3n + 2 is odd when n is odd