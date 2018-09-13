//2017.12.25, jhtp8LOV_ch08.pptx, P67 & 68, program that uses enum type Book

package L13.L13_1;

import java.util.EnumSet;

public class Book_Test
{
	public static void main( String[] args )
	{
		System.out.printf( "%-7s%-45s%s\n", "Book", "Title", "Copyright year" );
		System.out.println( "******************************************************************" ); //these asterisks are used for a better layout
		System.out.println( "All books:" );
		                
		//loop to print all books in enum type Book
		for( Book book : Book.values() )
	    	System.out.printf( "  %-5s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear() );
	    
	    System.out.println( "\nThe first 4 books:" );
	                                
	    //loop to print the first 4 books in enum type Book
	    for( Book book : EnumSet.range( Book.book1, Book.book4 ) )
	    	System.out.printf( "  %-5s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear() );
	   } //end method main
} //end class Book_Test