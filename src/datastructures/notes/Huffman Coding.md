# Huffman Coding

Huffman Coding is a technique of compressing data to reduce its size without losing any of the details. It is generally useful to compress the data in which there are frequently occurring characters.



## Example

 Following frequencies for the symbols in a text:

" " : 0.34 

"e" : 0.29 

"o" : 0.18 

"d" : 0.07 

"f" : 0.04 

"p" : 0.04 

"." : 0.04 



### Building the Tree

| Frequency | 0.34 | 0.29 | 0.18 | 0.07 | 0.04 | 0.04 | 0.04 |
| --------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| Character | " "  | "e"  | "o"  | "d"  | "f"  | "p"  | "."  |

After merge:

| Frequency | 0.34 | 0.29 | 0.18 | 0.08          | 0.07 | 0.04 |
| --------- | ---- | ---- | ---- | ------------- | ---- | ---- |
| Character | " "  | "e"  | "o"  | internal node | "d"  | "f"  |

After merge:

| Frequency | 0.34 | 0.29 | 0.18 | 0.11          | 0.8           |
| --------- | ---- | ---- | ---- | ------------- | ------------- |
| Character | " "  | "e"  | "o"  | internal node | internal node |

After merge:

| Frequency | 0.34 | 0.29 | 0.19          | 0.18 |
| --------- | ---- | ---- | ------------- | ---- |
| Character | " "  | "e"  | internal node | "o"  |

After merge:

| Frequency | 0.37          | 0.34 | 0.29 |
| --------- | ------------- | ---- | ---- |
| Character | internal node | " "  | "e"  |

After merge:

| Frequency | 0.37          | 0.63          |
| --------- | ------------- | ------------- |
| Character | internal node | internal node |

After final merge:

| Frequency | 1.00 |
| --------- | ---- |
| Character | root |

![Huffman Tree](https://github.com/AK-Vitae/Java-Practice/blob/master/src/datastructures/notes/Huffman%20Tree.png)

### Encoding of Each Character

| "  "    | 00       |
| ------- | -------- |
| **"e"** | **01**   |
| **"o"** | **10**   |
| **"d"** | **1100** |
| **"f"** | **1101** |
| **"p"** | **1110** |
| **"."** | **1111** |



### Average Code Length

| Character | Probability | Code | bits | bits/character |
| --------- | ----------- | ---- | ---- | -------------- |
| "  "      | 0.34        | 00   | 2    | 0.68           |
| "e"       | 0.29        | 01   | 2    | 0.58           |
| "o"       | 0.18        | 10   | 2    | 0.36           |
| "d"       | 0.07        | 1100 | 4    | 0.28           |
| "f"       | 0.04        | 1101 | 4    | 0.16           |
| "p"       | 0.04        | 1110 | 4    | 0.16           |
| "."       | 0.04        | 1111 | 4    | 0.16           |

Average code length: 0.68+0.58+0.36+0.28+0.16+0.16+0.16 = **2.38 bits/character**