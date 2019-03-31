package com.thiagomuller;


import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheelList;

    private Car(){}

    public static final class Builder{
        private Engine engine;
        private List<Wheel> wheelList;

        public Builder withEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public Builder withWheelList(List<Wheel> wheelList){
            this.wheelList = wheelList;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.engine = this.engine;
            car.wheelList = this.wheelList;
            return car;
        }
    }
    public Builder newBuilder(){
        return new Builder();
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheelList() {
        return wheelList;
    }
}
