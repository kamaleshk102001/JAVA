public class Queue {
    /*static final*/ int MAX_VALUE=30;
    int[]arr;
    int front,rear;

    Queue(){
        arr=new int[MAX_VALUE];
        front=-1;
        rear=-1;
    }

    public void enqueue(int val){
        if(rear==MAX_VALUE-1)
            //throw new IndexOutOfBoundsException("Queue is full");
            System.out.println("Queue is full");

        if(front==-1)
            front++;

        arr[++rear]=val;
    }

    int dequeue(){
        if(front==-1||front>rear)
            throw new IndexOutOfBoundsException("Queue is empty");
            //System.out.println("Queue is empty");

        return arr[front++];
    }
}
