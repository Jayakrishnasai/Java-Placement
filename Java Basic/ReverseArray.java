import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        // Take inputs from the user in the format of an array and reverse those numbers
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 Numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Reversed Array: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
