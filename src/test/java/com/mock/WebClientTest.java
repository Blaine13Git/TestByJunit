package com.mock;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class WebClientTest {

    @Test
    public void testGetContentOK() throws Exception {
        MockHttpUrlConnection mockConnection = new MockHttpUrlConnection();
        mockConnection.setUpGetInputStream(new ByteArrayInputStream("It works".getBytes()));
        MockURL mockURL = new MockURL();
        mockURL.setUpOpenConnection(mockConnection);
        WebClient client = new WebClient();
//        String result = client.getContent(mockURL);
//        assertEquals("It works", result);
    }
}
