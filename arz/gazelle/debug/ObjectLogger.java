package arz.gazelle.debug;

public class ObjectLogger
{
	private boolean toConsole = true;
	private Object caller;
	private int pairPadding = 10;
	
	public ObjectLogger(Object caller)
	{
		this.caller = caller;
	}
	private void log(String line)
	{
		String log = String.format("[%s]%s", caller.getClass().getName(), line);
		if(toConsole)
			System.out.println(log);
	}
	private String pairValue(String val1, String val2)
	{
		String format = "%-" + pairPadding + "s: %s";
		String ret = String.format(format, val1, val2);
		return ret;
	}
	
	
	public <T> ObjectLogger(Class<T> c, boolean toConsole)
	{
		this(c);
		this.toConsole = toConsole;
	}
	
	public void ISINIT(String name, Object object)
	{
		String ret = "";
		if(object != null)
			ret = pairValue(name, "init");
		else
			ret = pairValue(name, "NULL");
		log(ret);
	}
	public void DEBUG(String line)
	{
		log(line);
	}
	public void DEBUG(String format, Object...args)
	{
		DEBUG(String.format(format, args));
	}
}
