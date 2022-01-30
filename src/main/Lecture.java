package main;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Lecture {
    private String lecturerName;
    private String courseName;
    private ArrayList<Student> studentsInLecture;

}

