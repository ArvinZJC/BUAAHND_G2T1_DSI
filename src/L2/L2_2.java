//2017.10.09, jhtp8LOV_ch02.pptx, P48 & 49, addition program that displays the sum of 2 numbers

package L2;

import java.util.Scanner; //program uses class Scanner

public class L2_2
{
	public static void main( String[] args )
    {
		Scanner input = new Scanner( System.in ); //create a Scanner to obtain "input" from the command window
  
        int number1, number2, sum; //"input", "number1", "number2" and "sum" are all variables that are declared but not initialised by the programmer
     
        System.out.print( "Enter the first integer: " ); //prompt for and input the first integer
        number1 = input.nextInt(); //read an integer value from the user
        
        System.out.print( "Enter the second integer: " ); //prompt for and input the second integer
        number2 = input.nextInt(); //read another integer value from the user
        
        sum = number1 + number2; //add the numbers and store the total in "sum"

        System.out.printf( "\nSum: %d\n", sum ); //this can also be written as "System.out.printf( "\n%s%d.\n", "Sum: ", sum );"
        
        input.close(); //close "input" of class Scanner to avoid resource leak
    } //end method main
} //end class L2_2