package com;

import com.items.Inventory;
import com.systemfns.*;
import com.players.*;

public class Main{

    private static Boolean menuStop = false;
    private static Printer pr = new Printer();
    private static Player player;

    public static void main(String[] args){

        String[] options = {"New Game", "Load", "Save", "Exit"};

        System.out.println("Welcome Commander.");

        while(!menuStop){
            pr.printTable(options, "Main menu");
            mainMenuChoose(Integer.parseInt(pr.printGetInput("Press the number of one of the option: ")));
        }
    }

    public static Player player(){
        return player;
    }

    private static void mainMenuChoose(int number){
        switch(number){
            case 1:
                player = new Player(pr.printGetInput("Give me your name!"),new Inventory());
                pr.welcome(player);
                Wall wall = new Wall();
                wall.wallMenu();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("Exit");
                menuStop = true;
                break;
            default:
                System.out.println("Not invalid option.");
        }
    }
}
