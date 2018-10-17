package javaTaskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Import {



    public static short inputVariable() throws IOException {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String snum = br.readLine();
            short num;
            try{
                num = (short)Integer.parseInt(snum);
            return num;
        }catch (NumberFormatException nfe)
        {
            System.out.println("You entered String instead if integer!\n\nPlease enter Integer!");
            snum = br.readLine();
            num = (short)Integer.parseInt(snum);
        }

return num;


    }

    public static short[][] inputRandomArray() throws IOException {

        System.out.println("Input N and M matrix size: ");
        short[][] source = new short[Import.inputVariable()][Import.inputVariable()];
        for (short i=0; i < source.length;i++){
            for (short j = 0; j < source.length; j++) {
                source[i][j]= (short) GetRandomMatrixShort.randomArray(20,-10);
            }
        }
        PrintArray.print(source,"Unsorted");
        return source;
    }

    public static short[][] inputArrayFromKeyboard() throws IOException {
        short sum = 0;
        short MAXVALUE=35;
        short count=0;
        Scanner in = new Scanner(System.in);

                System.out.println("Input array size: ");
                short[][] source = new short[Import.inputVariable()][Import.inputVariable()];

try {
    for (short i = 0; i < source.length; i++) {
        for (short j = 0; j < source[i].length; j++) {
            System.out.print("Input array element arr[" + i + "][" + j + "]:");
            source[i][j] = in.nextShort();
        }
    }
    in.close();

    for (short i = 0; i < source.length; i++) {
        for (short j = 0; j < source[i].length; j++) {
            System.out.print(source[i][j] + "\t");
            if (source[i][j] > MAXVALUE) {
                sum += source[i][j];
                count++;
            }
        }
        System.out.println();
    }
    PrintArray.print(source, "Unsorted");
    return source;
}catch (InputMismatchException ime)
{
    System.out.println("You entered String instead of Integer, please enter int!");
    for (short i = 0; i < source.length; i++) {
        for (short j = 0; j < source[i].length; j++) {
            System.out.print("Input array element arr[" + i + "][" + j + "]:");
            source[i][j] = in.nextShort();
        }
    }
    in.close();

    for (short i = 0; i < source.length; i++) {
        for (short j = 0; j < source[i].length; j++) {
            System.out.print(source[i][j] + "\t");
            if (source[i][j] > MAXVALUE) {
                sum += source[i][j];
                count++;
            }
        }
        System.out.println();
    }
    PrintArray.print(source, "Unsorted");
}return source;
        }

    public static short[][] guiRandomArray(int intN, int intM, short[][] source) throws IOException {


        for (short i=0; i < source.length;i++){
            for (short j = 0; j < source.length; j++) {
                source[i][j]= (short) GetRandomMatrixShort.randomArray(20,-10);
            }
        }

        return source;
    }
    }

