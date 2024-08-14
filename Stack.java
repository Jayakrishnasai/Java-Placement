import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();
    public int top;
    public char[][] stack;
    
    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return list.removeFirst();
        }
        throw new RuntimeException("Stack is empty");
    }

    public T peek() {
        if (!isEmpty()) {
            return list.getFirst();
        }
        throw new RuntimeException("Stack is empty");
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop()); 
        System.out.println("Peek: " + stack.peek()); 
    }
}
