package ua.edu.ucu.apps.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    private String API_KEY;

    public PDLReader(String apiKey) {
        this.API_KEY = apiKey;
    }

    public Company getCompanyInfo(String website) throws IOException {
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + website);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);

        String name = jsonObject.optString("name");
        String description = jsonObject.optString("description");
        String logo = jsonObject.optString("logo");

        return new Company(name, description, logo);
    }
}
