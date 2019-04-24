// jhtp8LOV_ch08.pptx, P126 - 128, program that uses package access which is rarely used and is not recommended to use

package L14;

public class L14_2
{
	public static void main(String[] args)
	{
		PackageAccessExample test = new PackageAccessExample(); // create a PackageAccessExample object and assign it to "test"
		
	    System.out.printf("After instantiation:\n  %s\n", test);
	    
	    // change package-access data in the PackageAccessExample object
	    test.number = 77;
	    test.str = "Goodbye";
	    
	    System.out.printf("\nAfter changing values:\n  %s\n", test);
	} // end main
} // end class L14_2

// class with package-access instance variables can be used only by other classes in the same directory
class PackageAccessExample
{
	public PackageAccessExample()
	{
		number = 0;
		str = "Hello";
	} // end constructor PackageAccessExample
	
	int number;
	String str;
	
	public String toString()
	{
		return String.format("number: %d\n  string: %s", number, str);
	} // end method toString
} // end class PackageAccessExample