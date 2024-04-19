/*WHAT: This class will represent a vertex in a graph, it will have 2 values
an int that represents the name of the vertex
and an arrayList of edges that come from the vertex
 * 
 */
import java.util.ArrayList;



public class Vertex {
    private boolean isVisited;
    private int Name;
    private ArrayList<Edge> connectedEdges;


    public Vertex() {//creates and empty vertex with placeholder name -1 and an empty arraylist
        this.isVisited=false;
        this.Name=-1;
        this.connectedEdges=new ArrayList<Edge>();
    }
    public Vertex(int name) {//creates a Vertex with a given name, and an empty arraylist
        this.isVisited=false;
        this.Name=name;
        this.connectedEdges=new ArrayList<>();
    }
    //setters
    public void setIsVisited(boolean choice)
    {
        this.isVisited=choice;
    }
    public void setName(int name) {//sets the name of the given Vertex
        this.Name = name;
    }
    public void connectToVertex(int destVertex,double weight,int edgeName)//connects an edge to this vertex
    {
        Edge newEdge=new Edge();
        newEdge.setName(edgeName);
        newEdge.setWeight(weight);
        newEdge.setVerts(this.Name, destVertex);
        this.connectedEdges.add(newEdge);
    }
    public boolean isConnectedTo(int destVertex)
    {
        for (Edge i : connectedEdges) {
            if(i.getVertB()==destVertex)
            {
                return true;
            }
        }
        return false;
    }
    //getters
    public Edge getEdgeConnectedTo(int destVertex)
    {
        if(this.isConnectedTo(destVertex))
        {
            for (Edge i : connectedEdges) {
                if(i.getVertB()==destVertex)
                {return i;}
            }
            
        }
        return new Edge();//return an empty edge
    }
    public boolean getIsVisited()
    {
        return this.isVisited;
    }
    public int getName()
    {
        return this.Name;
    }




}
