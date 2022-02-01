package main.brdLoan;

import lombok.Data;
import main.Student;

import java.util.Date;

@Data //this generate setter and getter for us
public class StudentWithLoan extends Student {
    private long moneyToPay;
    private Date dateOfLoanGiving;
    private long payedMoneySoFar;
    private boolean doesHaveJob;
    private String accountNumber;


    public void print(){
        System.out.print("studentWithLoan");
    }

}
