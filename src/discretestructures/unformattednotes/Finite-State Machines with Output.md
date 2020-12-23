# Finite-State Machines with Output

A finite-state machine M = (S,I,O,f,g,s~0~) consists of

* a finite set S of states
* a finite input alphabet I
* a finite output alphabet O
* a transition function f (f : S × I → S)
* an output function g (g : S × I → O)
* an initial state s 0

**Mealy machines**: outputs correspond to transitions between states

* If length of input is n then output length is n

**Moore machine**: output is determined only by the state

* If length of input is n then output length is n+1

## State Diagrams from State Tables

**ex.** Draw the state diagrams for the finite-state machines with these state tables.

1. |           |     f      |     f      |   g   |   g   |
   | :-------: | :--------: | :--------: | :---: | :---: |
   | **State** |   **0**    |   **1**    | **0** | **1** |
   |   s~0~    | s~1~ (0,0) | s~0~ (1,1) |   0   |   1   |
   |   s~1~    | s~0~ (0,0) | s~2~ (1,1) |   0   |   1   |
   |   s~2~    | s~1~ (0,0) | s~1~ (1,0) |   0   |   0   |

   *Add pairs to table to make things easier

   ![Finite-State Machines with Outputs ex 1a](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines with Outputs ex 1a.png)

2. |           |     f      |     f      |   g   |   g   |
   | :-------: | :--------: | :--------: | :---: | :---: |
   | **State** |   **0**    |   **1**    | **0** | **1** |
   |   s~0~    | s~1~ (0,0) | s~0~ (1,0) |   0   |   0   |
   |   s~1~    | s~2~ (0,1) | s~0~ (1,1) |   1   |   1   |
   |   s~2~    | s~0~ (0,0) | s~3~ (1,1) |   0   |   1   |
   |   s~3~    | s~1~ (0,1) | s~2~ (1,0) |   1   |   0   |

   *Add pairs to table to make things easier

   ![Finite-State Machines with Outputs ex 1b](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines with Outputs ex 1b.png)

## Output generated from input string, given a sequence

**ex**. Find the output generated from the input string 01110 for the finite-state machine with the state
table from previous example

1. Table 1: s~0~ → s~1~ → s~2~ → s~1~→ s~2~ → s~1~

   Solution: 

   ​	s~0~: 0 → **0** →s~1~: 1 → **1**→ s~2~: 1 → **0** → s~1~: 1 → 1 → s~2~: 0 → 0 → s~1~

   ​	Output: 01010

2. Table 2: s~0~ → s~1~ → s~0~ → s~0~ → s~0~ → s~1~

   Solution: 

   ​	s~0~: 0 → **0** →s~1~: 1 → **1**→ s~0~: 1 → **0** → s~0~: 1 → **0** → s~0~: 0 → **0** → s~1~

   ​	Output: 01000



## Constructing  finite state machine when given only a description

Construct a finite-state machine with output that produces a 1 if and only if the last 3 input bits read are 0s.

Create possible valid and invalid inputs:

​	Inputs that will produce 1: 000, 1000, 101000

​	Inputs that will not produce 1: 111, 1001, 0010

Create Table:

|           |     f      |     f      |   g   |   g   |
| :-------: | :--------: | :--------: | :---: | :---: |
| **State** |   **0**    |   **1**    | **0** | **1** |
|   s~0~    | s~1~ (0,0) | s~0~ (1,0) |   0   |   0   |
|   s~1~    | s~2~ (0,0) | s~0~ (1,0) |   0   |   0   |
|   s~2~    | s~2~ (0,1) | s~0~ (1,0) |   1   |   0   |

Construct Diagram:

![Finite-State Machines with Outputs ex 3](C:\Users\akshi\Documents\Computer Science\Java Practice\src\discretestructures\Note Images\Finite-State Machines with Outputs ex 3.png)