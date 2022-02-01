package main.attendance;

import lombok.Builder;
import lombok.Data;
import main.R;
import main.Student;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;

public class AttendanceManagement {

    public void ShowAttendance(Student student){
        System.out.println(student.getAttendanceGotten() + " out of " + CalenderForStudents.numberOfLecturesPasses);
    }
    public void studentWithLessHalfAttendance(){
        R.students.forEach(student -> {
            if(student.getAttendanceGotten() < CalenderForStudents.totalNumberOfLecturesToAttend/2){
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            }});}
    public void printAll(){
        R.students.forEach(student -> {
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            });}

    public static void main(String args[]){
        AttendanceManagement attendanceManagement =  new AttendanceManagement();
        if(R.students.size() == 0){
            R.generateRandomStudents();
        }
        attendanceManagement.studentWithLessHalfAttendance();



    }
}
