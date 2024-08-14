//import java.util.*;
public class Student {
    public static void main(String[] args) {
        // Create a new ArrayList
        String studentAge = "20, 21, 19, 22, 20";
        String[] Ages = studentAge.split(", ");
        for(int i = 0; i < Ages.length;i++){
            System.out.println("AGES OF STUDENTS IS: " + Ages[i]);
        }//Convert String Ages to integer and Calculate Sum
        int sum = 0;
        for(int i = 0; i < Ages.length;i++){
            sum += Integer.parseInt(Ages[i]);
            }
            System.out.println("Sum of Ages: "+sum);
    }
}
