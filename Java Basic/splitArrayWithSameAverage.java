import java.util.*;
public class splitArrayWithSameAverage {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("The Sum of the elements in Array is : " + sum);
        int div = sum / 2;
        System.out.println("The half - half of the number " + sum + " is : " + div);
        System.out.println("Split Array into Two Halfs: ");
        int mid = a.length / 2;
        int[] a1 = Arrays.copyOfRange(a, 0, mid);
        int[] a2 = Arrays.copyOfRange(a, mid, a.length);
        System.out.println("The 1st Half of the Array that add upto " + div + " is : " + Arrays.toString(a1));
        System.out.println("The 2ndst Half of the Array that add upto " + div + " is : " + Arrays.toString(a2));
    
    }
}
