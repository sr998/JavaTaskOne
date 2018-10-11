package javaTaskOne;

public class PrintArray {
    public static void print(short[][] in, String Prefix) {
        System.out.println(Prefix+" Array: ");
        for (short i = 0; i < in.length; i++) {
            for (short j = 0; j < in[i].length; j++) {
                System.out.printf("%4d", in[i][j]);
            }
            System.out.println();
        }
    }
}
