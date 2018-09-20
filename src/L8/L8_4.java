//2017.11.20, jhtp8LOV_ch06.pptx, P66-73, program that summarises grades using a 2-dimensional array to store grades

package L8;

public class L8_4
{
	public static void main( String[] args )
	{
		int[][] gradeArray = { { 87, 96, 70 }, 
				             { 68, 87, 90 }, 
				             { 94, 100, 90 }, 
				             { 100, 81, 82 }, 
				             { 83, 65, 85 }, 
				             { 78, 87, 65 }, 
				             { 85, 75, 83 }, 
				             { 91, 94, 100 }, 
				             { 76, 72, 84 }, 
				             { 87, 93, 73 } };
		
		OutputGrade( gradeArray ); //call the specified method to output each student's grades of all the 3 tests and average grade
		
		System.out.printf( "\n%s %d\n%s %d\n\n", "The lowest grade:", getMin( gradeArray ), "The highest grade:", getMax( gradeArray ) ); //call the specified methods to output the lowest grade and the highest grade
		
		OutputBarChart( gradeArray ); //call the specified method to output the grade distribution chart of all grades on all tests
	} //end main
	
	/**
	 * Get the lowest grade.
	 * @param gradeArray an array storing grades
	 * @return the lowest grade
	 */
	public static int getMin( int[][] gradeArray )
	{
		int lowGrade = gradeArray[ 0 ][ 0 ]; //assume the first element of the array named gradeArray is the smallest
		
		//loop through rows of the array named gradeArray
		for( int[] row : gradeArray )
		{
			//loop through columns of the current row to determine the lowest grade
			for( int grade : row )
			{
				//if "grade" is less than "lowGrade", assign it to "lowGrade"
				if( grade < lowGrade )
					lowGrade = grade;
			} //end for
		} //end for
		
		return lowGrade;
	} //end method getMin
	
	/**
	 * Get the highest grade.
	 * @param gradeArray an array storing grades
	 * @return the highest grade
	 */
	public static int getMax( int[][] gradeArray )
	{
		int highGrade = gradeArray[ 0 ][ 0 ]; //assume the first element of the array named gradeArray is the largest
		
		//loop through rows of the array named gradeArray
		for( int[] row : gradeArray )
		{
			//loop through columns of the current row to determine the highest grade
			for( int grade : row )
			{
				//if "grade" is greater than "highGrade", assign it to "highGrade"
				if( grade > highGrade )
					highGrade = grade;
			} //end for
		} //end for
		
		return highGrade;
	} //end method getMax
	
	/**
	 * Get the current student's average grade.
	 * @param rowOfGradeArray a row of an array containing a student's grades
	 * @return the current student's average grade
	 */
	public static double getAverage( int[] rowOfGradeArray )
	{
		int total = 0;
		double average;
		
		//sum grades for 1 student
		for( int grade : rowOfGradeArray )
			total += grade;
		
		average = ( double ) total / rowOfGradeArray.length; //calculate the current student's average grade
		
		return average;
	} //end method getAverage
	
	/**
	 * Output each student's grades of all the 3 tests and average grade.
	 * @param gradeArray an array storing grades
	 */
	public static void OutputGrade( int[][] gradeArray )
	{
		double average;
		
		System.out.println( "The grades:" );
		System.out.print( "            " ); //these spaces are used for a better layout
		
		//loop to create column headings for each of the 3 tests
		for( int test = 0; test < gradeArray[ 0 ].length; ++test )
			System.out.printf( "Test %d  ", test + 1 );
		
		System.out.println( "Average" );
		
		//loop to create row headings for each student and to print grades
		for( int student = 0; student < gradeArray.length; ++student )
		{
			System.out.printf( "Student %2d", student + 1 );
			
			//loop through columns of the current row
			for( int grade : gradeArray[ student ] )
				System.out.printf( "%8d", grade );
			
			average = getAverage( gradeArray[ student ] ); //call the specified method to calculate the current student's average grade
			
			System.out.printf( "%9.2f\n", average ); //print the average grade with 2 decimal places kept
		} //end for
	} //end method OutputGrade
	
	/**
	 * Output the grade distribution chart of all grades on all tests.
	 * @param gradeArray an array storing grades
	 */
	public static void OutputBarChart( int[][] gradeArray )
	{		
		int[] frequency = new int[ 11 ]; //store frequency of grades in each range of 10 grades
		
		System.out.println( "Overall grade distribution:" );
		
		//loop through rows of the array named gradeArray
		for( int[] row : gradeArray )
		{
			//loop through columns of the current row
			for( int grade : row )
				++frequency[ grade / 10 ]; //for each grade, increment the appropriate frequency
		} //end for
		
		//for each grade frequency, output a bar of the chart
		for( int counter = 0; counter < frequency.length; counter++ )
		{
			//output the bar label "100: "
			if( counter == 10 )
				System.out.printf( "%5d: ", 100 );
			//output bar labels "00-09: ", "10-19: ", ... and "90-99: "
			else
				System.out.printf( "%02d-%02d: ", counter * 10, counter * 10 + 9 );
			
			//print bars of asterisks
			for( int asterisk = 0; asterisk < frequency[ counter ]; asterisk++ )
				System.out.print( "*" );
			
			System.out.println();
		} //end for
	} //end method OutputBarChart
} //end class L8_4