package main.brdLoan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.Student;

import java.util.Date;

@Data //this generate setter and getter for us
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithLoan extends Student {
    private long moneyToPay;
    private Date dateOfLoanGiving;
    private long payedMoneySoFar;
    private boolean doesHaveJob;
    private String accountNumber;

    public StudentWithLoan(Student student){
        super(student);
    }

    public void print(){
        System.out.print("studentWithLoan");
    }

}
