package ru.homework.java.core;

import okhttp3.*;
import java.io.*;

public class Lesson6Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212") // City ID
                .addQueryParameter("apikey", "7TYZKFpRe0qTpoPZyeKNvJt5V1hmsedd")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        String body = response.body().string();
        System.out.print(body.replaceAll(",", "\n").replaceAll("[{}]", "").replace("\"", "")); // prints (and formats) the response string to console
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Weather forecast.json", false));
                writer.write(body); // prints out the received response into a separate file
                writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
