package main;

import javafx.beans.binding.When;
import main.attendance.AttendanceManagement;
import main.brdLoan.BrdLoanManagement;
import main.ferwafa.FerwafaNotificationSystem;

import java.util.Calendar;
import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            System.out.println("" +
                    "1. BRD \n" +
                    "2. ATTENDANCE \n" +
                    "3. NOTIFICATION \n" +
                    "0. EXIT");

            switch (input.nextInt()){
                case 1:{ BrdLoanManagement.main(args);break; }
                case 2:{ AttendanceManagement.main(args);break; }
                case 3:{FerwafaNotificationSystem.main(args); break;}
                case 0:{return; }
                default:{ System.out.println("Wrong choice");}
            }
        }



    }
}
