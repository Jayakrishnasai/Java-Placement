//import java.util.*;
public class Average {
    public static void main(String[] args) {
        String studentAge = "20, 21, 19, 22, 20";
        String[] ageList = studentAge.split(", ");
        for(int i = 0; i < ageList.length;i++){
            System.out.println("AGES OF STUDENTS IS: " + ageList[i]);
        }
        int sum = 0;
        for(int i = 0; i < ageList.length;i++){
            sum += Integer.parseInt(ageList[i]);
            //int average = sum / Ages.length; 
            }
            int average = sum / ageList.length; 
            System.out.println("Average of student ages is: " + average);
            System.out.println("Sum of Ages: "+sum);
    }
}
