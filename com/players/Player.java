package com.players;

import com.items.*;

public class Player {

    private String name;
    private Inventory inventory;


    public Player(String name, Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    //Getters
    public String name() {
        return name;
    }

    public Inventory inventory() {
        return inventory;
    }
}
