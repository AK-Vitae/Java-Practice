# Turing Machines

A Turing machine consists of a finite state control unit and a tape divided into cells that expands infinitely in both directions. 

The control unit:

* is in one state of finitely many different states at any one step
* has read and write capabilities on the tape as the control unit moves left and right on the tape

A Turing machine is the most general model of computation. They can model all computations that are performed on a computer.

## Formal Definition of Turing Machine

A Turing machine T = (S,I,f,s~0~) consists of

* a finite set S of states
* an alphabet I containing the blank symbol B
* a partial function f (f : S × I → S × I × {R,L})
  * The five-tuple (state, symbol, state, symbol, direction) corresponding to the partial function are called transition rules
* a starting state s~0~

**Transition in Turing Machines**

* If the control unit is in state s and if the partial function f is defined for the pair (s,x) with
  **f(s,x) = (s~0~ ,x~0~ ,d) (corresponding to the five-tuple (s,x,s~0~,x~0~,d))**, the control unit will

1. **Enter the state s~0~**
2. Write the symbol **x~0~ in the current cell, thus erasing x**
3. Move **right one cell if d = R**, or **left one cell if d = L**

* **If the partial function f is undefined for the pair (s,x), then the Turing machine T will halt.**

* At the initial state s~0~, the control head is positioned either
  * over the **leftmost nonblank symbol on the tape**
  * over **any cell if the tape is all blank**

**Recognizing Sets**

A **final state of a Turing machine T is a state that is not the first state** in any five-tuple in the description of T using five-tuples.

Let V be a subset of an alphabet I. A Turing machine T = (S,I,f,s~0~ ) recognizes a string x in V^∗^ if and only if T, starting in the initial position when x is written on the tape, halts in a final state. T is said to recognize a subset A of V^∗^ if x is recognized by T if and only if x belongs to A.

### Determining final tape from given five-tuples and initial tape

**ex**. Let T be the Turing machine defined by the five-tuples: (s~0~ ,0,s~1~ ,1,R), (s~0~ ,1,s~1~ ,0,R), (s~0~,B,s~1~,0,R),            (s~1~,0,s~2~ ,1,L), (s~1~,1,s~1~,0,R), and (s~1~,B,s~2~,0,L). For each of these initial tapes, determine the final tape when T halts, assuming that T begins in initial position.

To make life easier put tuples into a vertical layout or table:

(s~0~,0,s~1~,1,R)

(s~0~,1,s~1~,0,R)

(s~0~,B,s~1~,0,R)

(s~1~,0,s~2~ ,1,L)

(s~1~,1,s~1~,0,R)

(s~1~,B,s~2~,0,L)

| Initial State | Symbol (0, 1) | Destination State | Symbol (0, 1) | Direction (L or R) |
| ------------- | ------------- | ----------------- | ------------- | ------------------ |
| s~0~          | 0             | s~1~              | 1             | R                  |
| s~0~          | 1             | s~1~              | 0             | R                  |
| s~0~          | B             | s~1~              | 0             | R                  |
| s~1~          | 0             | s~2~              | 1             | L                  |
| s~1~          | 1             | s~1~              | 0             | R                  |
| s~1~          | B             | s~2~              | 0             | L                  |



1. B B 0 0 1 1 B B

   s~0~: B B **0** 0 1 1 B B

   s~1~: B B 1 **0** 1 1 B B

   s~2~: B B **1** 1 1 1 B B

   1111

2. B B 1 0 1 B B B

   s~0~: B B **1** 0 1 B B B

   s~1~: B B 0 **0** 1 B B B

   s~2~: B B **0** 1 1 B B B

   011

3. B B B B B B B B

   s~0~: **B** B B B B B B B

   s~1~: 0 **B** B B B B B B

   s~2~: 0 0 B B B B B B

   00

### Turing machine output when given five-tuples and input

**ex**. What does the Turing machine described by the five-tuples (s~0~,0,s~0~,0,R), (s~0~,1,s~1~,0,R), (s~0~,B,s~2~,B,R),         (s~1~,0,s~1~,0,R), (s~1~,1,s~0~,1,R), and (s~1~,B,s~2~,B,R) do when given:

To make life easier put tuples into a vertical layout or table:

(s~0~,0,s~0~,0,R)

(s~0~,1,s~1~,0,R)

(s~0~,B,s~2~,B,R)

(s~1~,0,s~1~,0,R)

(s~1~,1,s~0~,1,R)

(s~1~,B,s~2~,B,R)

1. 1 1

   s~0~: **1** 1 B B B B B B 

   s~1~: 0 **1** B B B B B B 

   s~0~: 0 1 **B** B B B B B 

   s~2~: 0 1 B **B** B B B B 

   01

2. an arbitrary bit string

   This machine will read in a string and flip every other 1, starting with the first 1, in the bit string.

### Constructing a Turing machine when given a description

**ex.** Construct a Turing machine with tape symbols 0, 1, and B that, when given a bit string as input, replaces the first 0 with a 1 and does not change any of the other symbols on the tape.

if (s~0~, 0) then (s~1~, 1) then move R

if (s~0~, 1) then (s~0~, 1) then move R

$\therefore$ (s~0~, 0, s~1~, 1, R), (s~0~, 1, s~0~, 1, R)

**ex.** Construct a Turing machine with tape symbols 0, 1, and B that, when given a bit string as input, replaces all but the leftmost 1 on the tape with 0s and does not change any of the other symbols on the tape.

if (s~0~, 0) then (s~0~, 0) then move R

if (s~0~, 1) then (s~1~, 1) then move R

if (s~1~, 0) then (s~1~, 0) then move R

if (s~1~, 1) then (s~1~, 0) then move R

$\therefore$ (s~0~, 0, s~0~, 1, R), (s~0~, 1, s~1~, 1, R), (s~1~, 0, s~1~, 0, R), (s~1~, 1, s~1~, 0, R), 

**ex.**  Construct a Turing machine that recognizes the set of all bit strings that end with a 0.

if (s~0~, 0) then (s~1~, 0) then move R

if (s~0~, 1) then (s~0~, 1) then move R

if (s~1~, 0) then (s~1~, 0) then move R

if (s~1~, 1) then (s~0~, 1) then move R

if (s~1~, B) then (s~2~, B) then move R

$\therefore$ (s~0~, 0, s~1~, 0, R), (s~0~, 1, s~0~, 1, R), (s~1~, 0, s~1~, 0, R), (s~1~, 1, s~0~, 1, R), (s~1~, B, s~2~, B, R)

**ex**. Construct a Turing machine that recognizes the set of all bit strings that contain an even number of 1s.

if (s~0~, 0) then (s~0~, 0) then move R

if (s~0~, 1) then (s~1~, 1) then move R

if (s~1~, 0) then (s~1~, 0) then move R

if (s~1~, 1) then (s~0~, 1) then move R

if (s~0~, B) then (s~2~, B) then move R

$\therefore$ (s~0~, 0, s~0~, 0, R), (s~0~, 1, s~1~, 1, R), (s~1~, 0, s~1~, 0, R), (s~1~, 1, s~0~, 1, R), (s~0~, B, s~2~, B, R)