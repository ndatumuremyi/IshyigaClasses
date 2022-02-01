package main.attendance;

import lombok.Data;
import main.Student;

import java.util.ArrayList;

@Data //this generate setter and getter for us
public class Lecture {
    private String lecturerName;
    private String courseName;
    private ArrayList<Student> studentsInLecture;

}

