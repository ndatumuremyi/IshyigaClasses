package main;

import lombok.Data;

import java.util.Date;

@Data //this generate setter and getter for us
public class Student extends Citizen{
    private String universityName;
    private String collageName;
    private String schoolName;
    private String departmentName;
    private Date dateOfStartingToStudy;
    private int yearsToStudy;
    private int attendanceGotten;



    public void print(){
        System.out.print("student");
    }
}
