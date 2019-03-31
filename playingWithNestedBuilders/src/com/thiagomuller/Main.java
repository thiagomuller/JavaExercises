package com.thiagomuller;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine.Builder().withPower(78).withType("LTS").build();

//        Wheel wheel1 = new Wheel.Builder().withColour("Black").withSize(13).withType("Road").build();
//        Wheel wheel2 = new Wheel.Builder().withColour("Black").withSize(13).withType("Road").build();
//        Wheel wheel3 = new Wheel.Builder().withColour("Black").withSize(13).withType("Road").build();
//        Wheel wheel4 = new Wheel.Builder().withColour("Black").withSize(13).withType("Road").build();
//
//        try{
//            List<Wheel> wheelList = WheelListBuilder.newBuilder()
//                    .withNewList()
//                    .addWheel(wheel1)
//                    .addWheel(wheel2)
//                    .addWheel(wheel3)
//                    .addWheel(wheel4)
//                    .build();
//
//            Car car = new Car.Builder().withEngine(engine).withWheelList(wheelList).build();
//
//            System.out.println("Engine data: " + car.getEngine().getType() + " and " + car.getEngine().getPower());
//            System.out.println("Wheels data: \n");
//            wheelList.forEach(wheel ->{
//                System.out.printf(wheel.getType() + " , " + wheel.getColour() + " , " + wheel.getSize() + "\n");
//            });
//        } catch(WheelException e){
//            System.out.println(e.toString());
//        }



    }
}
