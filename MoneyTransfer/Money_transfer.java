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
        System.out.print("Enter Bank Name: ");
        bank_name = sc.next();
        System.out.print("Enter Beneficiary Account No: ");
        beneficiary_account_no = sc.nextLong();
        System.out.print("Enter IFSC Code: ");
        IFSC_code = sc.next();
        System.out.print("Enter Amount: ");
        amount = sc.nextLong();
        System.out.println("\nCongratulations !\nYour Money is Transferred Successfully");
        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }
}
