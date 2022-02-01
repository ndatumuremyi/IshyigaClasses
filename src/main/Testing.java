package main;

import javafx.beans.binding.When;
import main.attendance.AttendanceManagement;
import main.brdLoan.BrdLoanManagement;

import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            System.out.println("" +
                    "1. BRD \n" +
                    "2. ATTENDANCE \n" +
                    "3. NOTIFICATION \n");

            switch (input.nextInt()){
                case 1:{
                    BrdLoanManagement.main(args);
                    break;
                }
                case 2:{
                    AttendanceManagement.main(args);
                    break;
                }
                case 3:{
                    break;
                }
                default:{ System.out.println("Wrong choice");}
            }
        }



    }
}
