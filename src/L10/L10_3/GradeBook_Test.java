//2017.12.04, jhtp8LOV_ch07.pptx, P28 & 29, program that creates and manipulates a GradeBook object

package L10.L10_3;

import java.util.Scanner;

public class GradeBook_Test
{
	public static void main( String[] args )
	{ 
		GradeBook book = new GradeBook(); //create a GradeBook object and assign it to "book"
		Scanner input = new Scanner( System.in );
		
		String name;
	    
	    System.out.printf( "The initial course name: %s\n\n", book.getCourseName() ); //call the specified method in class GradeBook to display the initial course name
	    System.out.print( "Give your grade book a new course name: " );
	    name = input.nextLine(); //read a line of text which is different from "input.next()" that reads individual words
	    
	    book.setCourseName( name ); //call the specified method in class GradeBook to set the course name for this grade book
	    
	    System.out.println();
	    
	    book.OutputMessage(); //call the specified method in class GradeBook to output a welcome message after specifying the course name
	    input.close(); //close "input" to avoid resource leak
	} //end method main
} //end class GradeBook_Test