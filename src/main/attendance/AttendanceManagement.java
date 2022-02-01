package main.attendance;

import lombok.Builder;
import lombok.Data;
import main.R;
import main.Student;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList; import java.util.Random;

public class AttendanceManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void ShowAttendance(Student student){
        System.out.println(student.getAttendanceGotten() + " out of " + CalenderForStudents.numberOfLecturesPasses);
    }
    public void studentWithLessHalfAttendance(){
        students.forEach(student -> {
            if(student.getAttendanceGotten() < CalenderForStudents.totalNumberOfLecturesToAttend/2){
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            }});}
    public void printAll(){
        students.forEach(student -> {
                System.out.println("student with ID = '" +student.getNId() + "' got " + student.getAttendanceGotten() );
            });}

    public static void main(String args[]){
        Random rdm = new Random();
        AttendanceManagement attendanceManagement =  new AttendanceManagement();
        int numberOfStudent = 30 + rdm.nextInt(20);
        Student student;
        while (numberOfStudent-- !=0){
            student = new Student();
            student.setNId(R.getRandomNid());
            student.setAttendanceGotten(rdm.nextInt(CalenderForStudents.totalNumberOfLecturesToAttend));
            attendanceManagement.students.add(student);
            attendanceManagement.studentWithLessHalfAttendance();
        }


    }
}
