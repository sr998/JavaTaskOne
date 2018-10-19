package javaTaskOne.Controller;


import javaTaskOne.Controller.Misc.IsNumeric;
import javaTaskOne.Controller.Misc.isArrayNumericChecker;
import javaTaskOne.Model.Import;
import javaTaskOne.Model.guiMethods;
import javaTaskOne.Model.SortAlgorithm;
import javaTaskOne.Model.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public  class MyEvent extends GUI {

   public static class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (getRadioButton2().isSelected()) {
                getInput().setText("You chose random! Dont touch this field!");
                GUI.getButton();
                String n = getnField().getText();

                boolean isNumberN = IsNumeric.isNumeric(n);

                if (n.equals("") || isNumberN == false) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    short intN = (short) Integer.parseInt(n);

                    short[][] arr = new short[intN][intN];
                    try {
                        Import.guiRandomArray(arr);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    guiMethods.printArray(arr, intN, getOut());

                    short[][] arr2 = new short[intN][intN];

                    arr2 = SortAlgorithm.clearAlgorithm(arr);

                    StringBuffer sb2 = new StringBuffer();

                    guiMethods.printArray(arr2, intN, getOutnew());

                }
            }

            if (getRadioButton().isSelected()) {


                String n = getnField().getText();

                boolean isNumberN = IsNumeric.isNumeric(n);

                if (n.equals("") || isNumberN == false) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {


                    short intN = (short) Integer.parseInt(n);

                    String[] str = getInput().getText().split(" ");
                    boolean isArrayNumeric = isArrayNumericChecker.isArrayNumeric(str);

                    if (isArrayNumeric == false) {
                        JOptionPane.showMessageDialog(null, "You need to enter only short numbers to the input field!", "Error", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        if (str.length == intN * intN) {

                            short[] intChars = guiMethods.strArrayToIntArray(str);

                            short[][] arr = new short[intN][intN];


                            arr = guiMethods.arrayToMatrix(intChars, intN, intN);


                            guiMethods.printArray(arr, intN, getOut());

                            short[][] arr2 = new short[intN][intN];

                            arr2 = SortAlgorithm.clearAlgorithm(arr);

                            guiMethods.printArray(arr2, intN, getOutnew());

                        } else {
                            JOptionPane.showMessageDialog(null, "You entered the wrong variables into TextArea(Input)", "Output", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }

            }


        }
    }

}
