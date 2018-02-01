package com.units;

import java.util.Random;

public class Units {

    private String name;
    private int str;

    public Units(){
        int rnd = new Random().nextInt(100)+1;
        if(rnd <= 45){
            this.name = "Soldier";
        }else if(rnd >= 90){
            this.name = "Knight";
        }else{
            this.name = "Peasant";
        }
        switch(name){
            case "Soldier":
                this.str = 10;
                break;
            case "Knight":
                this.str = 15;
                break;
            case "Peasant":
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