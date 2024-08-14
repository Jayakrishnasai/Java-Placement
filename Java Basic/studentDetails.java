import java.util.*;
public class studentDetails {
    String name;
    int age;
    int marks;

    public void setName (String name) {
        this.name = name;
    } public void setMarks (int marks) {
        this.marks = marks;
    } public void setAge (int age) {
        this.age = age;
    } public void displayInfo () {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + marks);
    } public boolean hasPassed() {
        return marks > 40;
    } public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentDetails obj = new studentDetails();
        System.out.println("Enter the Student Name : ");
        String name = sc.nextLine();
        obj.setName(name);
        System.out.println("Enter the Student Age : ");
        int age = sc.nextInt();
        obj.setAge(age);

        System.out.println("Enter the Marks of each Subject: ");
        System.out.println("Enter the Student Marks: ");
        int marks = sc.nextInt();
        obj.setMarks(marks);
        if (obj.hasPassed()) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
        sc.close();
    }
}
