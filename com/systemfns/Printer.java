package com.systemfns;

import java.util.Scanner;

import com.players.*;

public class Printer{

    public void printTable(String[] options, String tableName){
        int number = 1;
        System.out.println(tableName + ":");
        for(String option : options){
            System.out.println(number + ". " + option);
            number++;
        }
    }

    public String printGetInput(String input){
        System.out.println(input);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public void welcome(Player player){
        System.out.println("Welcome " + player.name() + "." );
    }

}
