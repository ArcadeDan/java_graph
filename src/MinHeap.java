//TODO
/*Add the following functions
 * 
 * 
 * inHeap(int index);//
 * key=value to sort with should be double to reflect weight of edges
 * id=value that references object best to use int 
 * 
 * 
 * 
 * 
 * 
 */




public class MinHeap {//array implimentation
    private Edge[] heap;
    private int index;//used as a 
    private int size;//ammount of nodes to 

    public MinHeap(int s) {
        this.size = s;
        this.index = 0;
        this.heap = new Edge[size];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return (i * 2) + 1;
    }

    private int rightChild(int i) {
        return (i * 2) + 2;
    }

    private boolean isLeaf(int i) {
        if (rightChild(i) >= size || leftChild(i) >= size) {
            return true;
        }
        return false;
    }

    private void swap (int x, int y) {
        Edge tmp;
        tmp = this.heap[x];
        this.heap[x] = this.heap[y];
        this.heap[y] = tmp;
    }

    public void insert(Edge element) {
        if (this.index >= size) {
            return;
        }
        this.heap[this.index] = element;
        int current = index;

        while (this.heap[current].getWeight() < this.heap[parent(current)].getWeight()) {
            swap(current, parent(current));
            current = parent(current);
        }
        index++;
    }

    public Edge remove() {
        Edge popped = this.heap[0];
        this.heap[0] = this.heap[--this.index];
        minHeapify(0);
        return popped;
    }

    private void minHeapify(int i) {
        if (!isLeaf(i)) {
            if (this.heap[i].getWeight() > this.heap[leftChild(i)].getWeight() ||
                this.heap[i].getWeight() > this.heap[rightChild(i)].getWeight()) {
                if (this.heap[leftChild(i)].getWeight() < this.heap[rightChild(i)].getWeight()) {
                    swap(i, leftChild(i));
                    minHeapify(leftChild(i));
                } else {
                    swap(i , rightChild(i));
                    minHeapify(rightChild(i));
                }
            }
        }
    }

    public void minHeap() {
        for (int i = (index - 1 / 2); i >= 1; i--) {
            minHeapify(i);
        }
    }

    public void printHeapArray()
    {
        for (Edge i : heap) {
        System.out.println(i);    
        }
        

    }
    public void printHeap() {
        for (int i = 0; i < (index / 2); i++) {
            System.out.print("Parent : " + this.heap[i].getName());
            if (leftChild(i) < index)
                System.out.print(" Left : " + this.heap[leftChild(i)].getName());
            if (rightChild(i) < index)
                System.out.print(" Right :" + this.heap[rightChild(i)].getName());
            System.out.println();
        }
    }


}



