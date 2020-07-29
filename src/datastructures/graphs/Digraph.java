package datastructures.graphs;

public class Digraph<T> {
    private Object[] vertices;  // using Object instead of T[]
    private Object[] adjList;   // using Object instead of DLL<Integer>[]
    private int n,capacity;

    public Digraph(int capacity) {
        this.capacity=capacity;
        this.n=0;
        vertices=new Object[capacity];
        adjList=new Object[capacity];
        for (int i=0;i<this.capacity;i++) {
            DLL<Integer> myList=new DLL<Integer>();
            adjList[i]=(Object) myList;
        }
    }

    public Digraph() {
        this(100);
    }

    public int vertexNumberOf(T vertex) {
        // find the vertex, returns -1 if not found
        int i=0;
        while (i<this.n && !vertex.equals(vertices[i])) {
            i++;
        }
        if (i<this.n) return i;
        else return -1;
    }

    public T vertexInfoOf(int v) {
        @SuppressWarnings("unchecked")
        T vertex=(T)vertices[v];
        return vertex;
    }

    public int addVertex(T vertex) {
        // find out if the vertex is already in the graph

        int i=vertexNumberOf(vertex);
        if (i==-1) {
            if (this.n+1<=this.capacity) {
                this.n++;
                vertices[this.n-1]=(Object) vertex;
            }
            else {
                throw new IndexOutOfBoundsException();
            }
            return this.n-1;
        }
        return i;
    }

    public void addEdge(int v1, int v2) {
        @SuppressWarnings("unchecked")
        DLL<Integer> myList=(DLL<Integer>) adjList[v1];
        //traverse adjacency list to see if v1 is on the list
        Integer v=myList.getFirst();
        while (v!=null && !v.equals(v2)) {
            v=myList.getNext();
        }
        if (v==null) {
            myList.addLast(v2);
        } // else do nothing, the edge was already on the list
    }

    public void addEdge(T vertex1, T vertex2) {
        int v1=vertexNumberOf(vertex1);
        int v2=vertexNumberOf(vertex2);
        if (v1==-1 || v2==-1)
            throw new IndexOutOfBoundsException();
        addEdge(v1,v2);
    }

    public boolean containsEdge(int v1,int v2) {
        @SuppressWarnings("unchecked")
        DLL<Integer> myList=(DLL<Integer>) adjList[v1];
        Integer v=myList.getFirst();
        while (v!=null && !v.equals(v2)) {
            v=myList.getNext();
        }
        if (v!=null)
            return true;
        else
            return false;
    }

    public int firstNeighbor(int v) {
        @SuppressWarnings("unchecked")
        DLL<Integer> myList=(DLL<Integer>) adjList[v];
        Integer v2=myList.getFirst();
        return v2;
    }

    public int nextNeighbor(int v) {
        @SuppressWarnings("unchecked")
        DLL<Integer> myList=(DLL<Integer>) adjList[v];
        Integer v2=myList.getNext();
        if (v2!=null)
            return v2;
        else
            return -1;
    }

    public int numberOfVertices() {
        return this.n;
    }

    public static void main(String[] args) {
        Digraph<String> myGraph=new Digraph<String>(5);
        System.out.println(myGraph.addVertex("p1"));
        System.out.println(myGraph.addVertex("p2"));
        System.out.println(myGraph.addVertex("p3"));
        System.out.println(myGraph.addVertex("p4"));
        System.out.println(myGraph.addVertex("p5"));
        System.out.println(myGraph.addVertex("p3"));
        myGraph.addEdge("p1","p2");
        myGraph.addEdge("p1","p3");
        myGraph.addEdge("p3","p5");
        myGraph.addEdge("p4","p1");
        myGraph.addEdge("p4","p3");
        myGraph.addEdge("p5","p2");

        // get vertices adjacent to v1
        int v1=myGraph.vertexNumberOf("p1");
        int v2=myGraph.firstNeighbor(v1);
        while (v2!=-1) {
            System.out.println(myGraph.vertexInfoOf(v2));
            v2=myGraph.nextNeighbor(v1);
        }
        // check if there is an edge from p5 to p2
        v1=myGraph.vertexNumberOf("p5");
        v2=myGraph.vertexNumberOf("p2");
        System.out.println(myGraph.containsEdge(v1,v2));

        // check if there is an edge from p4 to p2
        v1=myGraph.vertexNumberOf("p4");
        v2=myGraph.vertexNumberOf("p2");
        System.out.println(myGraph.containsEdge(v1,v2));
    }

}