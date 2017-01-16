package com.codebind;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {

    private JButton buttonCheckHex;
    private JButton buttonCheckBin;
    private JButton buttonCheckDec;
    private JButton reset;
    private JLabel fehlermeldung;
    private JTextField hexaInput;
    private JPanel panelMain;
    private JTextField decimalInput;
    private JLabel decimalLabel;
    private JTextField binaryInput;
    private JLabel binaryLabel;
    private JTextField test;
    private JLabel hexadecimalLabel;
    private JLabel title;
    private JLabel subtitle;



    public GUI() {

        this.setTitle("Converter");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.initWindow();
    }




    private void initWindow(){
        fehlermeldung = new JLabel("Falsche Eingabe!");
        fehlermeldung.setVisible(false);
        buttonCheckDec = new JButton("Convert");
        buttonCheckHex = new JButton("Convert");
        buttonCheckBin = new JButton("Convert");
        reset = new JButton("Reset!");
        test = new JTextField("");
        decimalInput = new JTextField("");
        binaryInput = new JTextField("");
        hexaInput = new JTextField("");
        decimalLabel = new JLabel("Dezimalwert:");
        binaryLabel = new JLabel("Binärwert:");
        hexadecimalLabel = new JLabel("Hexadezimalwert:");
        title = new JLabel("Konverter");
        subtitle = new JLabel("Hex - Binär - Dezimal");






        buttonCheckDec.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                boolean eingabeRichtig = true;
                for(int i=0; i < decimalInput.getText().length();i++){
                    if(!Character.isDigit(decimalInput.getText().charAt(i))){
                        eingabeRichtig = false;
                    }
                }
                if(eingabeRichtig)
                {
                    fehlermeldung.setVisible(false);
                    binaryInput.setText(Converter.decToBin(decimalInput.getText()));
                    hexaInput.setText(Converter.decToHex(decimalInput.getText()));
                }
                else
                {
                    fehlermeldung.setVisible(true);
                }

            }

        });

        buttonCheckBin.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                boolean eingabeRichtig = true;
                String s = binaryInput.getText();
                for(int i=0; i < s.length();i++){
                    if(!(s.charAt(i) == '0' || s.charAt(i) == '1')){
                        eingabeRichtig = false;
                    }
                }
                if(eingabeRichtig)
                {
                    fehlermeldung.setVisible(false);
                    decimalInput.setText(Converter.binToDec(binaryInput.getText()));
                    hexaInput.setText(Converter.binToHex(binaryInput.getText()));
                }
                else
                    fehlermeldung.setVisible(true);
            }

        });

        buttonCheckHex.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                boolean eingabeRichtig = true;
                if (eingabeRichtig) {
                    decimalInput.setText(Converter.hexToDec(hexaInput.getText()));
                    binaryInput.setText(Converter.hexToBin(hexaInput.getText()));
                } else
                    fehlermeldung.setVisible(true);
            }
        });

        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                decimalInput.setText("");
                binaryInput.setText("");
                hexaInput.setText("");
            }
        });


        buttonCheckDec.setBounds(250,150,100,20);
        this.getContentPane().add(buttonCheckDec);


        buttonCheckBin.setBounds(250,250,100,20);
        this.getContentPane().add(buttonCheckBin);

        buttonCheckHex.setBounds(250,350,100,20);
        this.getContentPane().add(buttonCheckHex);

        reset.setBounds(150,400,100,20);
        this.getContentPane().add(reset);

        fehlermeldung.setBounds(150,100,300,20);
        this.getContentPane().add(fehlermeldung);
        fehlermeldung.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
        fehlermeldung.setForeground(Color.RED);


        hexaInput.setBounds(150,350,100,20);
        this.getContentPane().add(hexaInput);

        decimalInput.setBounds(150,150,100,20);
        this.getContentPane().add(decimalInput);

        binaryInput.setBounds(150,250,100,20);
        this.getContentPane().add(binaryInput);


        decimalLabel.setBounds(20,150,150,20);
        this.getContentPane().add(decimalLabel);

        binaryLabel.setBounds(20,250,150,20);
        this.getContentPane().add(binaryLabel);

        hexadecimalLabel.setBounds(20,350,150,20);
        this.getContentPane().add(hexadecimalLabel);

        title.setBounds(170,20,400,50);
        this.getContentPane().add(title);
        title.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 20));
        title.setForeground(Color.BLUE);

        subtitle.setBounds(150,50,400,50);
        this.getContentPane().add(subtitle);
        subtitle.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 16));
        subtitle.setForeground(Color.BLUE);

        test.setBounds(150,250,100,20);
        this.getContentPane().add(test);











    }
}

