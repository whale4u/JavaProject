package com.whale4u;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HttpUtil {

    public String getHtml(String u) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(u);
        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpGet);
            InputStream in = response.getEntity().getContent();
            InputStreamReader reader = new InputStreamReader(in, "utf-8");
            BufferedReader breader = new BufferedReader(reader);

            StringBuffer sb = new StringBuffer();
            String json = null;
            while ((json = breader.readLine()) != null) {
                sb.append(json);
            }
            breader.close();
            reader.close();
            in.close();

            String html = sb.toString();

            response.close();
            httpClient.close();
            return html;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

}
