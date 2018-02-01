package com.systemfns;

import com.items.*;
import com.units.*;
import com.*;

import static com.Main.player;


public class Round {

    private Enemy[] enemies;
    private Units[] units;
    private Reward[] rewards;
    private String[] options = {"Check enemies", "Check your soldiers", "Check Reward", "Fight", "Back"};
    private Boolean menuStop = false;

    private static int lostUnits;

    public Round(){
        enemies = new Enemy[Wall.roundCounter() + 2];
        for(int i = 0; i < Wall.roundCounter()+ 2; i++){
            enemies[i] = new Enemy();
        }
        units = new Units[Wall.roundCounter() + 2];
        for(int i = 0; i < Wall.roundCounter()+ 2; i++){
            units[i] = new Units();
        }
        rewards = new Reward[Wall.roundCounter()+2];
        for(int i = 0; i < Wall.roundCounter()+ 2; i++) {
            rewards[i] = new Reward();
        }
    }

    //Getters
    public Enemy[] enemies(){
        return enemies;
    }
    public Units[] units(){
        return units;
    }

    public void roundMenu(){
        Printer pr = new Printer();

        while(!menuStop){
            pr.printTable(options, "Round menu");
            roundMenuChoose(Integer.parseInt(pr.printGetInput("Press the number of one of the option: ")));
        }
    }

    public void roundMenuChoose (int number){
        switch(number){
            case 1:
                for(Enemy enemy:enemies){
                    System.out.print("|" + enemy.name()+ "|");
                }
                System.out.println("Full STR = " + checkEnemySTR(enemies));
                break;
            case 2:
                for(Units unit:units){
                    System.out.print("|" + unit.name()+ "|");
                }
                System.out.println("Full STR = " + checkUnitsSTR(units));
                break;
            case 3:
                for(Reward reward:rewards){
                    System.out.print("|" + reward.type()+ "|");
                }
                System.out.println("Full Values = " + checkRewardsValues(rewards));
                break;
            case 4:
                fight(enemies, units);
                System.out.println(player().inventory().getWood()+" "+player().inventory().getCoin()+" "+player().inventory().getMineral());
                break;
            case 5:
                menuStop = true;
                break;
            default:
                System.out.println("error");
        }
    }

    public int checkEnemySTR(Enemy[] enemies){
        int tempc = 0;
        for(Enemy enemy:enemies){
            tempc += enemy.str();
        }
        return tempc;
    }

    public int checkUnitsSTR(Units[] units){
        int tempc = 0;
        for(Units unit:units){
            tempc += unit.str();
        }
        return tempc;
    }

    public int checkRewardsValues(Reward[] rewards){
        int tempc = 0;
        for(Reward reward:rewards){
            tempc += reward.value();
        }
        return tempc;
    }

    public void fight(Enemy[] enemies, Units[] units){
        int unitSTR = checkUnitsSTR(units);
        int enemySTR = checkEnemySTR(enemies);
        if(unitSTR > enemySTR){
            player().inventory().addRewardsToInventory(rewards);
            // 10% to lost soilder
        }else{
            player().inventory().addRewardsToInventory(rewards);
        }
    }

}
