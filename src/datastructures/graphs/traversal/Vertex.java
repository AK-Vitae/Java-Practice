package datastructures.graphs.traversal;

class Vertex {
    String name;
    Neighbor adjList;

    Vertex(String name, Neighbor neighbors) {
        this.name = name;
        this.adjList = neighbors;
    }
}
