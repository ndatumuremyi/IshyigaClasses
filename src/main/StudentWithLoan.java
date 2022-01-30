package main;

import lombok.Data;

import java.util.Date;

@Data
public class StudentWithLoan extends Student{
    private long moneyToPay;
    private Date dateOfLoanGiving;
    private long payedMoneySoFar;
    private boolean doesHaveJob;
    private String accountNumber;


    public void print(){
        System.out.print("studentWithLoan");
    }

}
