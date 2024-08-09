public class constructorDemo {
  String name;
  int age;
    public constructorDemo() {
        this.name = "Kerito";
        this.age = 20;
        System.out.println(" Default Constructor Called Successful ");
        }
        public constructorDemo (String name, int age) {
           this.name = name;
           this.age = age;
           System.out.println("Parameterized Constructor Called Successful ");
          }
           public constructorDemo (constructorDemo demo) {
             this.name = demo.name;
             this.age = demo.age;
             System.out.println("Copy Constructor Called Successful ");
           } public void displayInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
           }
           public static void main(String[] args) {
            constructorDemo person = new constructorDemo();
            person.displayInfo();
            System.out.println();

            constructorDemo person1 = new constructorDemo("Alice", 23);
            person1.displayInfo();
            System.out.println();

            constructorDemo person2 = new constructorDemo(person1);
            person2.displayInfo();
            System.out.println();
           }
}
