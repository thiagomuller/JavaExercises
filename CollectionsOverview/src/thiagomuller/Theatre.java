package thiagomuller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            if(o1.getPrice() < o2.getPrice()){
                return -1;
            } else if(o1.getPrice() > o2.getPrice()){
                return 1;
            } else{
                return 0;
            }
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1 );
        for(char row = 'A'; row <= lastRow; row ++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum ++){
                double price = 12.00;
                if(row < '0' && seatNum >= 4 && seatNum <= 9){
                    price = 14.00;
                } else if(row > 'F' || seatNum < 4 || seatNum > 9){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }


    public boolean reserveSeate(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber , 0);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There's no seat " + seatNumber);
//            return false;
//        }
        for(Seat seat : seats){
            System.out.print(".");
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat == null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }



        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat  " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
