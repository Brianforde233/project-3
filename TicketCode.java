import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**.
* accept coded ticket information
*@author Brian Forde Comp1210-001
@version 9/11/20
*/ 

public class TicketCode 
{
/**.
* random prizenumber .
*
* Project 3 
*@param args Command line arguments - (not used) 
*/ 
   public static void main(String[] args)
   {
     
      double cost, price, discount;
      String description, date, section, row, seat, time; 
      String ticketCode = "";
      
      Scanner in = new Scanner(System.in);
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("0%");
      DecimalFormat prizeFormat = new DecimalFormat("000");
      Random prizeGenerator = new Random();
      
      System.out.print("Enter ticket code: ");
      ticketCode = in.nextLine().trim();
               
      
   
   // make the user aware if it is valid
      if (ticketCode.length() < 26)
      { 
        
         System.out.println("\nInvalid ticket code.\nTicket code"
            + " must have at least 26 characters. "); 
         return;
      }
      // values 
      
      price = (Double.parseDouble(ticketCode.substring(0, 5)) / 100);
      discount = (Double.parseDouble(ticketCode.substring(5, 7)) / 100);
      time = ticketCode.substring(7, 9) + ":" + ticketCode.substring(9, 11);
      date = ticketCode.substring(11, 13) + '/' + ticketCode.substring(13, 15)
            + '/' + ticketCode.substring(15, 19);
      section = ticketCode.substring(19, 21);
      row = ticketCode.substring(21, 23);
      seat = ticketCode.substring(23, 25);
      description = ticketCode.substring(25);
      
      // print
      
      System.out.print("\nDescription: " + description 
            + "   Date: " + date + "   Time: " + time);
      System.out.print("\nSection: " + section + "   Row: "
             + row + "   Seat: " + seat);
      System.out.print("\nPrice: " + priceFormat.format(price)
             + "   Discount: " + discountFormat.format(discount)
            + "   Cost: " + priceFormat.format(price - (price * discount)));
      System.out.print("\nPrize Number: " + (prizeGenerator.nextInt(999) + 1));
   }
}


   

