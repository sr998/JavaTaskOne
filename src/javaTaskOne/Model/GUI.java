package javaTaskOne.Model;

import javaTaskOne.Controller.MyEvent;

import java.awt.*;
import javax.swing.*;



public class GUI extends JFrame {

    private static JButton button = new JButton("Calculate");
    private static JLabel labelN = new JLabel("Input number of rows and columns");
    private static JTextField nField = new JTextField("", 2);
    private static JTextArea input = new JTextArea("Input numbers you want to insert", 10, 10);
    private static JLabel label = new JLabel("Input");
    private static JTextArea out = new JTextArea(3, 2);
    private static JTextArea outnew = new JTextArea(3, 2);
    private static JRadioButton radioButton = new JRadioButton("Manual input");
    private static JRadioButton radioButton2 = new JRadioButton("Random matrix");
    private static JLabel labelSource = new JLabel("Source:");
    private static JLabel labelSorted = new JLabel("Sorted:");


    public GUI() {
        super("Matrix Calculator");
        this.setBounds(400, 400, 500, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 6, 0, 4));

        container.add(labelN);
        container.add(nField);
        container.add(label);
        container.add(input);


        ButtonGroup group = new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton2);

        container.add(radioButton);
        radioButton.setSelected(true);
        container.add(radioButton2);


        button.addActionListener(new MyEvent.ButtonEventListener());


        container.add(labelSource);
        container.add(out);
        container.add(labelSorted);
        container.add(outnew);
        container.add(button);


    }

    public static JButton getButton() {
        return button;
    }

    public static void setButton(JButton button) {
        GUI.button = button;
    }

    public static JLabel getLabelN() {
        return labelN;
    }

    public static void setLabelN(JLabel labelN) {
        GUI.labelN = labelN;
    }

    public static JTextField getnField() {
        return nField;
    }

    public static void setnField(JTextField nField) {
        GUI.nField = nField;
    }

    public static JTextArea getInput() {
        return input;
    }

    public static void setInput(JTextArea input) {
        GUI.input = input;
    }

    public static JLabel getLabel() {
        return label;
    }

    public static void setLabel(JLabel label) {
        GUI.label = label;
    }

    public static JTextArea getOut() {
        return out;
    }

    public static void setOut(JTextArea out) {
        GUI.out = out;
    }

    public static JTextArea getOutnew() {
        return outnew;
    }

    public static void setOutnew(JTextArea outnew) {
        GUI.outnew = outnew;
    }

    public static JRadioButton getRadioButton() {
        return radioButton;
    }

    public static void setRadioButton(JRadioButton radioButton) {
        GUI.radioButton = radioButton;
    }

    public static JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public static void setRadioButton2(JRadioButton radioButton2) {
        GUI.radioButton2 = radioButton2;
    }

    public static JLabel getLabelSource() {
        return labelSource;
    }

    public static void setLabelSource(JLabel labelSource) {
        GUI.labelSource = labelSource;
    }

    public static JLabel getLabelSorted() {
        return labelSorted;
    }

    public static void setLabelSorted(JLabel labelSorted) {
        GUI.labelSorted = labelSorted;
    }
}








