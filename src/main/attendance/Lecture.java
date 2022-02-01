package main.attendance;
import lombok.Builder;  import lombok.Data;  import main.Student; import java.util.ArrayList;

@Data //this generate setter and getter for us
public class Lecture {
    @Builder.Default private String lecturerName = "Diodonne";
    @Builder.Default private String courseName = "Java";
    @Builder.Default private ArrayList<Student> studentsInLecture = new ArrayList<>();

    Lecture(){ CalenderForStudents.numberOfLecturesPasses++; }

    public void AddStudentInLecture(Student student){
        student.attendee();
        if(studentsInLecture != null){studentsInLecture.add(student);
        }}
}