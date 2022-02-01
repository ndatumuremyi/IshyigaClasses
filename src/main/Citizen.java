package main;

import lombok.Data;

import java.util.Date;

@Data //this generate setter and getter for us
public class Citizen {
    private String nId;
    private Date dateOfBirth;
    private char sex;
    private String names;
}
