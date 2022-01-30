package main;

public class Testing {
    public static void main(String args[]){
        Student student = new Student();
        StudentWithLoan studentWithLoan = (StudentWithLoan) student;

        studentWithLoan.print();

    }
}
