package javaTaskOne;

import java.io.IOException;
import java.util.Scanner;

public class SortAlgorithm {


    public static int[][] algorithm () throws IOException {

        int choices = SortAlgorithm.choices();

        int[][] massiveIn = new int[0][];
        if (choices == 1) {

            massiveIn = Import.inputRandomArray();
        }else if(choices==2){
            massiveIn = Import.inputArrayFromKeyboard();
        }
        int size = massiveIn.length;
        int[] temp = new int[size];
        for (int i = 0; i < massiveIn[0].length; i++) {
            for (int j = 0; j < massiveIn[0].length; j++) {
                if (massiveIn[0][i] > massiveIn[0][j]) {
                    for (int k = 0; k < size; k++) {
                        temp[k] = massiveIn[k][j];
                    }
                    for (int k = 0; k < size; k++) {
                        massiveIn[k][j] = massiveIn[k][i];
                    }
                    for (int k = 0; k < size; k++) {
                        massiveIn[k][i] = temp[k];
                    }
                }
            }

        }
return massiveIn;
    }

    public static int choices (){
        Scanner in = new Scanner(System.in);
        System.out.println("Input method of matrix filling (random/manual)");
        String choice=in.nextLine();

        int choices = 0;
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
