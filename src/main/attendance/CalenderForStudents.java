package main.attendance;

import lombok.Data;

import java.util.Date;

@Data //this generate setter and getter for us
public class CalenderForStudents {
    private static int totalNumberOfLecturesToAttend;
    private static int numberOfLecturesPasses;
    private static Date startDate;
    private static Date endDate;

}
