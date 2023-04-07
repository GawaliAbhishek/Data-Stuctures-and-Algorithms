
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority {
    /*
     * In Java we will get Priority Queue in Util Package
     * Priority Queue is queue in which we can store the elements on basis of
     * priority we give
     * 
     * by default minimum or smallest number has priority
     * because of this priority queue in java behaves as MINHEAP
     * so we can use Priority Queue as MIN Heap or MAX Heap
     * 
     * to make the priority queue a max Heap we have to pass a comparator to the
     * constructor of the Priority Queue Object
     * ex- PriorityQueue<Integer> queue=new
     * PriorityQueue(Collections.reverseOrder());
     * 
     * this Collections.reverseOrder() returns a Comparator which reverse the
     * natural orders
     * 
     */

    public static void main(String[] args) {
        insertNum(3);
        insertNum(4);
        System.out.println(findMedian());
        insertNum(9);
        insertNum(6);
        insertNum(8);
        insertNum(2);
        System.out.println(findMedian());
    }

    // Print the kth Largest Element in Array
    // My Approch
    public static int Question1(int arr[], int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : arr) {
            q.add(n);
        }

        for (int i = 1; i <= k; i++) {
            if (i == k)
                return q.peek();
            q.poll();
        }

        return 0;

    }

    // Actual Approch
    public static int Question12(int arr[], int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i <= k; i++)
            q.add(arr[i]);

        for (int j = k; j < arr.length; j++) {
            if (arr[j] > q.peek()) {
                q.poll();
                q.add(arr[j]);
            }
        }
        return q.peek();
    }

    /*
     * Question 2 is we have to connect n ropes. we are given with the array
     * of lengths . we have to connect ropes with minimum cost.. and the cost
     * to connect ropes is sum of the lengths of the rope
     */

    public static int Question2(int arr[]) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int N : arr)
            q.add(N);
        int ans = 0;
        while (q.size() != 1) {
            int a = q.poll();
            int b = q.poll();
            q.add(a + b);
            ans += (a + b);
        }

        return ans;
    }

    /*
     * Question 3 is we will be given a Stream of numbers input we have to find the
     * median of that Stream at that time
     * 
     */

    public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void insertNum(int num) {
        if (maxHeap == null || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }

    }

    public static double findMedian(){
        if(minHeap.size()==maxHeap.size())
        return (minHeap.peek()+maxHeap.peek())/2.0;
        else
        return maxHeap.peek();
    }

}
