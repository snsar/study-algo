package heap;

import java.util.ArrayList;

public class HeapOperation {

    static void heapUp(ArrayList<Integer> heap, int i) {
        int parent = (i - 1) / 2;

        if (i > 0 && heap.get(i) < heap.get(parent)) {
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);

            heapUp(heap, parent);
        }
    }

    static void insert(ArrayList<Integer> heap, int value) {
        heap.add(value);

        heapUp(heap, heap.size() - 1);
    }

    static void printHeap(ArrayList<Integer> heap) {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();

        heap.add(13);
        heap.add(21);
        heap.add(16);
        heap.add(24);
        heap.add(31);
        heap.add(19);
        heap.add(68);
        heap.add(65);
        heap.add(26);
        heap.add(32);


        insert(heap, 14);


        printHeap(heap);
    }
}
