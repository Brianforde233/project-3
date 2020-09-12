import java.util.Scanner;
import java.text.DecimalFormat;
/**.
* result of expression in formula below value x
* Project 3
*@author Brian Forde Comp1210-001
@version 9/11/20
*/ 

public class FormulaSolver {
    /**.
* result in a variable of type double.
*
*@param args Command line arguments - (not used) 
*/ 
   public static void main(String[] args) { 
      Scanner userInput = new Scanner(System.in);
     
      double x;
      int left;
      int right;
      double result;
     
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
     
      result = ((6 * Math.pow(x, 3)) - 4)
         * (Math.sqrt(Math.abs((7 * Math.pow(x, 3)) + (5 
         * Math.pow(x, 2)) + (3 * x) + 1)));
         
      System.out.println("Result: " + result);
       
      String decimalResult = Double.toString(result);
      left = decimalResult.indexOf(".");
      System.out.println("# of characters to left of decimal point: " + left);
       
      right = decimalResult.length();
      System.out.println("# of characters to right of decimal point: "
         +  (right - (left + 1)));
      DecimalFormat df = new DecimalFormat("#,##0.0#####");
      System.out.println("Formatted Result: " + df.format(result));
   }
       
}