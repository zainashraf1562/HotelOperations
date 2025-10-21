package com.pluralsight;

public class Room {
    private int numberOfBed;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBed, double price) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBed(){
        return numberOfBed;
    }

    public double getPrice(){
        return price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable(boolean isDirty, boolean isOccupied){
        return !isDirty && !isOccupied;
//        if (!isDirty && !isOccupied){
//            return true;
//        }else {
//            return false;
//        }
    }
}
