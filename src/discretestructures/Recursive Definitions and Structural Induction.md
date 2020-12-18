# Recursive Definitions and Structural Induction

## Recursively Defined Functions

**Basis Step**: Specifies the value of the function for the first terms(s)

* Initial conditions

**Recursive Step**: Gives a rule for finding subsequent values using a previous value(s) beginning at those defined in the basis step.

* Function

  

**ex.** If $f$ is defined recursively by $f(0) = 2$ and $f(n+1) = 3f(n) - 1$, find $f(1)$, $f(2)$, $f(3)$ and $f(4)$

* $f(n+1) = 3f(n) - 1 \equiv f(n) = 3(f(n-1)) - 1$

  **Basis Step**:  $f(0) = 2$

  **Recursive Step**: $f(n) = 3(f(n-1)) - 1$

  $f(1) = 3f(0)-1 = 3(2)-1 = 5$

  $f(2) =3f(1)-1 = 3(5)-1 = 14$

  $f(3) = 3f(2)-1 = 3(14)-1 = 41$

  $f(4) = 3f(3)-1 = 3(41)-1 = 122$

  

**ex.** Give a recursive definition for a^n^ for $a\in\R$ and non-negative and $n\in\Z^+$

​	$a^0 = 1$

​	$a^1 = 1*a$

​	$a^2 = a*a$

​	$a^3 = a^2*a$

​	$a^4 = a^3*a$

​	$\therefore$ 	

​	Initial conditions(s): $a^0 = 1$

​	Recursive Function: $a^n = a^{n-1}*a\space for \space n\geq1$



**ex**. Give a recursive definition of the sequence {${a_n}$}$, n = 1,2,3 ... $ if $a_n = 2n+1$

​	$a^0 = 2(0)+1 = 0+1 = 1$

​	$a^1 = 2(1)+1 = 2+1 = 3$

​	$a^2 = 2(2)+1 = 4+1 = 5$

​	$a^3 = 2(3)+1 = 6+1 = 7$

​	$a^4 = 2(4)+1 = 8+1 = 9$

​	$\therefore$ 	

​	Initial conditions(s): $a_0 = 1$

​	Recursive Function: $a_n = a_{n-1}+2$ for $n\geq1$



## Recursively Defined Sets

**Basis Step**: Specifies an initial collection of elements

**Recursive Step**: Gives rules for forming new elements from those already in the set



**ex**. Let S be a subset of the integers defined recursively by: 

​	**Basis Step**: $7\in S$

​	**Recursive Step**: If $x\in S$ and $y\in S$, then $x+y\in S$

​	List the elements of S produced by the first 5 applications of the recursive definition

 	1. 7
 	2. 7+7 = 14
 	3. 7+14 = 21
 	4. 7+21 = 28
 	5. 7+28 = 35

### Mathematical Induction

Let A be the set of all integers divisible by 7 $\therefore$ A = 7n. To prove A = S, we must show $A \subseteq S$ and $S\subseteq A$

$A \subseteq S$ Proof:

Let P(n) be the statement $7n\in S$ (Derived from A = 7n. To prove A = S). 

​	**Basis Step:**  $n = 1\therefore 7*1 = 7\in S$

​	**Inductive Step:** P(k)  → P(k+1)

​		**Inductive Hypothesis:** $7k\in S$

​		**Must Show P(k+1):** 

​			If $7k\in S$ then $7k+7\in S$ since $7, 7k\in S$

​			$\therefore 7k+7 = 7(k+1)\in S$ and $A \subseteq S$

$S\subseteq A$ Proof:

​	**Basis Step:**  $A = 7n\therefore 7*1 \in A= 7\in A$

​	From the recursive step $x+y\in S$, and since $7/x$ and $7/y$, then $x = 7a$ and $y = 7b$ for some integers 	a and b. 

​	$x+y = 7a+7b = 7(a+b) \therefore$ using $A = 7n, x+y\in A$



### Structural Induction 

**Basis Step**: Show that the result holds for all elements specified in the basis step of the recursive definition. 

**Recursive Step**: Show that if the statement is true for all elements sued to construct new elements in the recursive step of the definition, the result hold for these new elements.



## Recursive Algorithms

* An algorithm is called recursive if it solve a problem by reducing it to an instance of the same problem with a smaller input

**ex.** Give a recursive algorithm for computing the greatest common divisor of two non-negative integers a and b with a < b. 

```
procedure gcd(a,b: non-negative integers, a<b)
if a = 0 
	then return b
else 
	return gcd(b mod a, a)
```

**ex**. Give a recursive algorithm for computing n!, where n is a non-negative integer

```
procedure factorial(n: non-negative integer)
if n = 0
	then return 1
else 
	return n*factorial(n-1)
```

**ex**. Give a recursive algorithm for computing a^n^ , where a is a non-zero real number and n is a non-negative integer

```
procedure power(a is non-zero real number, n non-negative integer)
if n = 0
	then return 1
else 
	return a*power(a,n-1)
```

Inductive Proof:

**Basis Step:** a^0^ = 1 for every non-zero real number a and power(a,0) = 1

**Inductive Step:** Assume power(a,k) = a^k^ for all $a \neq 0$

​	**Must Show:**  power(a,k+1) = a^k+1^

|          LHS | RHS          | Steps                   |
| -----------: | ------------ | ----------------------- |
| power(a,k+1) | a*power(a,k) |                         |
|            = | a*a^k^       | power(a,k) = a^k^       |
|            = | a^k+1^       | Properties of exponents |

$\therefore$ Algorithm is correct