package ua.edu.ucu.apps.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Company {
    @Getter @Setter
    private String name;

    @Getter @Setter
    private String description;
    
    @Getter @Setter
    private String logo;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
