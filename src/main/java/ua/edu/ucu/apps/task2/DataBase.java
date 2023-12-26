package ua.edu.ucu.apps.task2;

public class DataBase extends БазаДаних{
    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStaticData(){
        return отриматиСтатистичніДані();
    }
}
