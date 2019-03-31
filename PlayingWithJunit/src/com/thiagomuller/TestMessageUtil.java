package com.thiagomuller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageUtil {
    private String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        this.message = "New World";
        assertEquals(message, messageUtil.printMessage());
    }
}
