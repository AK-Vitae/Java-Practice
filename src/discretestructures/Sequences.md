# Sequences

$\sum_{n=1}^{\infty} 2^{-n}$

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