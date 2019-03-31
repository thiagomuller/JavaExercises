import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String jsonInput = "{\"key\": \"value\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<HashMap<String, String>> typeRef
                = new TypeReference<HashMap<String, String>>() {};
        try{
            Map<String, String> map = objectMapper.readValue(jsonInput, typeRef);
            System.out.println(map.get("key"));
        } catch(IOException e) {
            System.out.println("IO exception");
        }



    }
}
