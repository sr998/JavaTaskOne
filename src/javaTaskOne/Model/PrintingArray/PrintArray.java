package javaTaskOne.Model.PrintingArray;

import javax.swing.*;

public class PrintArray {
    public static void printArray(short[][] arr, short intN, JTextArea out) {

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
