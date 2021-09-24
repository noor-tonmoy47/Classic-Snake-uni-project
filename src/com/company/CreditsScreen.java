package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditsScreen extends JFrame implements ActionListener {
    private JTextArea creditsText;
    private JTextField creditsHeader;
    private JButton backCredits;
    private final String  ultimate;
    CreditsScreen(){
        //this.setLayout();
//        ultimate = """
//                                   Credits
//
//
//
//            1. Md Sams Noor Tonmoy
//                Reg No: 2019831043
//
//
//            2. Arnab Sen
//                Reg No: 2019831078""";

//        name1 = "Md Sams Noor Tonmoy";
//        RegNo1 = "2019831043";
//
//        name2 = "Arnab Sen";
//        RegNo2 = "2019831078";

        ultimate = """
                1. Md Sams Noor Tonmoy
                    Reg No: 2019831043


                2. Arnab Sen
                    Reg No: 2019831078""";

        this.setBounds(0,0, 897, 690);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setFont(new Font("Mv Boil", Font.BOLD, 25));
//        this.setText("1. " + name1);
//        this.setText("\n");
//        this.setText("Reg No: " + RegNo1);
//        this.setText("\n");
//        this.setText("1. " + name2);
//        this.setText("\n");
//        this.setText("Reg No: " + RegNo2);
//        this.setText("\n");
//        setCreditsText();
//        this.add(creditsText);

        setCreditsHeader();
        this.add(creditsHeader);

        setCreditsText();
        this.add(creditsText);

        setBack();
        this.add(backCredits);


        MenuScreen ms2 = new MenuScreen();
        this.add(ms2);
    }

    private void setCreditsHeader(){
        creditsHeader = new JTextField();
        creditsHeader.setEditable(false);
        creditsHeader.setHighlighter(null);
        creditsHeader.setBounds(370, 100, 130, 30);
        creditsHeader.setHorizontalAlignment(JTextField.CENTER);
        creditsHeader.setBorder(null);
        creditsHeader.setFont(new Font("Mv Boil", Font.BOLD, 30));
        creditsHeader.setOpaque(false);
        creditsHeader.setText("Credits");
    }

    private void setCreditsText(){
        creditsText = new JTextArea();
        creditsText.setEditable(false);
        creditsText.setHighlighter(null);
        //CreditsText.setHorizontalAlignment(JTextField.LEADING);
        creditsText.setBounds(90,230,360,200);
        creditsText.setFont(new Font("Mv Boil", Font.PLAIN, 27));
        creditsText.setOpaque(false);
        creditsText.setText(ultimate);
    }
    private void setBack(){
        backCredits = new JButton("Back");
        backCredits.setFont(new Font("Mv Boil", Font.BOLD, 22));
        backCredits.setFocusable(false);
        backCredits.setBorderPainted(false);
        backCredits.setForeground(Color.black);
        backCredits.setBackground(Color.white);
        backCredits.setBounds(90,570, 130, 40);
        backCredits.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backCredits){
            this.dispose();
            MenuFrame f3 = new MenuFrame();
            f3.setVisible(true);
            //f2.setVisi
        }
    }
}
