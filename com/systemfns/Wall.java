package com.systemfns;

public class Wall{

    private String[] options = {"Next Round", "Wall menu2", "Wall menu3", "Back"};
    private Boolean menuStop = false;
    private static int roundCounter;
    private int wallHP;

    //constructor
    public Wall(){
        roundCounter = 1;
    }

    //getters
    public static int roundCounter(){
        return roundCounter;
    }
    public int wallHP(){
        return wallHP;
    }

    //Setters
    public static int setRoundCounter(int i){
        return roundCounter + i;
    }
    public int incWallHP(int n){
        return wallHP + n;
    }
    public int decWallHP(int n){
        return wallHP - n;
    }


    public void wallMenu(){
        Printer pr = new Printer();

        while(!menuStop){
            pr.printTable(options, "Wall menu");
            wallMenuChoose(Integer.parseInt(pr.printGetInput("Press the number of one of the option: ")));
        }
    }

    private void wallMenuChoose(int number){
        switch(number){
            case 1:
                Round round = new Round();
                round.roundMenu();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                menuStop = true;
                break;
            default:
                System.out.println("error");
        }
    }
}