import java.util.ArrayList;

public class Graph {

    private int totalEdges;
    private int totalVerts;
    private ArrayList<Vertex> vertexes;

    public Graph()
    {
        this.totalEdges=0;
        this.totalVerts=0;
        this.vertexes=new ArrayList<Vertex>(); 
    }


    public Graph(int v) {
        this.totalEdges=0;
        this.totalVerts=1;
        Vertex newVertex= new Vertex(v);
        this.vertexes.add(newVertex);
    }

    public boolean editVertex(int name,boolean visit,Edge e)
    {
        for (Vertex i : this.vertexes) {
           if(i.getName()==name)
           {
            i.connectToVertex(e.getName(), e.getWeight(),e.getName());
            return true;
           }
        }
        return false;
    }

    // source , destination, weight
    public void addVertex(int source,int dest, double w) {
        if(isVertexInGraph(source))
        {
            new Edge(source, dest, this.totalEdges, w);
            getVertexByName(source).connectToVertex(dest, w, this.totalEdges);
            this.totalEdges+=1;
        }
    }
    
    

    public boolean isVertexInGraph(int v)
    {

        for (Vertex i : this.vertexes) {
           if(i.getName()==v)
           {
            return true;
           }
        }
        return false;
    }
    public Vertex getVertexByName(int name)
    {
        for(int i=0;i<this.vertexes.size();i++)
        { 
            if(this.vertexes.get(i).getName()==name)
            {
                return this.vertexes.get(i);
            }
        }  
        return null;  
    }

}
