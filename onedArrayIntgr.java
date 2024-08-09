import java.util.Scanner;
public class onedArrayIntgr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = arr.length;
        int sum=0;
        System.out.println("Enter 10 integers: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        sc.close();
    for(int i=0;i<n;i++){

         sum = sum +  arr[i];
        
    }
    System.out.println("Sum of array elements is: "+sum); //Sum Of the Array Elements
    int max = arr[0]; // Find Max
    int min = arr[0]; // Find Min
    int i;
    for(i=1;i<n;i++)
    {
        if(arr[i]>max){
            max = arr[i];
        }if(arr[i]<min){
            min = arr[i];
        }
        
    }
    System.out.println("Minimum in Array is: "+min);
    System.out.println("Maximum in Array is: "+max);

    //Sorting in Array
    for(i=0;i<n-1;i++){                     //Find Ascending order
        for(int j=i+1;j<n;j++){
            if(arr[i]>=arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }System.out.println("Ascending Order: "); // Ascending Order
    for(i=0; i<n;i++){
        System.out.print(arr[i] +" ");
    }for(i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){                          // Find Desending Order
            if(arr[i]<=arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
    }
    }System.out.println("\nDecending Order: "); //Decending Order
    for(i=0; i<n;i++){
        System.out.print(arr[i] + " ");
}for (i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
        System.out.println("Even Numbers: " + arr[i] + " ");
    } else {
        System.out.println("Odd Numbers: " + arr[i] + " ");
    }
}
}
}
