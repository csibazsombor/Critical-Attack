package com.cx.game;

import com.cx.Logic.GameObject;
import com.cx.Logic.ImageLoader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Rectangle;
import static com.cx.Logic.ImageLoader.loadImage;

public class Player extends GameObject {

    private ImageLoader imageloader;
    public int size = 93;
    private int speed = 4;

    // Physics
    private double velocityY = 0;
    private double gravity = 0.2;
    private boolean onGround = false;
    public boolean facingRight = true;
    private BufferedImage player_texture;
    private BufferedImage player_hand;
    public boolean inHand;
    private int handX;
    private int handY;

    private boolean up, down, left, right;

    public Player(int x, int y, boolean inHand, String item) {
        super(x, y);
        this.inHand = inHand;
        try {
            player_texture = loadImage("karakter.png");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // Controls
    public void setUp(boolean value) { up = value; }
    public void setDown(boolean value) { down = value; }
    public void setLeft(boolean value) { left = value; }
    public void setRight(boolean value) { right = value; }

    public void update() {

        // Apply Gravity
        velocityY += gravity;

        // Apply vertical movement
        y += velocityY;

        if(y >= 650){
            y = 650;
            velocityY = 0;
            onGround = true;
        } else {
            onGround = false;
        }

        if (left) {
            facingRight = false;
            x -= speed;
        }
        if (right) {
            facingRight = true;
            x += speed;
        }

        if (up) y -= speed;
        if (down) y += speed;

        if (inHand) {
            player_hand = loadImage("kard-noshadow.png");
        }
    }

    @Override
    public void draw(Graphics g) {

        if(facingRight) {
            if (inHand) {
                g.drawImage(player_hand,x+74,y+28, size-15,size-15, null);
            }
            g.drawImage(player_texture, x,y,size,size,null);
        } else {
            g.drawImage(player_texture, x + size, y,-size, size, null);
            if (inHand) {
                g.drawImage(player_hand,x-74 + size,y+28, -size,size-15, null);
            }

        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }
}
