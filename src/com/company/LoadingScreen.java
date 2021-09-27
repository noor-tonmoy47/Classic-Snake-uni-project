package com.company;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JPanel {

    Image img1;
    LoadingScreen(){
        //this.setPreferredSize(new Dimension(897,690));
        img1 = new ImageIcon("messiah.png").getImage();
        this.setBounds(0,0,897,690);
//        this.setBackground(Color.black);
//        this.setOpaque(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawImage(img1, 0, 0,null);
    }
}
