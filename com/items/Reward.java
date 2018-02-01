package com.items;

import java.util.Random;

public class Reward {

    public enum Type {WOOD, MINERAL, COIN}

    public Type type;
    private int value;

    public Reward(){
        int rndType = new Random().nextInt(100)+1;
        if(rndType <= 40){
            type = Type.WOOD;
            value = new Random().nextInt(3)+1;
        }else if(rndType >= 60){
            type = Type.MINERAL;
            value = new Random().nextInt(3)+1;
        }else{
            type = Type.COIN;
            value = new Random().nextInt(3)+1;
        }
    }

    //Getters
    public int value(){
        return value;
    }
    public Type type(){
        return type;
    }
}
