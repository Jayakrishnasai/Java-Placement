public class SubsequentRepeatedNum{
    public static void main(String[] args) {
        int c1 = 0;
        int c0 = 0;
        int maxCount = 0;
        int array[] = {1,0,1,1,1,0,0,1,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                c1++;
            }
            else if (array[i] == 0) {
                if (c1 > maxCount) {
                    maxCount = c1;
                }
                if(array[i] == 1) {
                    maxCount = c0;
                }
                else{
                    c0++;
                }
            }else {
                c0++;
            }
        }
        System.out.println("Maximum Sequ Num of ones is: " + (maxCount-1));
        System.out.println("Maximum Nuber of Sequetial Zeros is: "+(c0-1));
}
}