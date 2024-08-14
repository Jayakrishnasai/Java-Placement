import java.util.*;
public class Methods {
   public static int add(int a, int b) {
      return (a + b);
   }
  
   public static int substract(int a, int b) {
       return (a - b);
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();
    int sum = add(a, b);
    int diff = substract(a, b);
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + diff);
    sc.close();
   }
}