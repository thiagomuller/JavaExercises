package thiagomuller;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java" , "a compiled high level, object-oriented, platform independent language");
        languages.put("Python" , "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol" , "an algorithmic language");
        languages.put("BASIC" , "beginners all purposes symbolic instruction code");
        languages.put("Lisp" , "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java" , "This course is about java");
        }

        System.out.println("====================================================");

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
