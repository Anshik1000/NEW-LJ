package com.placement.assignment2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Read the line containing stageEvent, customer, and noOfSeats
        String inputLine = in.nextLine();
        String[] inputs = inputLine.split(",");

        String stageEvent = inputs[0].trim();
        String customer = inputs[1].trim();
        int noOfSeats = Integer.parseInt(inputs[2].trim());

        TicketBooking customer1 = new TicketBooking(stageEvent, customer, noOfSeats);

        int paymentMode = in.nextInt();
        in.nextLine();  // Consume the leftover newline
        double amount;
        switch (paymentMode) {
            case 1:
            	amount = in.nextDouble();
                customer1.makePayment(amount);
                break;
            case 2:
            	amount = in.nextDouble();
                in.nextLine();//avoiding /n to be consumed.
                String walletNumber = in.nextLine();
                customer1.makePayment(walletNumber, amount);
                break;
            case 3:
            	String name = in.nextLine();
            	amount = in.nextDouble();
                in.nextLine();//avoiding /n to be consumed.
                String cardType = in.nextLine();
                String ccv = in.nextLine();
                customer1.makePayment(cardType, ccv, name, amount);
                break;

            default:
                System.out.println("Invalid choice");
        }
        
        in.close();
    }
}
