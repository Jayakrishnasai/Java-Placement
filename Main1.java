
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of balloons: ");
        int n = sc.nextInt();
        sc.close();
        if(n>0)
        {
            for(int i=1;i<=n;i++){
                System.out.println("🎈");
            }
            System.out.println("The number of balloons that will pop up is "+n);
        }
            else
            {
                System.out.println("Please enter a positive number");
                }
    }
}
