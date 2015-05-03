package arz.gazalle.testbed;

public class Terrain
{
	private int index;
	private String name;
	
	public Terrain(int index, String name)
	{
		this.name = name;
		this.index = index;
	}
	public String getName()
	{
		return name;
	}
	public int getIndex()
	{
		return index;
	}
}
