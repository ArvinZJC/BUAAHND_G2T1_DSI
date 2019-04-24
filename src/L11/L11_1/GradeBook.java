// jhtp8LOV_ch07.pptx, P43 & 44, class GradeBook (with a programmer-declared constructor) that can modify the course name

package L11.L11_1;

public class GradeBook
{
	public GradeBook(String initialName)
	{
		courseName = initialName; // initialise the course name
	} // end constructor GradeBook
	
	// this variable is declared to store the course name for this grade book
	private String courseName;
	
	/**
	 * Set the course name for this grade book.
	 * @param name the course name to be set
	 */
	public void setCourseName(String name)
	{
		courseName = name;
	} // end method setCourseName
	
	/**
	 * Get the course name for this grade book.
	 * @return the course name
	 */
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	/**
	 * Output a welcome message.
	 */
	public void OutputMessage()
	{
	    System.out.printf("Welcome to the grade book for %s!\n", getCourseName()); // call the specified method to get the course name for this grade book
	} // end method OutputMessage
} // end class GradeBook