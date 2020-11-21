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