

public class Main {
    public static void main(String[] args) {

        Edge[] source=new Edge[10];
        for (int i = 0; i < 10; i++) {
            source[i]=new Edge(i,i+1,i,Double.valueOf(i));
        }
        source[0].printEdge();
        MinHeap h=new MinHeap(source.length);
        for (Edge i : source) {
            h.insert(i);
            
        }
        System.out.println("Hello world!");

        h.printHeap();
        Edge myEdge=new Edge(1,2,1,10);
        myEdge.printEdge();

    }
}