package javaTaskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Import {

    public static int inputVariable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String snum = br.readLine();
        return Integer.parseInt(snum);
    }

    public static int[][] inputRandomArray() throws IOException {
        System.out.println("Input array size: ");
        int[][] source = new int[Import.inputVariable()][Import.inputVariable()];
        for (int i=0; i < source.length;i++){
            for (int j = 0; j < source.length; j++) {
                source[i][j]=Random.randomArray(20,-10);
            }
        }
        PrintArray.print(source,"Unsorted");
        return source;
    }

    public static int[][] inputArrayFromKeyboard() throws IOException {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int MAXVALUE=35;
        int count=0;
                System.out.println("Input array size: ");
                int[][] source = new int[Import.inputVariable()][Import.inputVariable()];


                for (int i = 0; i < source.length; i++) {
                    for (int j = 0; j < source[i].length; j++) {
                        System.out.print("Input array element arr[" + i + "][" + j + "]:");
                        source[i][j] = in.nextInt();
                    }
                }
                in.close();

                for (int i = 0; i < source.length; i++) {
                    for (int j = 0; j < source[i].length; j++) {
                        System.out.print(source[i][j] + "\t");
                        if (source[i][j] > MAXVALUE) {
                            sum += source[i][j];
                            count++;
                        }
                    }
                    System.out.println();
                }
                PrintArray.print(source,"Unsorted");
            return source;
        }
    }

