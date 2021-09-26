package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsScreen extends JFrame implements ActionListener {
    private JTextArea InsText;
    private JTextArea controlsText, keys;
    private JTextField header;
    private JTextField keyMaps;
    private JButton backIns;
    private final String ultimate2 ,ultimate3,ultimate4;
    //private final String ultimate3;
    InsScreen(){
        ultimate2 = """
                The Player controls a snake on a bordered
                plane. The length of the snake as well as the
                score increases as it eats the fruit. Game
                will be over if the snake collides with itself
                or hits the screen wall.  Snake will move
                respectively upon entering the action keys.""";


        ultimate3 = """
                move up\s
                move down\s
                move left\s
                move right""";

        ultimate4 = """
                w / up
                s / down
                a / left
                d / right""";

        this.setBounds(0,0, 897, 690);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setHeader();
        this.add(header);

        setInsText();
        this.add(InsText);

        setKeyMaps();
        this.add(keyMaps);

        setControlsText();
        this.add(controlsText);

        setKeys();
        this.add(keys);

        setBackIns();
        this.add(backIns);


        MenuScreen ms2 = new MenuScreen();
        this.add(ms2);
    }

    private void setHeader(){
        header = new JTextField();
        header.setEditable(false);
        header.setHighlighter(null);
        header.setBounds(290, 35, 320, 40);
        header.setHorizontalAlignment(JTextField.CENTER);
        header.setBorder(null);
        header.setFont(new Font("Mv Boil", Font.BOLD, 30));
        header.setOpaque(false);
        header.setText("Instructions");
    }

    private void setInsText(){
        InsText = new JTextArea();
        InsText.setEditable(false);
        InsText.setHighlighter(null);
        //CreditsText.setHorizontalAlignment(JTextField.LEADING);
        InsText.setBounds(90,105,700,210);
        InsText.setFont(new Font("Mv Boil", Font.PLAIN, 27));
        InsText.setOpaque(false);
        InsText.setText(ultimate2);
    }

    private void setKeyMaps(){
        keyMaps = new JTextField();
        keyMaps.setEditable(false);
        keyMaps.setHighlighter(null);
        keyMaps.setBounds(90, 337, 150, 40);
        keyMaps.setHorizontalAlignment(JTextField.LEFT);
        keyMaps.setBorder(null);
        keyMaps.setFont(new Font("Mv Boil", Font.BOLD, 30));
        keyMaps.setOpaque(false);
        keyMaps.setText("Controls");
    }

    private void setControlsText(){
        controlsText = new JTextArea();
        controlsText.setEditable(false);
        controlsText.setHighlighter(null);
        //CreditsText.setHorizontalAlignment(JTextField.LEADING);
        controlsText.setBounds(90,390,170,150);
        controlsText.setFont(new Font("Mv Boil", Font.PLAIN, 27));
        controlsText.setOpaque(false);
        controlsText.setText(ultimate3);
    }
    private void setKeys(){
        keys = new JTextArea();
        keys.setEditable(false);
        keys.setHighlighter(null);
        //CreditsText.setHorizontalAlignment(JTextField.LEADING);
        //keys
        keys.setBounds(340,390,112,150);
        keys.setFont(new Font("Mv Boil", Font.PLAIN, 27));
        keys.setOpaque(false);
        keys.setText(ultimate4);
    }

    private void setBackIns(){
        backIns = new JButton("Back");
        backIns.setFont(new Font("Mv Boil", Font.BOLD, 22));
        backIns.setFocusable(false);
        backIns.setBorderPainted(false);
        backIns.setForeground(Color.black);
        backIns.setBackground(Color.white);
        backIns.setBounds(90,570, 130, 40);
        backIns.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backIns){
            this.dispose();
            MenuFrame f4 = new MenuFrame();
            f4.setVisible(true);
        }
    }
}
