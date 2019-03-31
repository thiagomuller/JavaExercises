package com.thiagomuller;

import java.util.ArrayList;
import java.util.List;

public class WheelListBuilder {
    public static WheelListBuilder newBuilder(){
        return new WheelListBuilder();
    }

    private WheelListBuilder(){}

    private List<Wheel> wheelList;

    public WheelListBuilder withNewList(){
        this.wheelList = new ArrayList<>();
        return this;
    }

    public WheelListBuilder withList(List wheelList){
        this.wheelList = wheelList;
        return this;
    }

    public Wheel.Builder addWheel(){
        Wheel.Builder builder = Wheel.newBuilder();
        builder.withWheelListBuilder(this);
        return builder;
    }

    public WheelListBuilder addWheel(Wheel wheel){
        this.wheelList.add(wheel);
        return this;
    }

    public List<Wheel> build() throws WheelException{
        if(this.wheelList.size() < 4 || this.wheelList.size() > 4){
            throw new WheelException(this.wheelList.size());
        }
        else{
            return this.wheelList;
        }
    }
}
