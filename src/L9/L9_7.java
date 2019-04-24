// jhtp8LOV_ch06.pptx, P118 - 120, program that uses methods startsWith and endsWith from class String

package L9;

public class L9_7
{
	public static void main(String[] args)
	{
		String[] array = {"started", "starting", "ended", "ending"};
		
		for (String str : array)
		{
			if (str.startsWith("st"))
				System.out.printf("\"%s\" starts with \"st\".\n", str);
		} // end for
		
		System.out.println();
		
		for (String str : array)
		{
			if (str.startsWith("art", 2))
				System.out.printf("\"%s\" starts with \"art\" at Position 2.\n", str);
		} // end for
		
		System.out.println();
		
		for (String str : array)
		{
			if (str.endsWith("ed"))
				System.out.printf("\"%s\" ends with \"ed\".\n", str);
		} // end for
	} // end main
} // end class L9_7