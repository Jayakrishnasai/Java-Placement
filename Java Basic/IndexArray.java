import java.util.*;
public class IndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find:");
        int element = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at Index: " + i);
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        System.out.println("Enter the index to retrieve the element:");
        int index = sc.nextInt();
        if (index >= 0 && index < 10) {
            System.out.println("Element at Index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index.");
        }

        sc.close();
    } 
}
