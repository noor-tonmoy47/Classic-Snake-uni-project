package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuButtons extends JButton {
    //private JPanel buttonPanel;
    MenuButtons(String name){
        this.setText(name);
        this.setFocusable(false);
        //this.setBounds(280, 190, 300, 60);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setFont(new Font("Mv Boil", Font.PLAIN, 20));
        //this.addActionListener(this);
//        if(name.equals("Back")){
//
//        }
        if(name.equals("Play Game")){
            this.setBounds(10, 30, 180, 60);
        }
        if(name.equals("Credits")){
            this.setBounds(10, 130, 180, 60);
        }
        if(name.equals("Instructions")){
            this.setBounds(10, 230, 180, 60);
        }
        if(name.equals("Quit Game")){
            this.setBounds(10, 330, 180, 60);
        }
//        buttonPanel.setLayout(null);
//        buttonPanel.setBounds();
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == this && this.getText().equals("Play Game")){
//            System.out.println("Playing game");
//        }
//        else if(e.getSource() == this && this.getText().equals("Credits")){
//            System.out.println("Viewing Credits");
//        }
//        else if(e.getSource() == this && this.getText().equals("Instructions")){
//            System.out.println("Viewing Instructions");
//        }
//        else if(e.getSource() == this && this.getText().equals("Quit Game")){
//            System.out.println("Quiting game");
//        }
//    }
}
