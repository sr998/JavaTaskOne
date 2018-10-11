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


        for(int i = 0; i < size - 1; i++) {
            for(int j = i + 1; j < size; j++) {
                for(int m = 0; m <size; m++) {
                    if(massiveIn[i][m] > massiveIn[j][m]) {
                        int temp = massiveIn[i][m];
                        massiveIn[i][m] = massiveIn[j][m];
                        massiveIn[j][m] = temp;
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
