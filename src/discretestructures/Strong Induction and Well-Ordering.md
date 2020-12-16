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

## Using Strong Induction

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