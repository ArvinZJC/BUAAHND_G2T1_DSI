// jhtp8LOV_ch06.pptx, P106 & 107, program that uses methods length, charAt and getChars from class String

package L9;

public class L9_5
{
	public static void main(String[] args)
	{
		String str = "hello there";
		char[] array = new char[5];
		
		System.out.printf("The string: %s", str);
		System.out.printf("\nIts length: %d", str.length());
		System.out.print("\nThe string reversed: ");
		
		for (int count = str.length() - 1; count >= 0; count--)
			System.out.printf("%c  ", str.charAt(count));
		
		str.getChars(0, 5, array, 0); // copy characters from the string into the array named array
		System.out.print("\nThe array named array: ");
		
		for (char character : array)
			System.out.print(character + "  ");
		
		System.out.println();
	} // end main
} // end class L9_5