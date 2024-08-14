import java.util.Stack;  // Package for Stack
public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();   // In - Built function For Creating a Stack
        stack.add(10);    // Stack follows LIFO (Last In First Out)
        stack.add(20);
        stack.add(30);    // Adding elements in Stack
        stack.add(40);
        stack.add(50);

        System.out.println("Initial Stack : " + stack);  // Stack with Elements
        int deletedElement = stack.pop();  // Deleting top Element
        System.out.println("Deleted Element : " + deletedElement);
        System.out.println("Stack after Deletoing : " + stack);  // Printing Stack after Deleting top Value

        int topElement = stack.peek();  // Retrive and Print Top Element
        System.out.println("Top Element : " + topElement);
        boolean isEmpty = stack.isEmpty();  // Check wheather the Stack is Empty or Not ?
        System.out.println("is Stack Empty ? : " + isEmpty);
        int pos = stack.search(20);    // Search for Element 20
        System.out.println("Position of 20 : " + pos);
        System.out.println("Iterating Over Stack: ");  // Printing all Elememts in Stack
        for (int element : stack) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
