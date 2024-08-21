package ProfileViewer;

import java.util.Scanner;

public class Profile {
    public static int profile_viewer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
        
        Account Holder Name           : P Bhargav Sai
        Account Holder Account Type   : Savings Account
        Account Holder Branch Address : 9/6 MannarReddy st. Hyderabad
        
        """);
        System.out.print("Enter '7' for Main-Menu (or) '6' to Exit Application :");
        return sc.nextInt();
    }
}
