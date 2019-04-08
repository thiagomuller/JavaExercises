import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'll start running MIT news right now, don't stop me now!");
        String command = "python mit_news.py";
        try{
            Process mitCall = Runtime.getRuntime().exec(command);

            BufferedReader reader =
                    new BufferedReader((new InputStreamReader(mitCall.getInputStream())));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while((line = reader.readLine()) != null){
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }

            String result = builder.toString().trim();
            System.out.println(result);
            System.out.println(result.equals("null"));

            if(!result.equals("null")){
                Map<String, List<String>> myMap = new HashMap<String, List<String>>();
                ObjectMapper mapper = new ObjectMapper();
                myMap = mapper.readValue(result, new TypeReference<Map<String,List<String>>>(){});
                List<String> urls = myMap.get("urls");

                for(String url: urls){
                    if(!url.equals("null")){
                        String response = "Hi Scilonax, it seems MIT posted some news about Machine Learning, here it is:\n" + result;
                        System.out.println(url);
                    }
                }
            }


            System.out.println("I've finished with python");

        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
