//2017.12.25, jhtp8LOV_ch08.pptx, P65 & 66, enum type Book (with a programmer-declared constructor) that stores names and copyright years of 6 books

package L13.L13_1;

public enum Book
{
	book1( "Java: How to Program", "2010" ),                        
	book2( "C: How to Program", "2007" ),                           
	book3( "Internet & World Wide Web: How to Program", "2008" ),
	book4( "C++: How to Program", "2008" ),                       
	book5( "Visual Basic 2008: How to Program", "2009" ),
	book6( "Visual C# 2008: How to Program", "2009" );
	
	private final String TITLE;
	private final String COPYRIGHT_YEAR;
	
	Book( String TITLE, String COPYRIGHT_YEAR )
	{
		this.TITLE = TITLE;
		this.COPYRIGHT_YEAR = COPYRIGHT_YEAR;
	} //end constructor Book
	
	/**
	 * Get the title of a book.
	 * @return the title
	 */
	public String getTitle()
	{
		return TITLE;
	} //end method getTitle
	
	/**
	 * Get the copyright year of a book.
	 * @return the copyright year
	 */
	public String getCopyrightYear()
	{
		return COPYRIGHT_YEAR;
	} //end method getCopyrightYear
} //end enum Book