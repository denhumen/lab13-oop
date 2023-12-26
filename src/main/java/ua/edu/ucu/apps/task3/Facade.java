package ua.edu.ucu.apps.task3;

import java.io.IOException;

import lombok.Getter;

public class Facade {

    @Getter
    private PDLReader pdlReader;

    public Facade(String apiKey) {
        pdlReader = new PDLReader(apiKey);
    }

    public Company getAllInfo(String website) throws IOException {
        return pdlReader.getCompanyInfo(website);
    }
}
