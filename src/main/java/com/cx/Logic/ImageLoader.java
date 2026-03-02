package com.cx.Logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

    public static BufferedImage loadImage(String path) {
        try {
            var url = ImageLoader.class.getResource("/" + path);

            if (url == null) {
                System.out.println("Image not found: " + path);
                return null;
            }

            return ImageIO.read(url);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}