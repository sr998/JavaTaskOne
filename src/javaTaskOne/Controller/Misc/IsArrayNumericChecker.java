package javaTaskOne.Controller.Misc;

public class IsArrayNumericChecker {

    public static boolean isArrayNumeric (String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (IsStringNumeric.isNumeric(arr[i])==false){
                return false;
            }
        }
        return true;
    }
}
