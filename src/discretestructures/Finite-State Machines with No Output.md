# Finite-State Machines with No Output

## Set of Strings

Suppose that A and B are subsets of V^*^, where V is a vocabulary. 

* The concatenation of A and B, denoted by AB, is the set of all strings of the form xy, where x is a string in A and y is a string in B.

Suppose that A is a subset of V^*^. 

* Then the **Kleene closure** of A, denoted by A^∗^ , is the set consisting of concatenations of arbitrarily many strings from A.

### String Concatenation

**ex.** Let A = {0,11} and B = {00,01}. Find each of these sets:

1. AB

   AB = {000, 001, 110, 1101}

2. BA

   BA = {000, 010, 0011, 0111}

3. A^2^

   A^2^ = {00, 011, 110, 1111}

### Describe the elements

**ex.** Describe the elements of the set A^∗^ for these values of A.

1. {10}

   Solution: {(10)^n^|n = 0,1,2,...}

2. {111}

   Solution: {1^3n^|n = 0,1,2,...}

3. {0,01}

   Solution: The set of strings where every 1 is immediately preceded by a 0.

### Determining if a string is part of a set

**ex**. Determine whether the string 11101 is in each of these sets.

1. {0,1}*

   Yes

2.  {1}^∗^{0}^∗^{1}^∗^

   Yes

   Possible other sets produced: 101, 1101, 110001, 110001111

3.  {11}{0}^∗^{01}

   No

   Possible other sets produced: 11001, 110001, 1100001

4.  {11}^∗^{01}^∗^

   No

   Possible other sets produced: 1101, 111101, 11110101

5.  {111}^∗^{0}^∗^{1}

   Yes

   Possible other sets produced: 11111101, 111111001

6.  {11,0}{00,101}

   Yes

   Possible other sets produced: 1100, 000, 0101

## Finite-State Automata

Finite-state automata are finite-state machines with no output.
A finite-state automaton M = (S,I,f,s~0~,F) consists of

* a finite set S of states
* a finite input alphabet I
* a transition function f (f : S × I → S)
* an initial state s~0~
* a finite set F of final states (or accepting states)

When drawing a diagram, make a node for garbage collection for invalid inputs. 

If s~0~ is an accepted state then the automata recognizes empty strings.

### Constructing a deterministic finite-state automaton when given only a description

**ex**. Construct a deterministic finite-state automaton that recognizes the set of all bit strings beginning with 01.

1. Create possible valid and invalid inputs:

   ​	Inputs that will be recognized: 01, 010, 011, 0110, 0111

   ​	Inputs that won't be recognized: 10, 11, 11001, 001

   Create Table:

|           |   f   |   f   |
| :-------: | :---: | :---: |
| **State** | **0** | **1** |
|   s~0~    | s~1~  | s~3~  |
|   s~1~    | s~2~  | s~3~  |
|   s~2~    | s~2~  | s~2~  |
|   s~3~    | s~3~  | s~3~  |

​		Construct Diagram:

![image-20201221183150564](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines without Outputs Deterministic finite-state automaton ex 1.png)

2. Create possible valid and invalid inputs:

   ​	Inputs that will be recognized: 000, 1000, 10001, 101010

   ​	Inputs that won't be recognized: 10, 11, 11001, 001

   Create Table:

|           |   f   |   f   |
| :-------: | :---: | :---: |
| **State** | **0** | **1** |
|   s~0~    | s~1~  | s~0~  |
|   s~1~    | s~2~  | s~1~  |
|   s~2~    | s~3~  | s~2~  |
|   s~3~    | s~4~  | s~3~  |
|   s~4~    | s~4~  | s~4~  |

​		Construct Diagram:

![image-20201221183839569](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines without Outputs Deterministic finite-state automaton ex 2.png)

## Language Recognition by Finite-State Machines

A string x is said to be recognized or accepted by the machine M = (S,I,f,s~0~,F) if it takes the initial state s~0~ to a final state, that is f(s~0~,x) is a state in F. The language recognized or accepted by the machine M, denoted by L(M), is the set of all strings that are recognized by M. **Two finite-state automata are called equivalent if they recognize the same language.**

### Finding recognized language given a finite-state automaton

**ex.** Find the language recognized by the given deterministic finite-state automaton.

1. 

![image-20201221180824139](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines without Outputs Language Recognition ex 1.png)

Solution: {0,10, 11}{0,1}^*^

2. 

![image-20201221181530666](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines without Outputs Language Recognition ex 2.png)

Solution: {0}^*^{1}{1}^*^

* Initial 0 input will cause loop until a follow up 1 is added

## Nondeterministic Finite State Automata

A nondeterministic finite-state automaton M = (S,f,I,s~0~,F) consists of

* a finite set S of states
* a finite input alphabet I
* a transition function f (f : S × I → P(S))
* an initial state s~0~
* a finite set F of final states

* If the language L is recognized by a nondeterministic finite-state automaton M~0~ , then L is also recognized by a deterministic finite-state automaton M~1~ 

### Finding recognized language given a nondeterministic finite-state automaton

**ex**. Find the language recognized by the given nondeterministic finite-state automaton.

![image-20201221184026161](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines without Outputs nondeterministic finite-state automaton ex.png)

Accepts empty strings (λ)

Accepts {0^n^1^m^|n,m $\geq$ 1}

Accepts {01^m^|m $\geq$ 0}

$\therefore \{\lambda\}\cup \{0^n1^m|n,m\geq1\}\cup\{01^m|m\geq0\}$

