package com.thiagomuller;


import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpHandler {

    public void sendPostRequest(String urlString, String result) {
        try {
            URL url = new URL(urlString);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/plain");

            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(result);
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

        } catch (MalformedURLException malformedUrl) {
            System.out.println("Invalid or malformed URL, please review");
            malformedUrl.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
