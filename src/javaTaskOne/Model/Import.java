package javaTaskOne.Model;

import javaTaskOne.Controller.Misc.Random;

import java.io.IOException;

public class Import {


    public static short[][] guiRandomArray(short[][] source) throws IOException {


        for (short i=0; i < source.length;i++){
            for (short j = 0; j < source.length; j++) {
                source[i][j]= (short) Random.getRandom(20,-10);
            }
        }

        return source;
    }

    }

