package com.cx.game.map;


import com.cx.Logic.Engine;

import java.util.Random;

public class MapGenerator {
    private Engine engine;
    public int seed;
    int fa_randomizer;

    public MapGenerator(Engine engine) {
        this.engine = engine;
    }
    public void update(){
        Random random = new Random();
        int fa_min_width = 8;
        int fa_max_width = 3200;

        fa_randomizer = random.nextInt(fa_max_width - fa_min_width / seed);
    }
    public void Generate_Map(int seed) {
        this.seed = seed;



        Ground ground = new Ground(0,740,3800,280);

        Fa fa = new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);
        new Fa(fa_randomizer,580,280,280);

        engine.getGameObject().add(ground);
        engine.getGameObject().add(fa);
    }

    public void Generate_Biom() {

    }
}
