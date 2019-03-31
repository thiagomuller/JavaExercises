package com.thiagomuller;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> dset = new HashSet<>();
        Iterator<String> iterator = dset.iterator();



        locations.put(0, new Location(0, "You're sitting in fron of a computer learning java"));
        locations.put(1, new Location(1, "You're standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You're at the top of a hill"));
        locations.put(3, new Location(3, "You're inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You're in a valley beside a stream"));
        locations.put(5, new Location(5, "You're in the forest"));

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction!");
            }
        }
    }
}
