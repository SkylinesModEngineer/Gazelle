package arz.gazelle.debug;

import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Date;


public class Log
{
	private String line;
	private Date date;
	private String type;
	
	public Log(String type, String line)
	{
		this.line = line;
		this.type = type;
		this.date = Calendar.getInstance().getTime();
	}
	public String getLine()
	{
		return String.format("[%s] %s", GazelleLogger.date2TimeStamp(date), line);
	}
	public String toString()
	{
		return String.format("[%s][%s] %s", type, GazelleLogger.date2TimeStamp(date), line);
		
		
	}
	public void test()
	{
		Constructor<?>[] cons = getClass().getDeclaredConstructors();
	}
	
}
