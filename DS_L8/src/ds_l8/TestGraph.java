/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l8;

/**
 *
 * @author syaam
 */
public class TestGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String, Integer> graph1 = new Graph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
        for(String i: cities){
            graph1.addVertex(i);
        }
        
        System.out.println("Number of Vertices: "+graph1.getSize());
        
        System.out.println("Cities and their respective vertices:");
        for(int i=0;i<=graph1.getSize()-1;i++){
            System.out.println(i+": "+graph1.getVertex(i)+"\t");
        }
        System.out.println("");
        
        System.out.println("Is Melaka in the graph? "+graph1.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the graph? "+graph1.hasVertex("Ipoh"));
        System.out.println("");
        
        System.out.println("Kuching at index: "+graph1.getIndex("Kuching"));
        System.out.println("Ipoh at index: "+graph1.getIndex("Ipoh"));
        System.out.println("");
        
        System.out.println("add edge Kuching-Melaka -- "+graph1.addUndirectedEdge("Kuching", "Melaka"));
        System.out.println("add edge Langkawi-Penang -- "+graph1.addUndirectedEdge("Langkawi", "Penang"));
        System.out.println("add edge Melaka-Penang -- "+graph1.addUndirectedEdge("Melaka", "Penang"));
        System.out.println("add edge Alor Setar-Kuching -- "+graph1.addUndirectedEdge("Alor Setar", "Kuching"));
        System.out.println("add edge Tawau-Alor Setar -- "+graph1.addUndirectedEdge("Tawau", "Alor Setar"));
        System.out.println("add edge Kuching-Tawau -- "+graph1.addUndirectedEdge("Kuching", "Tawau"));
        System.out.println("add edge Langkawi-Ipoh -- "+graph1.addUndirectedEdge("Langkawi", "Ipoh"));
        System.out.println("");
        
        System.out.println("Print Edges:");
        graph1.printEdges();
        
    }
    
}
