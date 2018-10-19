package javaTaskOne.Controller.Misc;

import javaTaskOne.Model.guiMethods;

public class isArrayNumericChecker {

    public static boolean isArrayNumeric (String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (IsNumeric.isNumeric(arr[i])==false){
                return false;
            }
        }
        return true;
    }
}
