package javaTaskOne.Controller.Events;


import javaTaskOne.Controller.Misc.IsStringNumeric;
import javaTaskOne.Controller.Misc.IsArrayNumericChecker;
import javaTaskOne.Model.ArrayOperations.SortAlgorithm;
import javaTaskOne.Model.ArrayOperations.GenerateRandomArray;
import javaTaskOne.Model.ArrayOperations.MatrixConvert;
import javaTaskOne.Model.PrintingArray.PrintArray;
import javaTaskOne.View.GUI.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ButtonPressedEvent extends GUI {

    public static class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (getRadioButton2().isSelected()) {
                getInput().setText("You chose random! Dont touch this field!");
                GUI.getButton();
                String n = getnField().getText();

                boolean isNumberN = IsStringNumeric.isNumeric(n);

                if (n.equals("") || isNumberN == false) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    short intN = (short) Integer.parseInt(n);

                    short[][] arr = new short[intN][intN];
                    try {
                        GenerateRandomArray.guiRandomArray(arr);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    PrintArray.printArray(arr, intN, getOut());

                    short[][] arr2 = new short[intN][intN];

                    arr2 = SortAlgorithm.clearAlgorithm(arr);

                    StringBuffer sb2 = new StringBuffer();

                    PrintArray.printArray(arr2, intN, getOutnew());

                }
            }

            if (getRadioButton().isSelected()) {


                String n = getnField().getText();

                boolean isNumberN = IsStringNumeric.isNumeric(n);

                if (n.equals("") || isNumberN == false) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {


                    short intN = (short) Integer.parseInt(n);

                    String[] str = getInput().getText().split(" ");
                    boolean isArrayNumeric = IsArrayNumericChecker.isArrayNumeric(str);

                    if (isArrayNumeric == false) {
                        JOptionPane.showMessageDialog(null, "You need to enter only short numbers to the input field!", "Error", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        if (str.length == intN * intN) {

                            short[] intChars = MatrixConvert.strArrayToIntArray(str);

                            short[][] arr = new short[intN][intN];


                            arr = MatrixConvert.arrayToMatrix(intChars, intN, intN);


                            PrintArray.printArray(arr, intN, getOut());

                            short[][] arr2 = new short[intN][intN];

                            arr2 = SortAlgorithm.clearAlgorithm(arr);

                            PrintArray.printArray(arr2, intN, getOutnew());

                        } else {
                            JOptionPane.showMessageDialog(null, "You entered the wrong variables into TextArea(Input)", "Output", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }

            }


        }
    }

}
