package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    private JButton returnMenu;
    private static final int screenWidth = 700;
    private static final int screenHeight = 600;
    private static final int unitSize = 25;
    private static final int DELAY = 75;
    private static final int numOfComp = (screenWidth * screenHeight) / unitSize;
    private int appleX, appleY,score;
    private int bodyParts = 6;
    private int []x = new int[numOfComp];
    private int []y = new int[numOfComp];
    boolean running = false;
    char direction = 'R';
    Random random;
    Timer timer;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        //this.setLayout(null);
        setReturnMenu();
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

        //this.setOpaque(true);
        startGame();

//        draw();

    }

    private void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        //g.setColor(Color.white);
        if(running) {
            /*
            for (int i = 1; i <= screenWidth / unitSize; i++) {
                g.drawLine(i * unitSize, 0, i * unitSize, screenHeight);
                g.drawLine(0, i * unitSize, screenWidth, i * unitSize);
            }
            
             */
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unitSize, unitSize);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], unitSize, unitSize);
                }
            }
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 35));
            FontMetrics metrics1 = getFontMetrics(g.getFont());
            g.drawString("Score: " + score, (screenWidth - metrics1.stringWidth("Score" + score))/2,35);
        }
        else{
            gameOver(g);
            this.add(returnMenu);
        }
    }
    public void newApple(){
        appleX = random.nextInt((screenWidth /unitSize)) * unitSize;
        appleY = random.nextInt((screenHeight /unitSize)) * unitSize;
    }

    public void move(){
        for (int i = bodyParts; i >0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch (direction) {
            case 'U':
                y[0] -= unitSize;
                break;
            case 'D':
                y[0] += unitSize;
                break;
            case 'L':
                x[0] -= unitSize;
                break;
            case 'R':
                x[0] += unitSize;
                break;
        }
    }
    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY)){
            bodyParts++;
            score++;
            newApple();
        }
    }




    public void checkCollision(){
        for (int i = bodyParts; i > 0; i--) {
            if((x[0] == x[i]) && (y[0] == y[i])){
                running = false;
                break;
            }
        }
        if(x[0] < 0 || x[0] > screenWidth || y[0] < 0 || y[0] > screenHeight){
            running = false;
        }

        if(!running){
            timer.stop();
        }
    }

    public void gameOver(Graphics g){
        //Shows the score
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 35));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + score, (screenWidth - metrics1.stringWidth("Score" + score))/2,85);
        //Game Over Text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over", (screenWidth - metrics.stringWidth("Game Over"))/2,screenHeight/2);
    }

    public void setReturnMenu(){
        returnMenu = new JButton("Return");
        returnMenu.setFont(new Font("Mv Boil", Font.BOLD, 22));
        returnMenu.setFocusable(false);
        returnMenu.setBorderPainted(false);
        returnMenu.setForeground(Color.black);
        returnMenu.setBackground(Color.white);
        returnMenu.setBounds(90,490, 130, 40);
        returnMenu.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == returnMenu){
            //this.setEnabled(false);
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
            MenuFrame f5 = new MenuFrame();
            f5.setVisible(true);
        }

        if(running){
            move();
            checkApple();
            checkCollision();
        }
        repaint();
    }
    class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_W:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_A:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_S:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_D:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
            }
        }
    }
}