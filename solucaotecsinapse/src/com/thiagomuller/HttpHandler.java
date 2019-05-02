package com.thiagomuller;


import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpHandler {
    private String urlString;
    private Map<String,List<Double>> finalResult;

    public HttpHandler(String urlString, Map<String,List<Double>> finalResult) {
        this.urlString = urlString;
        this.finalResult = finalResult;
    }

    public void sendPostRequestToTecsinapse(){
        try{
            URL url = new URL(urlString);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type","text/plain");

            String bodyString = generateBodyString();

            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(bodyString);
            out.flush();
            out.close();

            int responseCode = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(responseCode);
            System.out.println(response.toString());
            con.disconnect();

        }catch(MalformedURLException malformedUrl){
            System.out.println("Invalid or malformed URL, please review");
            malformedUrl.printStackTrace();
        }catch(IOException io){
            io.printStackTrace();
        }
    }

    public String generateBodyString(){
        String bodyString = "";
        for(String key : finalResult.keySet()){
            bodyString = key + "#" + String.valueOf(finalResult.get(key).get(1));
        }
        return bodyString;
    }
}
