package com.nadunnissanka;

import java.util.Scanner; //import Scanner Class
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("Welcome to tip calculator");
        System.out.println("-------------------------\n");
	    // create a scanner object
        Scanner scan = new Scanner(System.in);
        //inputs
        System.out.print("What was the total bill: $ ");
        Float billAmount = scan.nextFloat();
        System.out.print("Enter tip percentage (10, 12, 15)%: ");
        Integer percentage = scan.nextInt();
        System.out.print("How many people to split the bill? ");
        Integer people = scan.nextInt();

        //tip of each person
        float tipOfEachPerson = ((billAmount * percentage) / 100) / people;
        System.out.println("Each person's tip: "+tipOfEachPerson);
        //total bill each person should pay
        float billOfEachPerson = billAmount / people;
        float totalBillEachPersonPay = billOfEachPerson + tipOfEachPerson;
        String formattedString = String.format("%.02f", totalBillEachPersonPay);
        System.out.println("Each person should pay: "+formattedString);
    }
}
