package javaTaskOne.Model.ArrayOperations;

import javax.swing.*;

public class MatrixConvert {

    public static short[] strArrayToIntArray(String[] a){
        short[] b = new short[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (short) Integer.parseInt(a[i]);
        }

        return b;
    }

    public static short[][] arrayToMatrix (short[] intChars, int intN, int intM){
        short[][] arr = new short[intN][intM];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = intChars[count++]; }
        }
        return arr;
    }


    }






