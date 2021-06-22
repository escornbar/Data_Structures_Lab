package ds_l8;

public class Vertex<T extends Comparable<T>, N extends Comparable <N>> {
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T,N> nextVertex;
    Edge<T,N> firstEdge;
    int index;
    
    public Vertex() {
       vertexInfo=null;
       indeg=0;
       outdeg=0;
       nextVertex = null;
       firstEdge = null;
    }

    public Vertex(T vInfo, Vertex<T,N> next) {
       vertexInfo = vInfo;
       indeg=0;
       outdeg=0;
       nextVertex = next;
       firstEdge = null;
       index++;
    }	

    public T getVertexInfo() {
        return vertexInfo;
    }

    public int getIndeg() {
        return indeg;
    }

    public int getOutdeg() {
        return outdeg;
    }

    public Vertex<T, N> getNextVertex() {
        return nextVertex;
    }

    public Edge<T, N> getFirstEdge() {
        return firstEdge;
    }
    
    public int getIndex() {
        return index;
    }
    
    public void setIndex(int index) {
        this.index=index;
    }
}

