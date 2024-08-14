public class Queue1 {
    private int[] queue;
    private int front, rear, capacity;

    public Queue1(int size) {
        capacity = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = item;
        }
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Dequeue: " + q.dequeue());  
        System.out.println("Dequeue: " + q.dequeue());  
        System.out.println("Queue: ");
        for (int i = q.front; i <= q.rear; i++) {
            System.out.println(q.queue[i] + " ");
        }
        System.out.println();
    }
}
