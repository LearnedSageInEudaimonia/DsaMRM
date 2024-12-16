/*

Write a Java program that can “make change.” Your program should take two
numbers as input, one that is a monetary amount charged and the other that is
a monetary amount given. It should then return the number of each kind of bill
and coin to give back as change for the difference between the amount given and
the amount charged. The values assigned to the bills and coins can be based on
the monetary system of any current or former government

*/
import java.util.Scanner;

public class ReturnBills {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount charged: ₹ ");
        int amountCharged = read.nextInt();
        System.out.println("Enter the amount given: ₹ ");
        int amountgiven = read.nextInt();

        int change = amountgiven - amountCharged;
        if (change < 0) {
            System.out.println(STR."The customer should pay : ₹\{-change}");
        } else {
            System.out.println("Change to be returned: ₹ " + change);


            int[] bills = {100, 50, 20, 10, 5, 1};
            for (int bill : bills) {
                int count = change / bill;
                if(count>0) {
                    System.out.println(STR."₹\{bill} Rupee Note: \{count}");
                    change -= count*bill;
                }
            }
        }
    }
}


