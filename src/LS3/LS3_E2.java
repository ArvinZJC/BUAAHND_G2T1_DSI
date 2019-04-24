// LS3.docx, Exercise 2, program written for practising writing statements that perform the 3 simple 1-dimensional-array operations

package LS3;

public class LS3_E2
{
	public static void main(String[] args)
	{
		System.out.println("a) Set the 10 elements of integer array counts to zero.");
		TaskA(); // call the specified method to set the 10 elements of the array named counts to 0
		
		System.out.println("\n\nb) Add one to each of the 15 elements of integer array bonus.");
		TaskB(); // call the specified method to add 1 to each of the 15 elements of the array named bonus
		
		System.out.println("\n\nc) Display the five values of integer array bestScores in column format.");
		TaskC(); // call the specified method to display the 5 values of the array named bestScores in column format
	} // end main
	
	/**
	 * Set the 10 elements of the array named counts to 0.
	 */
	public static void TaskA()
	{
		int[] counts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.print("   (original) counts[]: ");
		
		for (int count = 0; count < counts.length; count++)
		{
			System.out.printf("%d  ", counts[count]);
			counts[count] = 0;
		} // end for
		
		System.out.print("\n   counts[]: ");
		
		for (int value : counts)
			System.out.printf("%d  ", value);
	} // end method TaskA
	
	/**
	 * Add 1 to each of the 15 elements of the array named bonus.
	 */
	public static void TaskB()
	{
		int[] bonus = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		System.out.print("   (original) bonus[]: ");
		
		for (int count = 0; count < bonus.length; ++count)
		{
			System.out.printf("%d  ", bonus[count]);
			bonus[count] += 1;
		} // end for
		
        System.out.print("\n   bonus[]: ");
		
		for (int value : bonus)
			System.out.printf("%d  ", value);
	} // end method TaskB
	
	/**
	 * Display the 5 values of the array named bestScores in column format.
	 */
	public static void TaskC()
	{
		int[] bestScores = {100, 100, 100, 100, 100};
		
		System.out.println("   bestScores[]:");
		
		for (int value : bestScores)
			System.out.printf("                 %d\n", value);
	} // end method TaskC
} // end class LS3_E2