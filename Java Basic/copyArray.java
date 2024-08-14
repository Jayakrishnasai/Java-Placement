import java.util.*;
public class copyArray {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6};
        int y[] = x.clone();
        int[] z = Arrays.copyOf(x,x.length);
        System.out.println("The original Array is  : " + Arrays.toString(x));
        System.out.println("The copied Array id (Using Clone() method): " + Arrays.toString(y));
        System.out.println("The Copied Array is (Using Arrays.copyOf() method): " + Arrays.toString(z));
    }
}
