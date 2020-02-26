package com.ciogknit.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLCon {

    public static void main(String[] args) throws Exception {

        // Sending get request
        URL url = new URL("https://lafargeholcim.skillport.eu");
        System.out.println("PORT="+url.getPort());
        System.out.println("protocol="+url.getProtocol());
        System.out.println("Host="+url.getHost());
        System.out.println("uri="+url.toURI());
        System.out.println("authority="+url.getAuthority());
        System.out.println("Content ="+url.getContent());
        System.out.println("File="+url.getFile());
        System.out.println("getDefautPort="+url.getDefaultPort());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("Authorization","Bearer "+" eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXJ2aWNlX2FjY291bnRfaWQiOiIxY2U0YjFiYy1mZTcxLTQyZjktODAxZi1mNjQyODcxZDBhZmIiLCJvcmdhbml6YXRpb25faWQiOiJmY2RjZDc2NC01YTBmLTQ4NzctYjVhNC1mM2E3MTQ3ZjgwODAiLCJpc3MiOiJhcGkucGVyY2lwaW8uY29tIiwiaWF0IjoxNTQ5MDI5MDk2LCJzdWIiOiJkMzBhZTg0ZjQ4ZTE1MjdlNmNiYzI2M2VlYjdlMmZlZjEzYTM5ZTk3IiwicG9saWN5LWlkIjoicGVyY2lwaW8tYXBpLXN0YW5kYXJkLXBvbGljeSJ9.XxKbfm6TGKWY5FJy40n6ZYaUdNlBwOsYZ4CObDk4AqA809WwIiTcwq0LBxx6NKoOst5laa-Z2UP80F8wEe310KzvL44Dp1GzN2ndXGjzFpy1T2-rHuUkRbl52RDH2IzQkeVhZkeloAbrR3XkWK-9kjUrapSKMZFlA0xLRNtg2iSi0ZH0iEmCvSUEpQtFnvcYuA_1aBucxkSvKlK3hylOLFp4AGh736bGxqNe9kzcUxweV6D_gsobktCiYIQJtARSvuvimOXQwSyWfJA4AyJ_SO7vLEmL7buSZHMpmrTPK9SP1zDeYGRC6TsbPYV4QEtQzjKd5ydTJkqH2gdX27vegCQDJGa9tECrkkirHQn7NT5GZ8l58XLF7t0CECpRm-Hwifg9sebET0Mx5kBS6Oi3kixEBxpwO-c417sBy2o_dgRwTEUvATba9sQ-VV1Sj8IR-z-9D7m2LYvVTutdVS3mdu0SV2clZCk9ryL16A8RDCcFNmizTxnspZIeyZEaKdt6zcHIuzWEXsoLmCkNpNlrIQNXFa3bb9uK4WnfRWLre5u7a0uRnJQFpxtkREk_KrtnkOth-pZbD4Go9DnkVZadNjHlK6x6Le9dArRpd2tYM06s6mEXP1acxVf5yd4EUNpzdEsazaNu1TcldFQGQ16mKHqbWz7EI8VtPq1_mnqNnxM"); 
        		
        //e.g. bearer token= eyJhbGciOiXXXzUxMiJ9.eyJzdWIiOiPyc2hhcm1hQHBsdW1zbGljZS5jb206OjE6OjkwIiwiZXhwIjoxNTM3MzQyNTIxLCJpYXQiOjE1MzY3Mzc3MjF9.O33zP2l_0eDNfcqSQz29jUGJC-_THYsXllrmkFnk85dNRbAw66dyEKBP5dVcFUuNTA8zhA83kk3Y41_qZYx43T

        conn.setRequestProperty("Content-Type","application/xml");
        conn.setRequestMethod("GET");


        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String output;

        StringBuffer response = new StringBuffer();
        while ((output = in.readLine()) != null) {
            response.append(output);
        }

        in.close();
        // printing result from response
        System.out.println("Response:-" + response.toString());

    }

}
