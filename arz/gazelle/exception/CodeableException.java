package arz.gazelle.exception;

public class CodeableException extends RuntimeException
{
	private static final long serialVersionUID = 6486387548954797192L;

	public CodeableException(String format) 
	{
		super(format);
	}

}
