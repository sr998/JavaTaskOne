package javaTaskOne;

import java.io.IOException;
import java.util.Scanner;

public class SortAlgorithm {

    public static int[][] clearAlgorithm(int[][] arr){
        for (short i = 0; i < arr.length - 1; i++) {
            for (short j = (short) (i + 1); j < arr.length; j++) {
                for (short f = 0; f < arr.length; f++) {
                    if (arr[i][f] > arr[j][f]) {
                        short temp = (short) arr[i][f];
                        arr[i][f] = arr[j][f];
                        arr[j][f] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static short[][] algorithm () throws IOException {

        short choices = (short) SortAlgorithm.choices();

        short[][] massiveIn = new short[0][];
        if (choices == 1) {

            massiveIn = Import.inputRandomArray();
        }else if(choices==2){
            massiveIn = Import.inputArrayFromKeyboard();
        }
        short size = (short) massiveIn.length;


        for(short i = 0; i < size - 1; i++) {
            for(short j = (short) (i + 1); j < size; j++) {
                for(short m = 0; m <size; m++) {
                    if(massiveIn[i][m] > massiveIn[j][m]) {
                        short temp = massiveIn[i][m];
                        massiveIn[i][m] = massiveIn[j][m];
                        massiveIn[j][m] = temp;
                    }
                }
            }
        }
return massiveIn;
    }

    public static short choices (){
        Scanner in = new Scanner(System.in);
        System.out.println("Input method of matrix filling (random/manual)");
        String choice=in.nextLine();

        short choices = 0;
        switch (choice) {
            case("random"):{
                choices = 1;
                break;}
            case("manual"):{
                choices = 2;

                break;}

        }
        return choices;
    }
}
