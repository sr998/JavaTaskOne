package javaTaskOne;

import guiRender.guiMethods;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;



public class GUI extends JFrame {

    private JButton button = new JButton("Calculate");
    private JLabel labelM = new JLabel("Input M");
    private JLabel labelN = new JLabel("Input N");
    private JTextField mField = new JTextField("", 2);
    private JTextField nField = new JTextField("", 2);
    private JTextArea input = new JTextArea("Input numbers you want to insert", 10, 10);
    private JLabel label = new JLabel("Input");
    private JTextArea out = new JTextArea(3, 2);
    private JTextArea outnew = new JTextArea(3, 2);
    private JRadioButton radioButton = new JRadioButton("Manual input");
    private JRadioButton radioButton2 = new JRadioButton("GetRandomMatrixShort");
    private JLabel labelSource = new JLabel("Source:");
    private JLabel labelSorted = new JLabel("Sorted:");


    public GUI() {
        super("Matrix Calculator");
        this.setBounds(400, 400, 500, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 6, 0, 4));

        container.add(labelN);
        container.add(nField);
        container.add(labelM);
        container.add(mField);
        container.add(label);
        container.add(input);


        ButtonGroup group = new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton2);

        container.add(radioButton);
        radioButton.setSelected(true);
        container.add(radioButton2);


        button.addActionListener(new ButtonEventListener());


        container.add(labelSource);
        container.add(out);
        container.add(labelSorted);
        container.add(outnew);
        container.add(button);


    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (radioButton2.isSelected()) {
                input.setText("You chose random! Dont touch this field!");

                String m = mField.getText();
                String n = nField.getText();
                boolean isNumberM = guiMethods.isNumeric(m);
                boolean isNumberN = guiMethods.isNumeric(m);

                if ((m.equals("") || n.equals("") || isNumberM == false || isNumberN == false)|| (short)Integer.parseInt(m)< (short)Integer.parseInt(n)) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    short intM = (short) Integer.parseInt(m);
                    short intN = (short) Integer.parseInt(n);

                    short[][] arr = new short[intN][intM];
                    try {
                        Import.guiRandomArray(intN, intM, arr);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    guiMethods.printArray(arr,intN,out);

                    short[][] arr2 = new short[intN][intM];

                    arr2 = SortAlgorithm.clearAlgorithm(arr);

                    StringBuffer sb2 = new StringBuffer();

                    guiMethods.printArray(arr2,intN,outnew);

                }
            }

            if (radioButton.isSelected()) {
                radioButton.setText("Input numbers you want to insert");
                String m = mField.getText();
                String n = nField.getText();
                boolean isNumberM = guiMethods.isNumeric(m);
                boolean isNumberN = guiMethods.isNumeric(m);

                if ((m.equals("") || n.equals("") || isNumberM == false || isNumberN == false)|| (short)Integer.parseInt(m)< (short)Integer.parseInt(n)) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {


                    short intM = (short) Integer.parseInt(m);
                    short intN = (short) Integer.parseInt(n);
                    String[] str = input.getText().split(" ");

                    if (str.length == intM * intM) {

                        short[] intChars = guiMethods.strArrayToIntArray(str);

                        short[][] arr = new short[intN][intM];


                        arr = guiMethods.arrayToMatrix(intChars, intN, intM);


                       guiMethods.printArray(arr,intN,out);

                        short[][] arr2 = new short[intN][intM];

                        arr2 = SortAlgorithm.clearAlgorithm(arr);

                        guiMethods.printArray(arr2,intN,outnew);

                    } else {
                        JOptionPane.showMessageDialog(null, "You entered the wrong variables into TextArea(Input)", "Output", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }

        }


    }
}







