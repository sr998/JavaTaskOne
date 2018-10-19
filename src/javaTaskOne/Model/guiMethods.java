package javaTaskOne.Model;

import javax.swing.*;

public class guiMethods {

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

    public static void printArray(short[][] arr, short intN, JTextArea out){

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == intN - 1)
                    sb.append(String.valueOf(arr[i][j]) + " ").append("\n");
                else sb.append(String.valueOf(arr[i][j]) + " ");
            }
            out.setText(sb.toString());

        }
    }



}


