package arz.gazelle.game.terrain;

public class TerrainModel
{
	private int textureID;
	private String name;
	
	public TerrainModel(String name, int textureID)
	{
		this.textureID = textureID;
		this.name = name;
	}
	int getTextureID()
	{
		return textureID;
	}
	String getName()
	{
		return name;
	}
	
}
