package com.thiagomuller;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlecrimTea {
    private Lock lock = new ReentrantLock();
    private Condition isEmpty = lock.newCondition();
    private Condition isFull = lock.newCondition();
    private boolean empty;

    public AlecrimTea(boolean empty) {
        this.empty = empty;
    }

    public void makeTea(){
        lock.lock();
        while(!this.empty){
            try{
                isEmpty.await();
            } catch(InterruptedException e){}
        }

        System.out.println("Made alecrim tea!");
        this.empty = false;
        isFull.signalAll();
        lock.unlock();
    }

    public void drinkTea(){
        lock.lock();
        while(this.empty){
            try{
                isFull.await();
            } catch(InterruptedException e){}
        }

        System.out.println("Just drank the alecrim tea!");
        this.empty = true;
        isEmpty.signalAll();
        lock.unlock();
    }
}

