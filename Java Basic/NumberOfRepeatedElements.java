import java.util.*;
public class NumberOfRepeatedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element, You need find the Count of : ");
        int element = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                count++;
            }
        }System.out.println("No.of Times Element "+ element + " Occcurs is " +" " +count);
        sc.close();
    }
}
