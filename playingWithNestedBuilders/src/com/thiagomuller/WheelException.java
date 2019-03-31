package com.thiagomuller;

public class WheelException extends Exception {
    int id;

    public WheelException(int x){
        this.id = x;
    }

    public String toString(){
        return "WheelException: Number of wheels must be equal to 4, current number is: " + this.id;
    }
}
