package com.cx.Logic;

import com.cx.game.Player;
import com.cx.game.map.Fa;
import com.cx.game.map.Ground;
import com.cx.game.map.MapGenerator;
import com.cx.gui.Canvas;

import static com.cx.Logic.ImageLoader.loadImage;

public class GameLogic {

    private Engine engine;

    public GameLogic(Engine engine) {
        this.engine = engine;
    }

    public void startGame(Canvas canvas) {

        int spawnX = engine.getWidth() / 5;
        int spawnY = engine.getHeight() / 1;

        Player player = new Player(spawnX, spawnY, false, null);

        engine.setPlayer(player);   // ⭐ VERY IMPORTANT
        engine.getGameObject().add(player);
        MapGenerator mapGenerator = new MapGenerator(engine);
        mapGenerator.Generate_Map(2);

        ItemManager kard = new ItemManager("kard", 1300, 683, loadImage("kard.png"));

        engine.addItem(kard);
        engine.getGameObject().add(kard);



        canvas.repaint();
    }
}
