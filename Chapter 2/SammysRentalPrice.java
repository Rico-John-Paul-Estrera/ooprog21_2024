import java.util.Scanner;

public class SammysRentalPrice {

 public static void main(String[] args) {
 
    String sammyMotto = "S Sammy's makes it fun in the sun. S";
   int rentedMinutes;
   int rentalPerHour = 40;
   int rentalPerMinute = 1;
 
      
   Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of minutes rented: ");
   rentedMinutes = scan.nextInt();
   
      System.out.println("\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println(sammyMotto);
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");

   
   int hours = rentedMinutes / 60;
   int addMinutes = rentedMinutes % 60;
  
   int totalPrice = ((hours * rentalPerHour) + addMinutes);
  
  
      System.out.println("Rented Hours: " + hours);
      System.out.println("Additional Minutes: " + addMinutes);
      System.out.println("Total Price: " + "$" + totalPrice);
   scan.close();
  
  }
 }
 
 
 
 
 
 //Sammy's Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs,
 //and umbrellas to tourists. Write a program that prompts the user for the number of minutes he rented a piece of sports equipment. 
 //Compute the rental cost as $40 per hour plus $1 per additional minute. (Lou might have surmised already that this rate has a logical flaw, but for now, 
 //calculate rates as described here.) Display Sammy's motto with the attachment below. Then display the hours, minutes, and total price. Save the file as SammysRentalPrice.java.