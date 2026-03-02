package com.cx.game.map;

import com.cx.Logic.GameObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Fa extends GameObject {
    private int x,y;
    private int width, height;
    private BufferedImage texture;

    public Fa(int x, int y, int width, int height) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height= height;

        try {
            texture = ImageIO.read(getClass().getResource("/fa.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics g) {
        g.drawImage(texture, x,y,width,height, null);
    }

    @Override
    public void update() {

    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,width,height);
    }
}
