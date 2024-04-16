public class MinHeap {
    private int[] heap;
    private int index;
    private int size;

    public MinHeap(int s) {
        this.size = s;
        this.index = 0;
        this.heap = new int[size];
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
        int tmp;
        tmp = this.heap[x];
        this.heap[x] = this.heap[y];
        this.heap[y] = tmp;
    }

    public void insert(int element) {
        if (this.index >= size) {
            return;
        }
        this.heap[this.index] = element;
        int current = index;

        while (this.heap[current] < this.heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        index++;
    }

    public int remove() {
        int popped = this.heap[0];
        this.heap[0] = this.heap[--this.index];
        minHeapify(0);
        return popped;
    }

    private void minHeapify(int i) {
        if (!isLeaf(i)) {
            if (this.heap[i] > this.heap[leftChild(i)] ||
                this.heap[i] > this.heap[rightChild(i)]) {
                if (this.heap[leftChild(i)] < this.heap[rightChild(i)]) {
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


}
