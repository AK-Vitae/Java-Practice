# Rules of Inference

**Argument:** a sequence of propositions p<sub>1</sub>, p<sub>2</sub> ... p<sub>n</sub>

* All but the final proposition in the argument are called **premises**
* The final proposition is called the **conclusion**
* An argument is valid if the truth of all its premises implies that the conclusion is true.
* p<sub>1</sub>, p<sub>2</sub> ... p<sub>n</sub> and conclusion q is valid, when (p<sub>1</sub> ∧ p<sub>2</sub> ∧ ··· ∧ p<sub>n</sub> ) → q is a tautology.



| Rule of Inference            | Tautology                                                    | Name                                         |
| ---------------------------- | ------------------------------------------------------------ | -------------------------------------------- |
| p<br/>p → q<br/>∴ q          | (p ∧ (p → q)) → q                                            | Modus Ponens                                 |
| ¬q<br/>p → q<br/>∴ ¬p        | (¬q ∧ (p → q)) → ¬p<br/>≡ (¬q ∧ (¬q → ¬p)) → ¬p              | Modus Tollens                                |
| p → q<br/>q → r<br/>∴ p → r  | ((p → q) ∧ (q → r)) → (p → r)                                | Hypothetical Syllogism (Transitive Property) |
| p ∨ q<br/>¬p<br/>∴ q         | ((p ∨ q) ∧ ¬p) → q<br/>* p or q occurred but p didn't occur implies that q occurred | Disjunctive Syllogism                        |
| p<br/>∴ p ∨ q                | p → (p ∨ q)                                                  | Addition                                     |
| p ∧ q<br/>∴ p                | (p ∧ q) → p<br/>(p ∧ q) → q                                  | Simplification                               |
| p<br/>q<br/>∴ p ∧ q          | ((p) ∧ (q)) → (p ∧ q)                                        | Conjunction                                  |
| p ∨ q<br/>¬p ∨ r<br/>∴ q ∨ r | ((p ∨ q) ∧ (¬p ∨ r)) → (q ∨ r)<br/>* if p = T then ¬p = F, which makes q = T and r can be T or F<br/>* if p = F then ¬p = T, which makes q = T or F and r = T | Resolution                                   |

ex. From the proposition p ∧ (p → q), show that q is a conclusion

| Statement   | Reason                                     |
| ----------- | ------------------------------------------ |
| p ∧ (p → q) | Premise                                    |
| P           | Simplification on 1: (p ∧ q) → p           |
| p → q       | Simplification on 2: (p ∧ q) → q           |
| q           | Modus Ponens on 2 and 3: (p ∧ (p → q)) → q |

ex. From the propositions p, p → ¬q, and ¬q → ¬r, show that ¬r is a conclusion

| Statement | Reason                                     |
| --------- | ------------------------------------------ |
| p         | Premise                                    |
| p → ¬q    | Premise                                    |
| ¬q        | Modus Ponens on 1 and 2: (p ∧ (p → q)) → q |
| ¬q → ¬r   | Premise                                    |
| ¬r        | Modus Ponens on 3 and 4: (p ∧ (p → q)) → q |