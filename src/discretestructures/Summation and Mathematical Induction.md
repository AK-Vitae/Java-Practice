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



# Mathematical Induction

### Proving Equals

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