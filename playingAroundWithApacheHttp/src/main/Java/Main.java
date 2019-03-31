import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
       String url = "https://api.telegram.org/bot756842194:AAGJDmh5mtmjLyxqq4v3txEBvGww4Staogs/sendMessage";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);

        JSONObject json = new JSONObject();
        json.put("chat_id", -375887585);
        json.put("text", "I'm java nuuuuts, java is driving me crazy hell yeah");

        try{
            StringEntity entity = new StringEntity(json.toString());
            post.setEntity(entity);
            post.setHeader("Accept", "application/json");
            post.setHeader("Content-type", "application/json");

            CloseableHttpResponse response = client.execute(post);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            client.close();

        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }catch(IOException io){
            io.printStackTrace();
        }

        System.out.println(System.getenv("botToken"));

    }
}
