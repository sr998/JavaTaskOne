package javaTaskOne;

import java.io.IOException;


public class ConsoleView {


    public static void main(String[] args) throws IOException {
        System.out.println("Array sort created by Serhii Radchuk");
        PrintArray.print(SortAlgorithm.algorithm(),"Sorted");

    }
}
