package ua.edu.ucu.apps.task2;

import lombok.Getter;

public class ReportBuilder {
    @Getter
    private DataBase db;
    
    public ReportBuilder(DataBase db) {
        this.db = db;
    }
}
