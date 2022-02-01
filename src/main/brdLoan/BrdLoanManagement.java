package main.brdLoan;
import main.R; import main.Student; import java.util.*;

public class BrdLoanManagement{
    private ArrayList<StudentWithLoan> studentsWithLoan = new ArrayList<>();
    private ArrayList<Student> studentsRequestLoan;
    private long budgetSum;

    public void viewStudentsWithLoanBelowThisYear(int year){
        System.out.println("" + "Student with loan below "+ year +"\n" + "-----------------------------------");
        studentsWithLoan.forEach(studentWithLoan -> {
           if(studentWithLoan.getDateOfLoanGiving().get(Calendar.YEAR) < year){
               System.out.println("student with id \""+ studentWithLoan.getNId() +"\t year of loan " + studentWithLoan.getDateOfLoanGiving().get(Calendar.YEAR));
           }});
        System.out.println("\n \n \n----------------------------------------------------------------------");
    }
    public void viewStudentWhoHaveJob(){
        System.out.println("" + "Student who have job " +"\n" + "-----------------------------------\n \n");
        studentsWithLoan.forEach(student ->{
            if(student.isEmployed()){
                System.out.println("ID :\"" + student.getNId() + "\"");
            }
        });
        System.out.println("\n \n \n----------------------------------------------------------------------");
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        BrdLoanManagement brd = new BrdLoanManagement();
        if(R.students.size()==0){
            R.generateRandomStudents();
        }
        if(brd.studentsWithLoan.size() == 0){
            generateRandomStudentWithLoan(brd);
        }
        while (true) {
            System.out.println("" +
                    "1. VIEW STUDENT WHO HAVE JOB: \n" +
                    "2. VIEW STUDENT WITH LOAN BELOW A YEAR \n" +
                    "0. EXIT BRD");
            System.out.print("YOUR CHOICE: ");
            switch (input.nextInt()) {
                case 1: {
                    brd.viewStudentWhoHaveJob();
                    break;
                }
                case 2: {
                    System.out.print("Type year (like 2022) : ");
                    brd.viewStudentsWithLoanBelowThisYear(input.nextInt());
                    break;
                }
                case 0: {return;}
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }
    }
    private static void generateRandomStudentWithLoan(BrdLoanManagement brd){
        StudentWithLoan studentWithLoan;
        for(int i = 0; i < 10+R.r.nextInt(R.students.size() - 10); i++){
            studentWithLoan = new StudentWithLoan(R.students.get(i));
            studentWithLoan.setEmployed(R.r.nextBoolean());
            int moneyToPay = 1000000 + R.r.nextInt(15000000);
            studentWithLoan.setMoneyToPay(moneyToPay);
            studentWithLoan.setPayedMoneySoFar(R.r.nextInt(moneyToPay));
            Calendar c = Calendar.getInstance();
            c.set(2000+R.r.nextInt(22),1,1);
            studentWithLoan.setDateOfLoanGiving(c);

            brd.studentsWithLoan.add(studentWithLoan);
        }
    }
}
