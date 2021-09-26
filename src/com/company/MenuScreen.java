package com.company;

import javax.swing.*;
import java.awt.*;

public class MenuScreen extends JPanel {
    Image img2;
    MenuScreen(){
        img2 = new ImageIcon("C:/Users/shams/Desktop/Classic-Snake-uni-project/res/image2.png").getImage();
        this.setBounds(0,0,897,690);
    }

    @Override
    public void paint(Graphics g) {
        //
        g.drawImage(img2, 0,0, null);
    }
}
