package com.thiagomuller;

public class Engine {
    private int power;
    private String type;

    private Engine() {}

    public static final class Builder{
        private int power;
        private String type;


        public Builder withPower(int power){
            this.power = power;
            System.out.println(this);
            return this;
        }

        public Builder withType(String type){
            this.type = type;
            System.out.println(this);
            return this;
        }

        public Engine build(){
            Engine engine = new Engine();
            engine.power = this.power;
            engine.type = this.type;
            return engine;
        }
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }
}
