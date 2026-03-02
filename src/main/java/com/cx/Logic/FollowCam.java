package com.cx.Logic;

import com.cx.game.Player;

public class FollowCam {

    public int x;
    public int y;

    public void follow(Player player, int screenWidth, int screenHeight) {
        x = player.getX() - screenWidth / 2;
        y = player.getY() - screenHeight / 2;
    }
}
