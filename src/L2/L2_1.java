//2017.10.09, jhtp8LOV_ch02.pptx, P6 & 39 & 41 & 44, text-printing program
package L2;

//always remember that "public class + (the file's name)" is the correct format here
public class L2_1
{
	//main method begins execution of Java application
	public static void main( String[] args )
	{
		String name = "\"Arena of Valor\"!"; //the value of the variable "name" is ""Arena of Valor"!"
		
		System.out.println( "Welcome to " + name ); //print "Welcome to " with the value of the variable "name" followed and output a NEWLINE character
		System.out.print( "First " ); //print "First " and leave the cursor on the SAME LINE ("System.out.printf( "First " )" is the same)
		System.out.println( "Blood!" ); //print "Blood!" starting where the cursor was positioned previously and output a NEWLINE character
		System.out.println( "Double Kill!\nTrible Kill!\nQuadra Kill!\nPenta Kill!\nAce!\nKilling Spree!\nRampage" );
		System.out.println( "Unstoppable!\nGodlike!" );
		System.out.printf( "%s\n%s\n", "Legendary!", "Victory!" ); //the last "\n" is needed, because the cursor is usually left on a new line when a program ends
	} //end main
} //end class L2_1