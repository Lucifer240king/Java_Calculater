/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.springcore.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Calculator implements ActionListener{

    
    JFrame frame;
    JTextField textField ;
    JButton numberButton[]=new JButton[10];
    JButton functionButton[]=new JButton[8];
    JButton addButton,subButton,divButton,mulButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;
    
    Font myfont=new Font("Ink Free",Font.BOLD,25);
    
    double num1=0,num2=0,result=0;
    char operator;
    
    public Calculator() {
        
        frame =new JFrame("Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,550);
        
        textField=new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myfont);
        
        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        decButton=new JButton(".");
        equButton=new JButton("=");
        delButton=new JButton("delete");
        clrButton=new JButton("clear");
        
        
        functionButton[0]=addButton;
        functionButton[1]=subButton;
        functionButton[2]=mulButton;
        functionButton[3]=divButton;
        functionButton[4]=decButton;
        functionButton[5]=equButton;
        functionButton[6]=delButton;
        functionButton[7]=clrButton;
        
        for(int i=0;i<8;i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myfont);
            functionButton[i].setFocusable(false);
        }
//        
        for(int i=0;i<10;i++){
            numberButton[i]=new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myfont);
            numberButton[i].setFocusable(false);
        }
//        
        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);
//        
        
        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButton[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        
        frame.add(clrButton);
        frame.add(delButton);
        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
        if(e.getSource()==numberButton[i]){
            textField.setText(textField.getText().concat(String.valueOf(i)));
        
           }
        }
        
        if(e.getSource()==decButton){
            textField.setText(textField.getText().concat("."));
        }
        
        if(e.getSource()==addButton){
            num1=Double.parseDouble(textField.getText());
            operator='+';
            textField.setText("");
        }
        
        if(e.getSource()==subButton){
            num1=Double.parseDouble(textField.getText());
            operator='-';
            textField.setText("");
        }
        
        if(e.getSource()==mulButton){
            num1=Double.parseDouble(textField.getText());
            operator='*';
            textField.setText("");
        }
        
        if(e.getSource()==divButton){
            num1=Double.parseDouble(textField.getText());
            operator='/';
            textField.setText("");
        }
        
        if(e.getSource()==equButton){
            num2=Double.parseDouble(textField.getText());
            
            switch(operator){
                case'+' :
                    result=num1+num2;
                    break;
                    
                case'-' :
                    result=num1-num2;
                    break;
                    
                case'*' :
                    result=num1*num2;
                    break;
                     
                case'/' :
                    result=num1/num2; 
                    break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
            
        }
        
            if(e.getSource()==clrButton){
            textField.setText("");
        }
            
            if(e.getSource()==delButton){
            String string=textField.getText();
            textField.setText("");
            for(int i=0;i<string.length()-1;i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
          }
        
    }
}


//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//
//public class Calculator implements ActionListener {
//
//    JFrame frame;
//    JTextField principalField, rateField, yearsField, resultField;
//    JButton calculateButton, exitButton;
//
//    Font myfont = new Font("Ink Free", Font.BOLD, 25);
//
//    public Calculator() {
//        frame = new JFrame("Compound Interest Calculator");
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//        frame.setSize(420, 550);
//
//        // Create input fields
//        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
//        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        principalField = createTextField(inputPanel, "Principal Amount");
//        rateField = createTextField(inputPanel, "Annual Interest Rate (%)");
//        yearsField = createTextField(inputPanel, "Number of Years");
//        resultField = createTextField(inputPanel, "Result");
//        resultField.setEditable(false);
//
//        // Create Calculate button
//        calculateButton = new JButton("Calculate");
//        calculateButton.setFont(myfont);
//        calculateButton.setFocusable(false);
//        calculateButton.addActionListener(this);
//
//        // Create Exit button
//        exitButton = new JButton("Exit");
//        exitButton.setFont(myfont);
//        exitButton.setFocusable(false);
//        exitButton.addActionListener(e -> System.exit(0));
//
//        // Add components to the frame
//        frame.add(inputPanel, BorderLayout.CENTER);
//        JPanel buttonPanel = new JPanel(new BorderLayout());
//        buttonPanel.add(calculateButton, BorderLayout.WEST);
//        buttonPanel.add(exitButton, BorderLayout.EAST);
//        frame.add(buttonPanel, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
//    }
//
//    private JTextField createTextField(JPanel panel, String label) {
//        JLabel jLabel = new JLabel(label);
//        jLabel.setFont(myfont);
//
//        JTextField textField = new JTextField();
//        textField.setFont(myfont);
//
//        panel.add(jLabel);
//        panel.add(textField);
//
//        return textField;
//    }
//
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == calculateButton) {
//            try {
//                double principal = Double.parseDouble(principalField.getText());
//                double rate = Double.parseDouble(rateField.getText()) / 100;
//                int years = Integer.parseInt(yearsField.getText());
//
//                double amount = calculateCompoundInterest(principal, rate, years);
//
//                resultField.setText(String.format("$%.2f", amount));
//            } catch (NumberFormatException ex) {
//                resultField.setText("Invalid input");
//            }
//        }
//    }
//
//    private double calculateCompoundInterest(double principal, double rate, int years) {
//        double amount = principal * Math.pow(1 + rate, years);
//        return amount;
//    }
//}
