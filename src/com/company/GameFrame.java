package com.company;
import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        //this.setSize(897,690);


        this.add(new GamePanel());

        this.setTitle("Snake");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);

        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}
