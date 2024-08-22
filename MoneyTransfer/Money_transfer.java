package MoneyTransfer;

import java.util.Scanner;

public class Money_transfer {
    static Long acc_no;
    static String bank_name;
    static Long beneficiary_account_no;
    static String IFSC_code;
    static Long amount;

    public static int transfer_module(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account no: ");
        sc.next();
        acc_no = sc.nextLong();
        System.out.print("Enter Bank Name: ");
        sc.next();
        bank_name = sc.nextLine();
        System.out.print("Enter Beneficiary Account No: ");
        sc.next();
        beneficiary_account_no = sc.nextLong();
        System.out.print("Enter IFSC Code: ");
        sc.next();
        IFSC_code = sc.nextLine();
        System.out.print("Enter Amount: ");
        sc.next();
        amount = sc.nextLong();
        System.out.println("\nCongratulations !\nYour Money is Transferred Successfully");
        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }
}
