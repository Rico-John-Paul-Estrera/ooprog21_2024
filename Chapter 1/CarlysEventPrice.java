import java.util.Scanner;

public class CarlysEventPrice {
    
    public static void main(String[] args) {
        // Carly's Catering motto
        String motto = "Carly’s makes the food that makes it a party!";
        
        // Display the motto
        System.out.println("****************************************");
        System.out.println("* " + motto + " *");
        System.out.println("****************************************");
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the number of guests
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = input.nextInt();
        
        // Define the price per guest
        final int PRICE_PER_GUEST = 35;
        
        // Calculate the total price
        int totalPrice = numberOfGuests * PRICE_PER_GUEST;
        
        // Determine if the event is classified as large
        boolean isLargeEvent = numberOfGuests >= 50;
        
        // Display the details
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
        
        // Close the scanner
        input.close();
    }
}
