import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take inputs from user and add
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();
        int Sum =a + b;
        System.out.println("Addition: "+ Sum);
        sc.close();
    }
}
