package com.items;

public class Inventory {

    private int wood;
    private int mineral;
    private int coin;

    public Inventory(){
        wood = 0;
        mineral = 0;
        coin = 0;
    }
    //Getters
    public int getCoin() {
        return coin;
    }
    public int getMineral() {
        return mineral;
    }
    public int getWood() {
        return wood;
    }

    //Setters
    public void setWood(int i){
        wood += i;
    }
    public void setMineral(int i){
        mineral += i;
    }
    public void setCoin(int i){
        coin += i;
    }

    public void addRewardsToInventory(Reward[] rewards){
        for(Reward reward:rewards){
            if(reward.type() == Reward.Type.WOOD){
                setWood(reward.value());
            }
            else if(reward.type() == Reward.Type.MINERAL){
                setMineral(reward.value());
            }else{
                setCoin(reward.value());
            }
        }
    }
}