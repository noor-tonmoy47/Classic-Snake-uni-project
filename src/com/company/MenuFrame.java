package com.company;

//import jdk.incubator.vector.VectorOperators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame  extends JFrame implements ActionListener {

    private JTextField menuText;
    private JPanel buttonPanel;
    private JButton[] buttons;
    MenuFrame(){
        this.setSize(897,690);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setMenuText();

//        MenuButtons b1 = new MenuButtons("Menu");
//        this.add(b1);
        this.add(menuText);


        /* Working Code
       MenuButtons b1 = new MenuButtons("Play Game");
       this.add(b1);
       MenuButtons b2 = new MenuButtons("Credits");
       this.add(b2);
       MenuButtons b3 = new MenuButtons("Instructions");
       this.add(b3);
       MenuButtons b4 = new MenuButtons("Quit Game");
       this.add(b4);
        */
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        //buttonPanel.setBackground(new Color(76,153,0));
        buttonPanel.setOpaque(false);
        buttonPanel.setBounds(330,180, 200,400);

        buttons = new JButton[4];

        MenuButtons b1 = new MenuButtons("Play Game");
        buttons[0] = b1;
        buttons[0].addActionListener(this);

        buttonPanel.add(b1);
        MenuButtons b2 = new MenuButtons("Credits");
        buttons[1] = b2;
        buttons[1].addActionListener(this);
        buttonPanel.add(b2);
        MenuButtons b3 = new MenuButtons("Instructions");
        buttons[2] = b3;
        buttons[2].addActionListener(this);
        buttonPanel.add(b3);
        MenuButtons b4 = new MenuButtons("Quit Game");
        buttons[3] = b4;
        buttons[3].addActionListener(this);
        buttonPanel.add(b4);

        this.add(buttonPanel);

        MenuScreen ms1 = new MenuScreen();
        this.add(ms1);

        //this.setVisible(true);
    }
    private void setMenuText(){
        this.menuText = new JTextField("Menu");
        this.menuText.setEditable(false);
        this.menuText.setHighlighter(null);
        this.menuText.setBackground(Color.white);
        //this.menuText.setOpaque(false);
        this.menuText.setForeground(Color.black);
        this.menuText.setHorizontalAlignment(JTextField.CENTER);
        this.menuText.setFont(new Font("Comic Sans", Font.BOLD, 30));
        this.menuText.setBounds(290, 80, 280, 50);
    }
//    private MenuButtons sendButton(MenuButtons b){
//        return b;
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttons[0]){
            System.out.println("Playing game");
            new GameFrame();
            this.dispose();
        }
        else if(e.getSource() == buttons[1]){
            //System.out.println("Viewing Credits");
            CreditsScreen t = new CreditsScreen();
            this.dispose();

            t.setVisible(true);
            //this.add(t);

        }
        else if(e.getSource() == buttons[2]){
            //System.out.println("Viewing Instructions");
            InsScreen i = new InsScreen();
            this.dispose();

            i.setVisible(true);
        }
        else if(e.getSource() == buttons[3]){
            //System.out.println("Quiting game");
            int answer = JOptionPane.showConfirmDialog(this,"Are you sure you want to quit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            //int answer = JOptionPane.shco
            //System.out.println(answer);
            if(answer == 0){
                System.exit(0);
            }
        }
    }
}
