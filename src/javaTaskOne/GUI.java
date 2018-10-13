package javaTaskOne;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class GUI extends JFrame {
    private JButton button = new JButton("Press");
    private JLabel labelM = new JLabel("Input M");
    private JLabel labelN = new JLabel("Input N");
    private JTextField mField = new JTextField("", 2);
    private JTextField nField = new JTextField("", 2);
    private JTextArea input = new JTextArea("Input numbers you want to insert", 10, 10);
    private JLabel label = new JLabel("Input");
    private JTextArea out = new JTextArea(3, 2);
    private JTextArea outnew = new JTextArea(3,2);
    private JRadioButton radioButton = new JRadioButton("Manual input");
    private JRadioButton radioButton2 = new JRadioButton("Random");
    private JLabel labelSource = new JLabel("Source:");
    private JLabel labelSorted = new JLabel("Sorted:");


    public GUI() {
        super("Frame");
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


        //radioButton.addActionListener(new ButtonEventListener());
        // radioButton2.addActionListener(new ButtonEventListener());

        //  button.setPreferredSize(new Dimension(400, 200));
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
                if (mField.getText().equals("") || nField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    int intM = Integer.parseInt(m);
                    int intN = Integer.parseInt(n);

                    short[][] arr = new short[intN][intM];
                    try {
                        Import.guiRandomArray(intN, intM, arr);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    StringBuffer sb = new StringBuffer();

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if(j == intN-1)
                                sb.append(String.valueOf(arr[i][j])+" ").append("\n");
                            else sb.append(String.valueOf(arr[i][j])+" ");
                        }
                        out.setText(sb.toString());

                    }

                    short[][] arr2 = new short[intN][intM];

                    arr2 = SortAlgorithm.clearAlgorithm(arr);

                    StringBuffer sb2 = new StringBuffer();

                    for (int i = 0; i < arr2.length; i++) {
                        for (int j = 0; j < arr2[i].length; j++) {
                            if(j == intN-1)
                                sb2.append(String.valueOf(arr2[i][j])+" ").append("\n");
                            else sb2.append(String.valueOf(arr2[i][j])+" ");
                        }
                        outnew.setText(sb2.toString());

                    }

                }
            }

            if (radioButton.isSelected()) {
                radioButton.setText("Input numbers you want to insert");
                String m = mField.getText();
                String n = nField.getText();

                if (mField.getText().equals("") || nField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "You entered wrong N or M", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {


                    int intM = Integer.parseInt(m);
                    int intN = Integer.parseInt(n);
                    String[] str = input.getText().split(" ");

                    if (str.length == intM * intM) {

                        short[] intChars = guiMethods.strArrayToIntArray(str);

                        short[][] arr = new short[intN][intM];


                        arr = guiMethods.arrayToMatrix(intChars, intN, intM);


                        StringBuffer sb = new StringBuffer();

                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                if(j == intN-1)
                                    sb.append(String.valueOf(arr[i][j])+" ").append("\n");
                                else sb.append(String.valueOf(arr[i][j])+" ");
                            }
                            out.setText(sb.toString());

                        }

                        short[][] arr2 = new short[intN][intM];

                        arr2 = SortAlgorithm.clearAlgorithm(arr);

                        StringBuffer sb2 = new StringBuffer();

                        for (int i = 0; i < arr2.length; i++) {
                            for (int j = 0; j < arr2[i].length; j++) {
                                if(j == intN-1)
                                    sb2.append(String.valueOf(arr2[i][j])+" ").append("\n");
                                else sb2.append(String.valueOf(arr2[i][j])+" ");
                            }
                            outnew.setText(sb2.toString());

                        }

                        // JOptionPane.showMessageDialog(null, m, "Output", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "You entered the wrong number of variables into TextArea(input)", "Output", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }

        }

        // message += "Text is "+input.getText()+ "\n";
        // message += (radioButton.isSelected() ? "Radio1" : "Radio2") + "is selected\n";


        //out.setText(Arrays.toString(intChars));

    }
}







