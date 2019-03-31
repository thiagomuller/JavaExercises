package com.thiagomuller;

public class Drop {
    private GunnerDroid gunnerDroid;
    private boolean empty = true;


    public synchronized void take(){
        while(empty){
            try{
                wait();
            } catch(InterruptedException e){}
        }

        System.out.println("The gunner droid in the drop is called: " + this.gunnerDroid.getName() + ", and its gun is: " + this.gunnerDroid.getWeaponName());
        this.empty = true;
        this.gunnerDroid = null;
        notifyAll();
    }

    public synchronized void put(){
        while(!empty){
            try{
                wait();
            } catch(InterruptedException e){}
        }

        this.empty = false;
        this.gunnerDroid = new GunnerDroid("Glados" , "MK-16");
        notifyAll();

    }
}
