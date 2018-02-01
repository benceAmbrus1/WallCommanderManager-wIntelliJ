package com.units;

import java.util.Random;

public class Enemy{

    private String name;
    private int str;

    public Enemy(){
        int rnd = new Random().nextInt(100)+1;
        if(rnd <= 45){
            this.name = "Wildlings";
        }else if(rnd >= 90){
            this.name = "White Walkers";
        }else{
            this.name = "Nocturnal animal";
        }
        switch(name){
            case "Wildlings":
                this.str = 10;
                break;
            case "White Walkers":
                this.str = 15;
                break;
            case "Nocturnal animal":
                this.str = 5;
                break;
        }
    }

    public String name(){
        return name;
    }

    public int str(){
        return str;
    }

}
