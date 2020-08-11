# Graphs

## Basic Definitions:

A graph **G** is an ordered pair of a set **V** of vertices and a set **E** of edges.

- G  = (V, E)
- **Ordered pair:** (a,b) != (b,a) if a != b; order matters
- **Unordered pair:** {a,b}; set of two elements and order does not matter
- **Vertex:** Each node of the graph is represented as a vertex.
- **Edge:** Edge represents a path between two vertices or a line between two vertices.
  - **Undirected:** Connection is two way; (u,v) = (v,u)
  - **Directed:** Connection is one way: (u,v) != (v,u)



**Degree of a vertex:**

- Undirected = number of neighbors to a vertex
- Directed:
  - **In-degree:** number of edges coming to a vertex
  - **Out-degree:** number of edges coming out of a vertex

## Properties of Graphs

**Number of edges** if vertices = n:

* Directed: Maximum number of edges = **n(n-1)**
* Undirected: Maximum number of edges = **n(n-1)/2**

**Dense Graph**: When there is close to maximum number of edges

**Sparse Graph**: When the number of edges is close to number of vertices

**Walk:** A sequence of vertices where each adjacent pair is connected by an edge

**Path:** A walk in which no vertices (an thus no edges) are repeated

**Closed Walk:** Is a walk that starts and ends at the vertex, and have a length > 0

* **Length of Walk/Path** = Number of edges in the walk/path

**Strongly Connected Graph:** A graph with a path from any vertex to any other vertex

**Simple Cycle:** A closed walk that has no repetition of other vertices than start and end

**Acyclic Graph:**  A graph with no cycle

**Complete Graphs:**

* Undirected: A simple undirected graph in which every pair of distinct vertices is connected by a unique edge
* Directed: A complete directed graph (digraph) is a type of directed graph where every pair of distinct vertices is connected by a pair of unique edges which are going in opposite directions.



## Graph Representation

### Edge List

* **Vertex List:** 1 List to store vertices with name of the Nodes
* **Edge List:** 1 List to store edges with **objects that recorded references to the two endpoint indices of an edge, from vertex list, and the weight of that edge**

* If E = number of edges the time complexity for finding adjacent nodes or to check if given nodes are connected is **O(E), which is not very efficient**. 

### Adjacency Matrix

* **Vertex List:** 1 List to store vertices with name of the Nodes
* **Edge Adjacency Matrix:** 2 Dimensional Array size V * V
* If E = number of edges and V = number of vertices, the time complexity for finding adjacent nodes is **O(V)** and to check if given nodes are connected is **O(1) if a hash table is implemented**. However the adjacency matrix that is created uses **O(V<sup>2</sup>) of space** which maybe wasteful in many cases.

### Adjacency List

* **Vertex List with an associated linked list of neighbors**
* No wastage of space however there is **loss of random access**.