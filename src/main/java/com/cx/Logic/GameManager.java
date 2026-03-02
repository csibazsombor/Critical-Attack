package com.cx.Logic;

public class GameManager {

    private boolean started = false;
    private int playerCount;
    private int round;
    private int yourBase;
    private int enemyBase;

    public GameManager(int playerCount, int round, int yourBase, int enemyBase){
        this.playerCount = playerCount;
        this.round = round;
        this.yourBase = yourBase;
        this.enemyBase = enemyBase;
    }

    public void startGame(){
        started = true;
    }

    public boolean isStarted(){
        return started;
    }
}