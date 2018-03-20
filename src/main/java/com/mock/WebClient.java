package com.mock;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {
//    public String getContent(URL url) { //02
    public String getContent(ConnectionFactroy connection){
        StringBuffer content = new StringBuffer();

        try {
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();//00
//            HttpURLConnection connection = createHttpURLConnection(url); //01
//            InputStream inputStream = connection.getInputStream();//02
            InputStream inputStream = connection.getData();
            int count;
            while (-1 !=(count = inputStream.read())){
                content.append(new String(Character.toChars(count)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    //01
    protected HttpURLConnection createHttpURLConnection(URL url) throws IOException{
        return (HttpURLConnection) url.openConnection();
    }

}
