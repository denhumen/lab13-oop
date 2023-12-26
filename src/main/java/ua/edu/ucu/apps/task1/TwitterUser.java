package ua.edu.ucu.apps.task1;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
class TwitterUser{
    @Getter @Setter
    private String UserMail;

    @Getter @Setter
    private String Country;

    @Getter @Setter
    private LocalDate LastActiveTime;
}