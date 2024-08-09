public class sumObject {
    int nani = 144;
    int sai = 169;

    public int add(int a, int b) {
        return a + b;
    }

    public String concatenatee(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        sumObject obj = new sumObject();
        System.out.println(obj.nani);
        System.out.println(obj.sai);

        sumObject a = new sumObject();
        int sum = a.add(obj.nani, obj.sai);
        System.out.println("Sum: " + sum);

        String res = obj.concatenatee("Nani", "Sai", "Bhanu");
        System.out.println("Concatination: " + res);
    }

}