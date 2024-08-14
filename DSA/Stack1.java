public class Stack1 {
    int[] stack;
    int top;
    int capacity;

    public Stack1(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("POP: " + stack.pop());
        System.out.println("PEEK: " + stack.peek());

        System.out.print("Stack: ");
        for (int i = stack.top; i >= 0; i--) {
            System.out.print(stack.stack[i] + " ");
        }
        System.out.println();
    }
}
