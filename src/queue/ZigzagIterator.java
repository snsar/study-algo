package queue;

import java.util.*;

public class ZigzagIterator {
    private Queue<Iterator<Integer>> q;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        q = new LinkedList<>();

        if (!v1.isEmpty()) q.add(v1.iterator());
        if (!v2.isEmpty()) q.add(v2.iterator());
    }

    public int next() {
        Iterator<Integer> iterator = q.remove();
        int val = iterator.next();

        if (iterator.hasNext()) q.add(iterator);
        return val;
    }

    public boolean hasNext() {
        // Check if there are more iterators in the queue to process.
        return !q.isEmpty();
    }

    public static void main(String[] args) {
        ZigzagIterator i = new ZigzagIterator(Arrays.asList(1, 2), Arrays.asList(3, 4, 5, 6));
        System.out.println(i.next());  // returns 1
        System.out.println(i.next());  // returns 3
        System.out.println(i.next());  // returns 2
        System.out.println(i.next());  // returns 4
        System.out.println(i.next());  // returns 5
        System.out.println(i.next());  // returns 6
        System.out.println(i.hasNext());  // returns false
    }
}
