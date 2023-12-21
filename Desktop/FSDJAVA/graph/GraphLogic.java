package graph;
import java.util.ArrayList;
public class GraphLogic {
    ArrayList<edges>edges = new ArrayList<edges>();
    int vertics;
    public GraphLogic(int vertics){
        this.vertics=vertics;
    }
    public GraphLogic(int source, int destination) {
    }
    public void addEdge(int source,int dest){
        edges edge = new edges(source,dest);
        edges.add(edge);
        }
        public void print (){

        for (int i=0; i < edges.size(); i++){
            edges edge = edges.get(i);
            System.out.println(edge.getsource()+","+edge.getdestination());





        }


    

    }


    
}
