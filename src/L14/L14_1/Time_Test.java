// jhtp8LOV_ch08.pptx, P38 - 40 + P114 & 115, program that creates and manipulates 6 Time objects

package L14.L14_1;

import L14.L14_1.Time.Time;

public class Time_Test
{
	public static void main( String[] args )
	{
		Time time1 = new Time(); // create a Time object and assign it to "time1"
	    Time time2 = new Time(2); //create a Time object and assign it to "time2"
	    Time time3 = new Time(21, 34); // create a Time object and assign it to "time3"
	    Time time4 = new Time(12, 25, 42); // create a Time object and assign it to "time4"
	    Time time5 = new Time(27, 74, 99); // create a Time object and assign it to "time5"
	    Time time6 = new Time(time4); // create a Time object and assign it to "time6"

	    System.out.println("Time 1:\n" +
	                       "  24-hour format: " + time1.toString_24HourFormat() +
	                       "\n  12-hour format: " + time1.toString_12HourFormat());
	    System.out.println("\nTime 2:\n" +
                           "  24-hour format: " + time2.toString_24HourFormat() +
                           "\n  12-hour format: " + time2.toString_12HourFormat());
	    System.out.println("\nTime 3:\n" +
                           "  24-hour format: " + time3.toString_24HourFormat() +
                           "\n  12-hour format: " + time3.toString_12HourFormat());
	    System.out.println("\nTime 4:\n" +
                           "  24-hour format: " + time4.toString_24HourFormat() +
                           "\n  12-hour format: " + time4.toString_12HourFormat());
	    System.out.println("\nTime 5:\n" +
                           "  24-hour format: " + time5.toString_24HourFormat() +
                           "\n  12-hour format: " + time5.toString_12HourFormat());
	    System.out.println("\nTime 6:\n" +
                           "  24-hour format: " + time6.toString_24HourFormat() +
                           "\n  12-hour format: " + time6.toString_12HourFormat());
	} // end main
} // end class Time_Test