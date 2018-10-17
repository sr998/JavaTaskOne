package javaTaskOne;

import Misc.GetRandomMatrixShort;

import java.io.IOException;

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

