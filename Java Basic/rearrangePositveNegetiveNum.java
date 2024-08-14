//input: {1,-1,3,-2,5}
// outpur: {one positve, one negitive,one positive.....}
public class rearrangePositveNegetiveNum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, -2, 5};
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[j] = arr[i];
                j++;
                //System.out.println(j);
            }else{
                neg[k] = arr[i];
                k++;
               //System.out.println(k);
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(pos[i]+" ");
        }
        for(int i = 0; i < k; i++) {
            System.out.print(neg[i]+" ");
        }
    }
}
