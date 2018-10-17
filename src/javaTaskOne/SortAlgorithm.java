package javaTaskOne;

import java.io.IOException;
import java.util.Scanner;

public class SortAlgorithm {

    public static short[][] clearAlgorithm(short[][] arr) {
        for (short i = 0; i < arr.length - 1; i++) {
            for (short j = (short) (i + 1); j < arr.length; j++) {
                for (short f = 0; f < arr.length; f++) {
                    if (arr[i][f] < arr[j][f]) {
                        short temp = (short) arr[i][f];
                        arr[i][f] = arr[j][f];
                        arr[j][f] = temp;
                    }
                }
            }
        }
        return arr;
    }


}