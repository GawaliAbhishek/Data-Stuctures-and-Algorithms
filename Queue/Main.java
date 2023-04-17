public class Main {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
       System.out.println( q.toString());
        q.dequeue();
        q.enqueue(3);
        q.enqueue(5);
       System.out.println( q.toString());

    }
}