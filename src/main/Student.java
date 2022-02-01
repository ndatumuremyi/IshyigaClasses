package main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //this generate setter and getter for us
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends Citizen{
    @Builder.Default private String universityName="UR";
    @Builder.Default private String collageName="CST";
    @Builder.Default private String schoolName="ICT";
    @Builder.Default private String departmentName="CSE";
    @Builder.Default private int yearsToStudy = 3;
    @Builder.Default private int attendanceGotten = 0;

    public Student(Student s){
        this.attendanceGotten = s.attendanceGotten; this.collageName = s.collageName; this.departmentName = s.departmentName;
        this.yearsToStudy = s.yearsToStudy; this.schoolName = s.schoolName; this.universityName = s.universityName;
    }
    public void attendee(){ attendanceGotten++; }
}
