package ds_l8;

import java.util.ArrayList;
import java.util.Stack;

public class WeightedGraph<T extends Comparable<T>, N extends Comparable<N>> {

    Vertex<T, N> head;
    int size;
    static int index=0;//For isVisited node
    static boolean foundCrush = false;

    public WeightedGraph() {
        head = null;
        size = 0;
    }

    public void clear() {
        head = null;
    }

    public int getSize() {
        return this.size;
    }

    public int getIndeg(T v) {
        if (hasVertex(v) == true) {
            Vertex<T, N> temp = head;
            while (temp != null) {
                if (temp.vertexInfo.compareTo(v) == 0) {
                    return temp.indeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }

    public int getOutdeg(T v) {
        if (hasVertex(v) == true) {
            Vertex<T, N> temp = head;
            while (temp != null) {
                if (temp.vertexInfo.compareTo(v) == 0) {
                    return temp.outdeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }

    public boolean hasVertex(T v) {
        if (head == null) {
            return false;
        }
        Vertex<T, N> temp = head;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(v) == 0) {
                return true;
            }
            temp = temp.nextVertex;
        }
        return false;
    }

    public boolean addVertex(T v) {
        if (hasVertex(v) == false) {
            Vertex<T, N> temp = head;
            Vertex<T, N> newVertex = new Vertex<>(v, null);
            newVertex.setIndex(index);
            index++;
            if (head == null) {
                head = newVertex;
            } else {
                Vertex<T, N> previous = head;;
                while (temp != null) {
                    previous = temp;
                    temp = temp.nextVertex;
                }
                previous.nextVertex = newVertex;
            }
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int getIndex(T v) {
        Vertex<T, N> temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(v) == 0) {
                return pos;
            }
            temp = temp.nextVertex;
            pos += 1;
        }
        return -1;
    }

    public ArrayList<T> getAllVertexObjects() {
        ArrayList<T> list = new ArrayList<>();
        Vertex<T, N> temp = head;
        while (temp != null) {
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }

    public ArrayList<Vertex<T, N>> getAllVertices() {
        ArrayList<Vertex<T, N>> list = new ArrayList<>();
        Vertex<T, N> temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.nextVertex;
        }
        return list;
    }

    public T getVertex(int pos) {
        if (pos > size - 1 || pos < 0) {
            return null;
        }
        Vertex<T, N> temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    
    public Vertex<T,N> getOriVertex(int pos) {
        if (pos > size - 1 || pos < 0) {
            return null;
        }
        Vertex<T, N> temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.nextVertex;
        }
        return temp;
    }

    public boolean addEdge(T source, T destination, N w) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now
                Vertex<T, N> destinationVertex = head;
                while (destinationVertex != null) {
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        // Reached destination vertex, add edge here
                        Edge<T, N> currentEdge = sourceVertex.firstEdge;
                        Edge<T, N> newEdge = new Edge<>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }

    public boolean hasEdge(T source, T destination) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now 
                Edge<T, N> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) // destination vertex found 
                    {
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }

    public N getEdgeWeight(T source, T destination) {
        N notFound = null;
        if (head == null) {
            return notFound;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return notFound;
        }
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now 
                Edge<T, N> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) // destination vertex found 
                    {
                        return currentEdge.weight;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return notFound;
    }

    public ArrayList<T> getNeighbours(T v) {
        if (!hasVertex(v)) {
            return null;
        }
        ArrayList<T> list = new ArrayList<T>();
        Vertex<T, N> temp = head;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(v) == 0) {
                // Reached vertex, look for destination now
                Edge<T, N> currentEdge = temp.firstEdge;
                while (currentEdge != null) {
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return list;
    }

    public void printEdges() {
        Vertex<T, N> temp = head;
        while (temp != null) {
            System.out.print("# " + temp.vertexInfo + " : ");
            Edge<T, N> currentEdge = temp.firstEdge;
            while (currentEdge != null) {
                System.out.print("[" + temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "] ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            temp = temp.nextVertex;
        }
    }

    public boolean addUndirectedEdge(T source, T destination, int w) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }
        Vertex<T, N> sourcevertex = head;
        while (sourcevertex != null) {
            if (sourcevertex.vertexInfo == source) {
                Vertex<T, N> destinationvertex = head;
                while (destinationvertex != null) {
                    if (destinationvertex.vertexInfo == destination) {
                        Edge<T, N> currentEdge = sourcevertex.firstEdge;
                        Edge<T, N> newedge = new Edge(destinationvertex, w, currentEdge);
                        sourcevertex.firstEdge = newedge;
                        currentEdge.nextEdge = newedge;

                    }
                }
            }
            sourcevertex = sourcevertex.nextVertex;
        }
        return true;
    }

    public boolean removeEdge(T source, T destination) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)) {
            return false;
        }
        if (!hasEdge(source, destination)) {
            return false;
        }

        Vertex<T, N> temp = head;
        while (temp != null) {
            if (temp.vertexInfo == source) {

                Edge<T, N> remove = temp.firstEdge;
                while (remove != null) {
                    if (remove.nextEdge.toVertex.vertexInfo == destination) {
                        remove.nextEdge = remove.nextEdge.nextEdge;
                    }
                }
            }

            temp = temp.nextVertex;
        }
        return true;
    }
    
    //Event 5 DFS
    public void printAllPaths(int sindex,Vertex<T,N> s,Vertex<T,N> d) {
        ArrayList<String> path = new ArrayList<>();
        boolean[] isVisited = new boolean[size];
        
        //Add source to path stack
        path.add(getVertex(sindex).toString());
        
        //Call recursive ability
        isConnected(s,d,isVisited,path);
        
        //Check whether there exists a path between crush and rumour
        if(!foundCrush) System.out.println("Luckily, there is no way the rumour can reach your crush");
        foundCrush = false; //Reset for next event
    }
    
    public void isConnected(Vertex<T,N> src, Vertex<T,N> dest, boolean[] isVisited, ArrayList<String> path) {
        //If destination vertex is found
        if (src.vertexInfo.compareTo(dest.vertexInfo)==0) {
            System.out.println(path);
            foundCrush = true;
            return;
        }
        
        //Mark the current node as visited
        isVisited[src.getIndex()] = true;
        
        //Loop through all adjacent vertices(aka edges)
        Edge<T,N> currEdge = src.firstEdge;
        while(currEdge!=null) {
            if (!isVisited[currEdge.toVertex.getIndex()]) {
                
                //Include current node in the path
                path.add(currEdge.toVertex.vertexInfo.toString());
                
                isConnected(currEdge.toVertex, dest, isVisited, path);
                
                //Remove current node in path
                path.remove(currEdge.toVertex.vertexInfo.toString());
            }
            currEdge = currEdge.nextEdge;   //To iterate to the next edge
        }
        
        //Mark the current node
        isVisited[dest.getIndex()] = false;
    }
}


