package PayBills;

import java.util.Scanner;

public class Bill_payment {
    static String mobile_op;
    static Long mobile_no;
    static Long amount;
    static Long card_number;
    static int cvv;
    static String expiry_date;

    public static int paybill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Operator to PayBill : ");
        mobile_op = sc.nextLine();
        System.out.print("Enter Mobile No : ");
        mobile_no = sc.nextLong();
        System.out.print("Enter Amount : ");
        amount = sc.nextLong();
        System.out.print("Enter Debit/Credit Card Number : ");
        card_number = sc.nextLong();
        System.out.print("Enter CVV code : ");
        cvv = sc.nextInt();
        System.out.print("Enter Expiry Date : ");
        expiry_date = sc.next();
        System.out.println("\nCongratulations !\nYour Bill Payment is Successfully");
        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }
}
