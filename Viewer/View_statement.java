package Viewer;

import java.util.Calendar;
import java.util.Scanner;

public class View_statement {
    static Long acc_no;
    static Calendar cal = Calendar.getInstance();
    static int day = cal.get(Calendar.DAY_OF_MONTH);
    static int month = cal.get(Calendar.MONTH)+1;
    static int year = cal.get(Calendar.YEAR);

    public static int statement_viewer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        acc_no = sc.nextLong();
        System.out.println("Account Balance : " + "₹4444444");
        System.out.println("Account Statement Upto : " + day + "/" + month + "/" + year);

        System.out.println("\n==============================================================");
        System.out.println("DATE\t\tTRANSACTION\t\tDEBIT/CREDIT\tAMOUNT");
        System.out.println("==============================================================");
        System.out.println(day + "/" + month + "/" + year + "\tDMART Payment\t\tDebit\t\t₹7000");
        System.out.println(day-2 + "/" + month + "/" + year + "\tISRTC Payment\t\tDebit\t\t₹890 ");
        System.out.println(day-3 + "/" + month + "/" + year + "\tMoney-Received\t\tCredit\t\t₹2000");
        System.out.println(day-4 + "/" + month + "/" + year + "\tBook-my-show\t\tDebit\t\t₹500");
        System.out.println(day-5 + "/" + month + "/" + year + "\tFlipkart-e-Pay\t\tDebit\t\t₹500");

        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }
}
