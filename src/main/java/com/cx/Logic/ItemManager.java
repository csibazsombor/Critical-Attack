package com.cx.Logic;

import com.cx.game.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ItemManager extends GameObject {
    
    public String item;
    private int x, y;
    private int size = 75;
    private BufferedImage texture;
    private boolean pickedUp = false;

    public ItemManager(String item, int x, int y, BufferedImage texture) {
        super(x,y);
        this.item = item;
        this.x = x;
        this.y = y;
        this.texture = texture;
    }
    public void draw(Graphics g, Player player) {
        if (!pickedUp) {
            g.drawImage(texture, x,y, null);
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void pickUp() {
        pickedUp = true;
    }

    @Override
    public void draw(Graphics g) {
        if (!pickedUp) {
            g.drawImage(texture, x, y, size, size, null);
        }
    }

    @Override
    public void update() {

    }
}

