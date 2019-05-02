package com.thiagomuller;

public class TecsinapseSender {
    public void sendResultToTecsinapse(String urlString, ConsolidatedOrder consolidatedOrder){
        HttpHandler httpHandler = new HttpHandler();
        httpHandler.sendPostRequest(urlString, consolidatedOrder.toString());
    }
}
