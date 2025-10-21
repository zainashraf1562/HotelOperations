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

    public boolean isAvailable(){
        return !isDirty && !isOccupied;
//        if (!isDirty && !isOccupied){
//            return true;
//        }else {
//            return false;
//        }
    }

    public void checkIn(){
        if(isAvailable()){
            this.isDirty = true;
            this.isOccupied = true;
        }
    }


    public void checkOut() {
        this.isOccupied = false;
        cleanRoom();
    }

    public void cleanRoom(){
        if (!isOccupied){
            isDirty = false;
        }
    }




}
