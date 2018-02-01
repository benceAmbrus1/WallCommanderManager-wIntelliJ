package com.systemfns;

import com.units.Units;

public class UnitsWrapper {

    private Units[] units;

    public UnitsWrapper(Units[] units) {
        this.units = units;
    }

    public Units[] getUnits() {
        return units;
    }

    public Units access(int index) {
        return getUnits()[index];
    }

    public int search(Units unit) {
        for (int i = 0; i < getUnits().length; i++) {
            if (unit == getUnits()[i]) {
                return i;
            }
        }
        return -1;
    }

    public void insert(int index, Units unit) {
        Units[] tempArray = new Units[getUnits().length + 1];
        Units[] array2 = getUnits();
        for(int i = 0; i < tempArray.length; i++){
            if(i < index){
                tempArray[i] = array2[i];
            }
            else if(i == index){
                tempArray[i] = unit;
            }
            else {
                tempArray[i] = array2[i-1];
            }
        }
        units = tempArray;
    }

    public void delete(int index) {
        Units[] tempArray = new Units[getUnits().length - 1];
        for (int i = 0; i < tempArray.length; i++) {
            if (i < index) {
                tempArray[i] = getUnits()[i];
            }
            if (i >= index) {
                tempArray[i]= getUnits()[i+1];
            }
        }
        units = tempArray;
    }
}