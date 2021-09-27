package com.company;
import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        //this.setSize(897,690);


        this.add(new GamePanel());

        //this.setTitle("Snake");
        ImageIcon icon = new ImageIcon("snake Icon-3.png");
        this.setIconImage(icon.getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}
