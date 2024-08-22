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
        sc.next();
        mobile_op = sc.nextLine();
        System.out.print("Enter Mobile No : ");
        sc.next();
        mobile_no = sc.nextLong();
        System.out.print("Enter Amount : ");
        sc.next();
        amount = sc.nextLong();
        System.out.print("Enter Debit/Credit Card Number : ");
        sc.next();
        card_number = sc.nextLong();
        System.out.print("Enter CVV code : ");
        sc.next();
        cvv = sc.nextInt();
        System.out.print("Enter Expiry Date : ");
        sc.next();
        expiry_date = sc.nextLine();
        System.out.println("\nCongratulations !\nYour Bill Payment is Successfully");
        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }
}
