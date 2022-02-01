package main;

import main.attendance.CalenderForStudents;

import java.util.ArrayList;
import java.util.Random;

public class R {
    private static int numberOfStudent = 0;
    public static Random r = new Random();
    public static ArrayList<Student> students = new ArrayList<>();
    public static String  getRandomNid(){
        return "1 " +(1980+r.nextInt(30))+" "+ (r.nextBoolean()?"8 ":"7 ")+String.format("%07d",r.nextInt(9999999))+ " "+ r.nextInt(9)+" "+String.format("%02d", r.nextInt(99));
    }

    public static int getNumberOfStudent() {
        if(numberOfStudent == 0){
            numberOfStudent = 30 + R.r.nextInt(20);
        }
        return numberOfStudent;
    }
    public static void generateRandomStudents(){
        int numberOfStudent = R.getNumberOfStudent();
        Student student;
        while (numberOfStudent-- !=0){
            student = new Student();
            student.setNId(R.getRandomNid());
            student.setAttendanceGotten(R.r.nextInt(CalenderForStudents.totalNumberOfLecturesToAttend));
            R.students.add(student);
        }
    }
}
