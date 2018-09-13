//2018.01.04, jhtp8LOV_ch08.pptx, P25 & 26 + P33-37 + P108 & 109, class Time (with 5 programmer-declared overloaded constructors) that can set time

package L14.L14_1.Time;

public class Time
{
	private int hour, minute, second;
	
	//no-argument constructor Time (each instance variable initialised to 0)
	public Time()
	{
		this( 0, 0, 0 ); //invoke 3-argument constructor Time
	} //end constructor Time
	
	//1-argument constructor Time (hour supplied, minute and second defaulted to 0)
	public Time( int hour )
	{
		this( hour, 0, 0 ); //invoke 3-argument constructor Time
	} //end constructor Time
	
	//2-argument constructor Time (hour and minute supplied, second defaulted to 0)
	public Time( int hour, int minute )
	{
		this( hour, minute, 0 ); //invoke 3-argument constructor Time
	} //end constructor Time
	
	//3-argument constructor Time (hour, minute and second supplied)
	public Time( int hour, int minute, int second )
	{
		setTime( hour, minute, second ); //call the specified method to validate and set time
	} //end constructor Time
	
	public Time( Time settings ) //constructor Time with a Time object argument (another Time object supplied)
	{
	    /**
	     * invoke 3-argument constructor Time
	     * call the specified methods to get hour, minute and second
	     */
		this( settings.getHour(), settings.getMinute(), settings.getSecond() );
	} //end constructor Time
	
	/**
	 * Validate and set time.
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public void setTime( int hour, int minute, int second )
	{
		setHour( hour ); //call the specified method to validate and set hour
	    setMinute( minute ); //call the specified method to validate and set minute
	    setSecond( second ); //call the specified method to validate and set second
	} //end method setTime
	
	/**
	 * Validate and set hour.
	 * @param hour
	 */
	public void setHour( int hour )
	{
		this.hour = ( ( hour >= 0 && hour < 24 ) ? hour : 0 ); //use the 24-hour time system and any invalid value set to 0 to ensure that the data remains consistent
	} //end method setHour
	
	/**
	 * Validate and set minute.
	 * @param minute
	 */
	public void setMinute( int minute )
	{
		this.minute = ( ( minute >= 0 && minute < 60 ) ? minute : 0 ); //any invalid value set to 0 to ensure that the data remains consistent
	} //end method setMinute
	
	/**
	 * Validate and set second.
	 * @param second
	 */
	public void setSecond( int second )
	{
		this.second = ( ( second >= 0 && second < 60 ) ? second : 0 ); //any invalid value set to 0 to ensure that the data remains consistent
	} //end method setSecond
	
	/**
	 * Get hour.
	 * @return hour
	 */
	public int getHour()
	{
		return hour; 
	} //end method getHour
	
	/**
	 * Get minute.
	 * @return minute
	 */
	public int getMinute()
	{
		return minute; 
	} //end method getMinute
	
	/**
	 * Get second.
	 * @return second
	 */
	public int getSecond()
	{
		return second; 
	} //end method getSecond
	
	/**
	 * Convert time to a string in 24-hour format.
	 * @return the string in 24-hour format
	 */
	public String toString_24HourFormat()
	{
		return String.format( "%02d:%02d:%02d", getHour(), getMinute(), getSecond() ); //call the specified methods to get hour, minute and second
	} //end method toString_24HourFormat
	
	/**
	 * Convert time to a string in 12-hour format.
	 * @return the string in 12-hour format
	 */
	public String toString_12HourFormat()
	{
		return String.format( "%d:%02d:%02d %s", ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ), getMinute(), getSecond(), ( ( getHour() >= 0 && getHour() < 12 ) ? "AM" : "PM" ) );
	} //end method toString_12HourFormat
} //end class Time