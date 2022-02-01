package main.brdLoan;
import main.R;
import main.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class BrdLoanManagement{
    private ArrayList<StudentWithLoan> studentsWithLoan = new ArrayList<>();
    private ArrayList<Student> studentsRequestLoan;
    private long budgetSum;

    public void getStudentsWithLoanExceedThisYears(int year){}
    public void viewStudentWhoHaveJob(){
        studentsWithLoan.forEach(student ->{
            if(student.isEmployed()){
                System.out.println("ID :\"" + student.getNId() + "\"");
            }
        });
    }

    public static void main(String args[]){
        BrdLoanManagement brd = new BrdLoanManagement();
        StudentWithLoan studentWithLoan;
        if(R.students.size()==0){
            R.generateRandomStudents();
        }
        for(int i = 0; i < 10+R.r.nextInt(R.students.size() - 10); i++){
            studentWithLoan = new StudentWithLoan(R.students.get(i));
            studentWithLoan.setEmployed(R.r.nextBoolean());
            int moneyToPay = 1000000 + R.r.nextInt(15000000);
            studentWithLoan.setMoneyToPay(moneyToPay);
            studentWithLoan.setPayedMoneySoFar(R.r.nextInt(moneyToPay));
            studentWithLoan.setDateOfLoanGiving(new Date(2000+R.r.nextInt(22),1,1));
        }

        brd.viewStudentWhoHaveJob();
    }
}
