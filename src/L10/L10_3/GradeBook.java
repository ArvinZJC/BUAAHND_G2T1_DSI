//2017.12.04, jhtp8LOV_ch07.pptx, P16 & 17, class GradeBook that can modify the course name

package L10.L10_3;

public class GradeBook
{
	/**
	 * This variable is declared to store the course name for this grade book.
	 */
	private String courseName;
	
	/**
	 * Set the course name for this grade book.
	 * @param name
	 */
	public void setCourseName( String name )
	{
		courseName = name;
	} //end method setCourseName
	
	/**
	 * Get the course name for this grade book.
	 * @return the course name
	 */
	public String getCourseName()
	{
		return courseName;
	} //end method getCourseName
	
	/**
	 * Output a welcome message.
	 */
	public void OutputMessage()
	{
	    System.out.printf( "Welcome to the grade book for %s!\n", getCourseName() ); //call the specified method to get the course name for this grade book
	} //end method OutputMessage
} //end class GradeBook