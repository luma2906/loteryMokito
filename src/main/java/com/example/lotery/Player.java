package com.example.lotery;

public class Player {
    private int number;
    private Loteria loteria;

    public Player(int number, Loteria loteria) {
        this.number = number;
        this.loteria = loteria;
    }

    public boolean play() {
        return loteria.random() == this.number ? true : false;
    }
}
