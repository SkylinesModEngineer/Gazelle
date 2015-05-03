package arz.gazelle.debug;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class GazelleLogger
{
	private static final String root = "logging";
	private static String sub = "default";
	private static ArrayList<Log> logList = new ArrayList<Log>();
	private static File file;
	
	private static boolean initialised;
	
	private enum LogLevel
	{
		DEBUG("Debug"),
		ERROR("Error"),
		WARNING("Warning"),
		INFO("Info"),
		VERBOS("Verbos");
		
		private String name;
		LogLevel(String name)
		{
			this.name = name;
		}
		String getName(){return name;}
	}
	
	static boolean toConsole = false;
	private GazelleLogger(){}
	public static void toConsole(boolean b)
	{
		toConsole = b;
	}
	
	private static void log(LogLevel type, String string)
	{
		//log it
		String t = type.getName();
		Log log = new Log(t, string);
		logList.add(log);
		//push it needed
		if(toConsole)
			pushConsole(log);
		
	}
	
	public void flush()
	{
		
	}
	private static void pushConsole(String format, Object... arg)
	{
		pushConsole(String.format(format, arg));
	}
	private static void pushConsole(String string)
	{
		System.out.println(string);
	}
	
	private static void pushConsole(Log log)
	{
		System.out.println(log.toString());
	}
	//TODO might change to comething else for more control
	public static void setToConsole(boolean b)
	{
		toConsole = b;
	}
	public static void DEBUG(String string)
	{
		log(LogLevel.DEBUG, string);
	}
	public static void ERROR(String string)
	{
		log(LogLevel.ERROR, string);
	}
	public static void INFO(String string)
	{
		log(LogLevel.INFO, string);
	}
	public static void WARNING(String string)
	{
		log(LogLevel.WARNING, string);
	}
	public static void VERBOS(String string)
	{
		log(LogLevel.VERBOS, string);
	}
	//printf versions, they call the X(string) version
	public static void DEBUG(String format, Object... arg)
	{
		DEBUG(String.format(format, arg));
	}
	public static void INFO(String format, Object... arg)
	{
		INFO(String.format(format, arg));
	}
	public static void WARNING(String format, Object... arg)
	{
		WARNING(String.format(format, arg));
	}
	public static void VERBOS(String format, Object... arg)
	{
		VERBOS(String.format(format, arg));
	}
	public static void ERROR(String format, Object... arg)
	{
		ERROR(String.format(format, arg));
	}
	//class version of debug
	public static void OBJECT(Object object) throws IllegalArgumentException, IllegalAccessException
	{
		breakLine(10);
		pushConsole("[%s]",GazelleLogger.timeStamp(null));
		pushConsole("[%s]", object.getClass().getName());
		Field[] fields = object.getClass().getDeclaredFields();
		DebugAll logAll = object.getClass().getAnnotation(DebugAll.class);
		
		for(int i=0; i < fields.length; i++)
		{
			
			Field currentField = fields[i];
			boolean visibility = currentField.isAccessible();
			currentField.setAccessible(true);
			DebugField logField = currentField.getAnnotation(DebugField.class);
			Object fieldValue = currentField.get(object);
			if(fieldValue == null)
				fieldValue = new String("null");
			if(logAll != null)
				pushConsole("%s: %s", currentField.getName(), fieldValue.toString());
			else if(logField != null)
				pushConsole("%s: %s", currentField.getName(), fieldValue.toString());
			currentField.setAccessible(visibility);
		}
		breakLine(10);
	}
	
	private static void breakLine(int num)
	{
		for(int i=0; i < num; i++)
			System.out.print("-");
		System.out.println();
	}
	//helper methods
	static String dateStamp(Calendar cal)
	{
		if(cal == null)
			cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return String.format("%d/%d/%d", day, month, year);
	}
	static String dateTimeStamp(Calendar cal)
	{
		return String.format("%s %s", dateStamp(cal), timeStamp(cal));
	}
	static String timeStamp(Calendar cal)
	{
		if(cal == null)
			cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		return String.format("%d:%d:%d", hour, min, sec);
	}
	static String date2TimeStamp(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return timeStamp(cal);
	}
	static String date2DateStamp(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return dateStamp(cal);
	}
	static String date2DateTimeStamp(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return dateTimeStamp(cal);
	}


	
}
