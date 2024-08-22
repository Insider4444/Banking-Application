package Complaints;

import java.util.Scanner;

public class Complaint_module {
    static Long account_number;
    static String complaint_info;
    static Long contact_number;
    public static int file_complaint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number : ");
        sc.next();
        account_number = sc.nextLong();
        System.out.print("Enter Complaint : ");
        sc.next();
        complaint_info = sc.nextLine();
        System.out.print("Enter Contact Info : ");
        sc.next();
        contact_number = sc.nextLong();
        System.out.println("\nThanks..one of our representative will contact you shortly regarding this complaint..");
        System.out.print("\n\nEnter '7' for Main-Menu (or) '6' to Exit Application : ");
        return sc.nextInt();
    }

}
