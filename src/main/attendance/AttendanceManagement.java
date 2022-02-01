package main.attendance;

import lombok.Builder;
import lombok.Data;
import main.R;
import main.Student;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceManagement {

    public void ShowAttendance(Student student){
        System.out.println(student.getAttendanceGotten() + " out of " + CalenderForStudents.numberOfLecturesPasses);
    }
    public void studentWithLessHalfAttendance(){
        System.out.println("\n " + "Student attendance less than half " +"\n" + "--------------------------------------");
        R.students.forEach(student -> {
            if(student.getAttendanceGotten() < CalenderForStudents.totalNumberOfLecturesToAttend/2){
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            }});
        System.out.println("--------------------------------------------------------------");
    }
    public void printAll(){
        R.students.forEach(student -> {
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            });}

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("" +
                    "1. VIEW STUDENTS ATTENDANCE LESS THAN HALF: \n" +
                    "2. VIEW VIEW STUDENT \n" +
                    "0. EXIT BRD");
            System.out.print("YOUR CHOICE: ");

            AttendanceManagement attendanceManagement =  new AttendanceManagement();
            if(R.students.size() == 0){
                R.generateRandomStudents();
            }
            switch (input.nextInt()){
                case 1:{attendanceManagement.studentWithLessHalfAttendance(); break;}
                case 2:{attendanceManagement.printAll(); break;}
                case 0:{return;}
                default:{System.out.println("WRONG CHOICE ");}
            }
        }

    }
}
