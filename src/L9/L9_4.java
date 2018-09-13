//2017.11.27, jhtp8LOV_ch06.pptx, P93-95, program that uses methods from class ArrayList

package L9;

import java.util.ArrayList;

public class L9_4
{
	public static void main( String[] args )
	{
		ArrayList< String > items = new ArrayList< String >();
		
		items.add( "red" ); //append an item to the list
		items.add( 0, "yellow" ); //insert the value at Index 0
		items.add( "green" ); //add "green" to the end of the list
		items.add( "yellow" ); //add "yellow" to the end of the list
		
		OutputListContents( items, "List contents after adding: " ); //call the specified method to output current list contents
		
		items.remove( "yellow" ); //remove the first "yellow"
		items.remove( 1 ); //remove the item at Index 1
		
		OutputListContents( items, "List contents after removing: " ); //call the specified method to output current list contents
		
		System.out.printf( "\"red\" is%sin the list.\n", items.contains( "red" ) ? " " : " not " ); //check if a value is in the list
		System.out.printf( "The size of the list: %d\n", items.size() ); //display the number of elements in the list
	} //end method main
	
	/**
	 * Output current list contents.
	 * @param items
	 * @param header
	 */
	public static void OutputListContents( ArrayList< String > items, String header)
	{
		System.out.print( header );
		
		for( String item : items )
			System.out.printf( "%s  ", item );
		
		System.out.println();
	} //end method OutputListContents
} //end class L9_4
