public class Midway {
    public static void main(String[] args) {
        int[] [] arr = new int [3][3];
        int[] [] arr1 = {{1, 2, 3},{4,5,6},{7,8,9}};
        int[] [] arr2 = {{11, 12, 13},{14,15,16},{17,18,19}};
        //Program to print the Number which is -1 if we substract th emiddle num with 1st num ,and +1 when we add the ,middle num with last num 
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    sum = arr[i][j] - arr1[i][0];
                    sum = arr1[i][j] + arr2[i][j];
                    System.out.println(sum);
                    }
              }
          }
        }
}