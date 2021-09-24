package com.company;

import javax.swing.*;
import java.awt.*;

public class LoadingFrame extends JFrame {
    private JProgressBar Pb;
    LoadingFrame(){
        LoadingScreen ls = new LoadingScreen();

        this.setSize(897,690);
        this.setLayout(null);

        setPb();
        this.add(Pb);
        this.add(ls);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        fillPb();
    }

    private void setPb() {
        this.Pb = new JProgressBar();
        this.Pb.setValue(0);
        this.Pb.setBorderPainted(false);
        this.Pb.setBounds(250,580, 390,40);
        //this.Pb.setBounds(250,580, 390,40);   // Original One
        //this.Pb.setForeground(new Color(182, 221, 160));
        //this.Pb.setForeground(new Color(234, 153, 62));
        this.Pb.setForeground(new Color(134, 199, 55));

        this.Pb.setBackground(new Color(220,250,230));
    }
    private void fillPb(){
        int cnt = 0;

        while (cnt <=100){
            this.Pb.setValue(cnt);
            try{
                Thread.sleep(80);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            cnt += 2;
        }
    }
}
