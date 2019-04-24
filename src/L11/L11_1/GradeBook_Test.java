// jhtp8LOV_ch07.pptx, P46 & 47, program that creates and manipulates 2 GradeBook objects

package L11.L11_1;

public class GradeBook_Test
{
	public static void main(String[] args)
	{
		GradeBook book1 = new GradeBook("Developing Software：Introduction"); // create a GradeBook object and assign it to "book1"
		GradeBook book2 = new GradeBook("Workplace Communication in English"); // create a GradeBook object and assign it to "book2"
	    
	    System.out.println("The initial course name of Grade Book 1: " + book1.getCourseName() +
	    		           "\nThe initial course name of Grade Book 2: " + book2.getCourseName()); // call the specified method in class GradeBook to display the initial course name of each grade book
	} // end main
} // end class GradeBook_Test