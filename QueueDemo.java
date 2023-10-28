public class QueueDemo {
    public static void main(String[] args) {
        Queue q1=new Queue();

        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(7);


        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }
}
