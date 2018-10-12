package javaTaskOne;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;




public class GUI extends JFrame {
    private JButton button = new JButton("Press");
    private JLabel labelM = new JLabel("Input M");
    private JLabel labelN = new JLabel("Input N");
    private JTextField mField = new JTextField("", 2);
    private JTextField nField = new JTextField("", 2);
    private JTextArea input = new JTextArea("", 10, 10);
    private JLabel label = new JLabel("Input");
    private JTextField out = new JTextField("", 2);
    private JTextField outnew = new JTextField("", 2);
    private JRadioButton radioButton = new JRadioButton("Press this");
    private JRadioButton radioButton2 = new JRadioButton("Press that");
    private JLabel labelSource = new JLabel("Source:");
    private JLabel labelSorted = new JLabel("Sorted:");


    public GUI() {
        super("Frame");
        this.setBounds(250, 250, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(8, 6, 0, 4));

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

        button.setPreferredSize(new Dimension(400, 200));
        container.add(labelSource);
        container.add(out);
        container.add(labelSorted);
        container.add(outnew);
        container.add(button);


    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String m = mField.getText();
            int intM = Integer.parseInt(m);
            String n = nField.getText();
            int intN = Integer.parseInt(n);
            String[] str = input.getText().split(" ");

            int[] intChars = guiMethods.strArrayToIntArray(str);

            int[][] arr = new int[intN][intM];


            arr =guiMethods.arrayToMatrix(intChars, intN, intM);


            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sb.append(String.valueOf(arr[i][j] + " "));
                }
                out.setText(sb.toString());
            }

            int[][] arr2 = new int[intN][intM];

            arr2=SortAlgorithm.clearAlgorithm(arr);

            StringBuffer sb2 = new StringBuffer();

            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {

                    sb2.append(String.valueOf(arr[i][j] + " "));

                }
                outnew.setText(sb2.toString());
            }


            // message += "Text is "+input.getText()+ "\n";
            // message += (radioButton.isSelected() ? "Radio1" : "Radio2") + "is selected\n";

            JOptionPane.showMessageDialog(null, m, "Output", JOptionPane.PLAIN_MESSAGE);

            //out.setText(Arrays.toString(intChars));

        }

    }
}




