package com.thiagomuller;

public class Wheel {
    private int size;
    private String type;
    private String colour;

    private Wheel(){}

    public static final class Builder{
        private int size;
        private String type;
        private String colour;
        private WheelListBuilder wheelListBuilder;

        public WheelListBuilder addWheelToList(){
            this.wheelListBuilder.addWheel(this.build());
            return this.wheelListBuilder;
        }

        public Builder(){

        }

        public Builder withSize(int size){
            this.size = size;
            return this;
        }

        public Builder withType(String type){
            this.type = type;
            return this;
        }

        public Builder withColour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder withWheelListBuilder(WheelListBuilder wheelListBuilder){
            this.wheelListBuilder = wheelListBuilder;
            return this;
        }

        public Wheel build(){
            Wheel wheel = new Wheel();
            wheel.size = this.size;
            wheel.type = this.type;
            wheel.colour = this.colour;
            return wheel;
        }
    }
    public static Builder newBuilder(){
        return new Builder();
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
