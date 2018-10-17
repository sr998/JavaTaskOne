package javaTaskOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Import {


    public static short[][] guiRandomArray(int intN, int intM, short[][] source) throws IOException {


        for (short i=0; i < source.length;i++){
            for (short j = 0; j < source.length; j++) {
                source[i][j]= (short) GetRandomMatrixShort.randomArray(20,-10);
            }
        }

        return source;
    }

    }

