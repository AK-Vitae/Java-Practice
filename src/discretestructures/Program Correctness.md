# Program Correctness

A program, or program segment, S is said to be partially correct with respect to the initial assertion p and the final assertion q if whenever p is true for the input values of S and S terminates, then q is true for the output values of S. The notation p{S}q indicates that the program, or program segment, S is partially correct with respect to the initial assertion p and the final assertion q.

## Base Case: p{S}q

* p is true for input values of S

* S executes and terminates

* q is true for output values of S

* $\therefore p\{S\}q$ is true

  

**ex.** Prove that the program segment is correct with respect to the initial assertion x = 0 and the final assertion z = 1.

```
y := 1
z := x + y
```

p: x = 0 is true

S executes and terminates: y = 1 and z = 0 + 1 = 1

q: z = 1

$\therefore p\{S\}q$ is true and program segment is correct

## Program with subprograms: p\{S~1~;S~2~}q​

* For p{S~1~}q
  * p is true for input values of S~1~
  * S~1~ executes and terminates
  * q is true for output values of S~1~
* For p{S~2~}q
  * q is true for input values of S~2~
  * S~2~ executes and terminates
  * r is true for output values of S~2~
* $\therefore p\{S_1;S_2\}q$ is true

## p{if condition then S}q

* For (p ∧ condition){S}q
  * p is true for input values of S AND condition is also true
  * S executes and terminates
  * q is true for output values of S
* For (p ∧ ¬condition) → q
  * p is true for input values of S AND condition is false
  * S does NOT execute
  * q is true
* $\therefore p\{if\space condition\space then\space S\}q$ is true

## p{if condition then S~1~ else S~2~}q

* For (p ∧ condition){S~1~}q

  * p is true for input values of S = S~1~;S~2~ AND condition is also true
  * S~1~ executes and terminates
  * q is true for output values of S~1~

* For (p ∧ ¬condition) → q

  * p is true for input values of S = S~1~;S~2~ AND condition is false
  * S~2~ executes and terminates
  * q is true

* $\therefore p\{if\space condition\space then\space S_1\space else\space S_2\}q$ is true

  

**ex**. Verify that the program segment is correct with respect to the initial assertion y = 3 and the final assertion z = 6.

```
x := 2
z := x + y
if y > 0 then
	z := z + 1
else
	z := 0
```

p: y = 3 $\therefore$ x = 2 and z = 5 and condition is true 3 > 0

S~1~ executes and terminates: z = 5 + 1 = 6

q: z = 6

$\therefore p\{if\space condition\space then\space S_1\space else\space S_2\}q$ is true and program segment is correct

## Loop Invariants: p{while condition S}(¬ condition ∧ p)

* p is a loop invariant if  (p ∧ condition){S}p is true
  * p is true prior to first iteration of the loop
  * If p is true before an iteration of the loop, it remains true before the next iteration
* Suppose p is proven to be a loop invariant
  * p is true for input values of S
  * Condition is true and S executes and terminates
  * p is true AND condition is false
* $\therefore$ p{while condition S}(¬ condition ∧ p)