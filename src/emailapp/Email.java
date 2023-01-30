package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
    }

    private String setDepartment(){
        System.out.println("Enter the Department\n1 for Sales\n2 for Deveploment\n3 for Accounting\n0 for None");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if(depChoice == 1){
            return "sales";
        }
        else if (depChoice == 2){
            return "dev";
        }
        else if (depChoice == 3){
            return "acct";
        }
        else{
            return "";
        }
    }
}
