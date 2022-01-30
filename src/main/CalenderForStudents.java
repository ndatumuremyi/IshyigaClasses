package main;

import lombok.Data;

import java.util.Date;

@Data
public class CalenderForStudents {
    private static int totalNumberOfLecturesToAttend;
    private static int numberOfLecturesPasses;
    private static Date startDate;
    private static Date endDate;

}
