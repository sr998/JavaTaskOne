package javaTaskOne;

public class PrintArray {
    public static void print(int[][] in, String Prefix) {
        System.out.println(Prefix+" Array: ");
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                System.out.printf("%4d", in[i][j]);
            }
            System.out.println();
        }
    }
}
