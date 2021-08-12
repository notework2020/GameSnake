package ru.nrv;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image applet;
    private int appleX;
    private int appleY;
    private int [] x = new int[ALL_DOTS];
    private int [] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;




    public GameField(){
        setBackground(Color.BLACK);
    }

    public void loadImages(){
        ImageIcon iia = new ImageIcon("apple.png");
        applet = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        applet = iid.getImage();

    }
}
