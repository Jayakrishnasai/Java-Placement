import java.util.LinkedList; // Package for Linked List
public class LinkedListExa {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();  // In - Built Function For Linked List
        list.add(10);
        list.add(20);
        list.add(30);     // Adding Numbers In Linked List
        list.add(40);
        list.add(50);
        list.addFirst(5);
        list.addLast(60);
        System.out.println("Initial Linked LIst: " + list);  // Pri nting Elements In Linked list

        System.out.println("Head is: " + list.getFirst());  // Printing The first Element
        System.out.println("Tail is: " + list.getLast());   // Printing The last Element

        list.removeFirst(); // Remove's First  Elements 
        list.removeLast(); // Remove's Last  Elements  
        list.remove(1); // Remove's The Element at index 1
        System.out.println("Linked List After Deletion: " + list);
         boolean contains = list.contains(10);  // Check wheather the list Contains Element 10
         System.out.println("Linked List Contains 10: " + contains);

         System.out.println(" Iterating Over Linked list : ");
         for (int number : list) {
            System.out.println(number + "  ");
         }
         System.out.println();
         list.clear(); // Clearing the Linked List
         System.out.println("Linkedlist after clearing: " + list);
    }
}