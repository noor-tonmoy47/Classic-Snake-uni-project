package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MenuScreen extends JPanel {
    Image img2;
    MenuScreen(){
        //File imgFile = new File("image2.png");
        img2 = new ImageIcon("image2.png").getImage();
        //img2 = new ImageIcon(imgFile.toURI().toString()).getImage();
        this.setBounds(0,0,897,690);
    }

    @Override
    public void paint(Graphics g) {
        //
        g.drawImage(img2, 0,0, null);
    }
}
