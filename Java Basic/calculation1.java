class calculation1 {
    public static void main(String[] args) {
        sumObject1 obj = new sumObject1();
        System.out.println(obj.nani);
        System.out.println(obj.sai);

        sumObject1 a = new sumObject1();
        int sum = a.add(obj.nani, obj.sai);
        System.out.println("Sum: " + sum);

        String res = obj.concatenatee("Nani", "Sai", "Bhanu");
        System.out.println("Concatination: " + res);

    }
}

class sumObject1 {
    int nani = 144;
    int sai = 169;

    public  int add (int a, int b) {
        return a + b;
    }
    public  String concatenatee (String a, String b, String c) 
    {
        return a + b + c;
    }
}