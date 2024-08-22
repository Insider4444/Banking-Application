import Complaints.Complaint_module;
import MoneyTransfer.Money_transfer;
import PayBills.Bill_payment;
import ProfileViewer.Profile;
import Viewer.View_statement;
import java.util.Scanner;

public class BankMenu {
    public static void clear() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    protected void startBankApp() throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("""


                    ||==> Welcome to MyBank - Your trusted place for Banking needs <==||
                    ||=====> Please enter the below options to proceed further <======||

                                        1) Transfer Money
                                        2) Pay Bills
                                        3) View Account Statement
                                        4) Raise any complaints
                                        5) View Profile Details
                                        6) Exit Application
                    """);
            System.out.print("Enter your choice : ");
            int choice = input.nextInt();

            if (choice == 1) {
                int money_t = Money_transfer.transfer_module();
                if (money_t == 7) {
                    clear();
                    startBankApp();
                } else if (money_t == 6) {
                    System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                    break;
                }
            } else if (choice == 2) {
                int pay_bill = Bill_payment.paybill();
                if (pay_bill == 7) {
                    clear();
                    startBankApp();
                } else if (pay_bill == 6) {
                    System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                    break;
                }
            } else if (choice == 3) {
                int ViewStatement = View_statement.statement_viewer();
                if (ViewStatement == 7) {
                    clear();
                    startBankApp();
                } else if (ViewStatement == 6) {
                    System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                    break;
                }
            } else if (choice == 4) {
                int Complaint = Complaint_module.file_complaint();
                if (Complaint == 7) {
                    clear();
                    startBankApp();
                } else if (Complaint == 6) {
                    System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                    break;
                }
            } else if (choice == 5) {
                int profile = Profile.profile_viewer();
                if (profile == 7) {
                    clear();
                    startBankApp();
                } else if (profile == 6) {
                    System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                    break;
                }
            } else if (choice == 6) {
                System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                System.exit(0);
            } else {
                clear();
                System.out.println("\n\n||==============> Thank You For Banking with us :) <===============||\n\n");
                startBankApp();
            }

        }

    }
}
