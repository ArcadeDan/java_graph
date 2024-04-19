/*
 * What: This class represents and edge in a graph, it has 4 values, 
 * 3 integers, 1 double 
 * 2 for tracking what vertexes it connects to VertA,VertB
 * 1 for its own unique name in the graph
 * 1 double represents its given weight 
 * all default unitinilized values will be -1 and -1.0
 */
public class Edge{
    private int VertA;
    private int VertB;
    private int Name;
    private double Weight;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Edge()//default constructor, init all values to -1
    {
        this.VertA=-1;
        this.VertB=-1;
        this.Name=-1;
        this.Weight=-1.0;
    }
    public Edge(int vertA,int vertB,int name, double weight)//overloaded default constructor, takes arguments for new Edge 
    {
        this.VertA=vertA;
        this.VertB=vertB;
        this.Name=name;
        this.Weight=weight;
        
    }
    public Edge(Edge edge)//overloaded default constructor, takes an edge to make a copy of
    {
        this.VertA=edge.VertA;
        this.VertB=edge.VertB;
        this.Name=edge.Name;
        this.Weight=edge.Weight;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //Seters
    public void setVerts(int vertA,int vertB)//Takes 2 ints, first for vertA, second for vertB, if you only want to set one vert,
    {                                        //pass -1 as your int, it will not change the existing value.
        if(vertA!=-1){this.VertA=vertA;}
        if(vertB!=-1){this.VertB=vertB;}
    }                                        
    public void setWeight(double weight)//takes 1 double, and sets it as the current weight
    {
        this.Weight=weight;
    }
    public void setName(int name)//takes 1 int, and sets it as the name
    {
        this.Name=name;
    }


    //Geters
    public int getVertA()//gets the value stored in VertA
    {
        return this.VertA;
    }   
    public int getVertB()//gets the value stored in VertB
    {
        return this.VertB;
    }
    public double getWeight()//gets the value stored in Weight
    {
        return this.Weight;
    }
    public int getName()//gets the value stored in Name
    {
        return this.Name;
    }
    //misc util functions
    public void printEdge()//prints the values of current edge with given formatt 
    {
        System.out.print("VertA:"+this.VertA+"----(Edge:"+this.Name+"|Weight:"+this.Weight+")----VertB:"+this.VertB);
    }


}