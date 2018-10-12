package javaTaskOne;

public class guiMethods {

    public static int[] strArrayToIntArray(String[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }

    public static int[][] arrayToMatrix (int[] intChars,int intN,int intM){
        int[][] arr = new int[intN][intM];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = intChars[count++]; }
        }
        return arr;
    }


}


