import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        //Take inputs from user and find the duplicate elemnets in Array
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter the elements of array");
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        //Find Duplicate Elements in array
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate elements are: " +arr[i]);
                }
            }
        }
 

    }
}
