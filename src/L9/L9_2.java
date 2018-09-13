//2017.11.27, jhtp8LOV_ch06.pptx, P82-84, program that initialises an array using command-line arguments

package L9;

public class L9_2
{
	public static void main( String[] args )
	{
		//check the number of command-line arguments
		if( args.length != 3 )
			System.out.print( "Error! There are no 3 proper integers for the array size, initial value and increment." );
		//Java passes the command-line arguments that appear after the class name in the java command to the method main as Strings in the array named args
		else
		{
			int arrayLength = Integer.parseInt( args[ 0 ] ), initialValue = Integer.parseInt( args[ 1 ] ), increment = Integer.parseInt( args[ 2 ] ); //get the array size from the 1st command-line arguments, initial value from the 2nd, and increment from the last
			int[] array = new int[ arrayLength ];
			
			//loop to calculate the value for each array element
			for( int counter = 0; counter < array.length; counter++ )
				array[ counter ] = initialValue + increment * counter;
			
			System.out.printf( "%s%8s\n", "Index", "Value" );
			
			//output each array element's value
			for( int counter = 0; counter < array.length; counter++ )
				System.out.printf( "%5d%8d\n", counter, array[ counter ] );
		} //end if...else
	} //end method main
} //end class L9_2