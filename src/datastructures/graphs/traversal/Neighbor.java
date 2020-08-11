package datastructures.graphs.traversal;

class Neighbor {
    public int vertexNum;
    public Neighbor next;

    public Neighbor(int vnum, Neighbor nbr) {
        this.vertexNum = vnum;
        next = nbr;
    }
}
