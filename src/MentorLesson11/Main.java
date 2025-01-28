package MentorLesson11;

import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        Pattern classPattern=Pattern.compile("ECONOMY|REMIUM_ECONOMY|BUSINESS|FIRST_CLASS");
        Pattern destinationPattern=Pattern.compile("NEW_YORK|LONDON|TOKYO|PARIS|SYDNEY");
        Pattern seatPattern=Pattern.compile("WINDOW|AISLE|MIDDLE");
        Pattern quantityPattern=Pattern.compile("[1-4]|5");
        Pattern emailPattern=Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

        String email=null;
        while (email==null){
            System.out.println("Enter email:");
            String inputEmail=scanner.nextLine();
            if (emailPattern.matcher(inputEmail).matches()){
                email=inputEmail;
            }
        }

        FlightClass flightClass=null;
        while (flightClass==null){
            System.out.println("Enter class:");
            String inputClass=scanner.nextLine().toUpperCase();
            if (classPattern.matcher(inputClass).matches()){
                flightClass=FlightClass.valueOf(inputClass);
            }
            else {
                System.out.println("Invalid Flight Class");
            }
        }
        Destination destination=null;
        while (destination==null){
            System.out.println("Enter destination:");
            String inputDestination=scanner.nextLine().toUpperCase();
            if (destinationPattern.matcher(inputDestination).matches()){
                destination=Destination.valueOf(inputDestination);
            }
            else {
                System.out.println("Invalid Destination");
            }
        }
        SeatPreference seatPreference=null;
        while (seatPreference==null){
            System.out.println("Enter seat:");
            String inputSeat=scanner.nextLine().toUpperCase();
            if (seatPattern.matcher(inputSeat).matches()){
                seatPreference=SeatPreference.valueOf(inputSeat);
            }
            else {
                System.out.println("Invalid Seat");
            }
        }
        Integer quantity = null;
        while (quantity == null) {
            System.out.println("Enter quantity (1 to 5): ");
            String inputQuantity = scanner.nextLine();
            if (quantityPattern.matcher(inputQuantity).matches()) {
                quantity = Integer.parseInt(inputQuantity);
            } else {
                System.out.println("Invalid quantity");
            }
        }

        double totalPrice= destination.price* flightClass.price+ seatPreference.price;

        System.out.println("\n--- Order Summary ---");
        System.out.println("Flight Class: " + flightClass);
        System.out.println("Destination: " + destination);
        System.out.println("Seat: " + seatPreference);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" +totalPrice);





    }
}
