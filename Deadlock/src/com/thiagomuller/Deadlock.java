package com.thiagomuller;

public class Deadlock implements Runnable {
    private Friend friend;
    private int thread;

    public static class Friend{
        private String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void bow(Friend friend){
            System.out.println("My friend " + friend.getName() + " has just bowed to me");
        }

        public synchronized  void bowBack(Friend friend){
            System.out.println("I'm just bowing back to " + friend.getName());
        }
    }

    @Override
    public void run() {
        Friend thiago = new Friend("Thiago");
        Friend rodrigo = new Friend("Rodrigo");
        if(this.thread == 0){
            thiago.bow(rodrigo);
            rodrigo.bowBack(thiago);
        } else{
            rodrigo.bow(thiago);
            thiago.bowBack(rodrigo);
        }

    }
}
