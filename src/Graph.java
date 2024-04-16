import java.util.ArrayList;

public class Graph {

    int Vertices;
    ArrayList<ArrayList<Node>> AdjecencyList;

    public Graph(int v) {
        this.Vertices = v;
        this.AdjecencyList = new ArrayList<>(Vertices);
        for (int i = 0; i < Vertices; i++) {
            AdjecencyList.add(new ArrayList<>());

        }
    }

    // source , destination, weight
    public void addEdge(int s, int d, double w) {
        AdjecencyList.get(s).add(new Node(d, w));
        AdjecencyList.get(d).add(new Node(s, w));

    }


}
