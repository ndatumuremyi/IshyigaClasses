package main.brdLoan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Student;

import java.util.Calendar;

@Data //this generate setter and getter for us
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithLoan extends Student {
    private long moneyToPay;
    private Calendar dateOfLoanGiving;
    private long payedMoneySoFar;
    private boolean employed;
    private String accountNumber;

    public StudentWithLoan(Student student){
        super(student);
    }

    public void print(){
        System.out.print("studentWithLoan");
    }

}
