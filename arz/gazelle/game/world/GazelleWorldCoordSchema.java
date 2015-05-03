package arz.gazelle.game.world;

public class GazelleWorldCoordSchema
{
	private int tileSize;
	
	private int maxY;
	private int maxX;
	
	public GazelleWorldCoordSchema(int width, int height, int tileSize)
	{
		this.tileSize = tileSize;
		this.maxY = height * tileSize;
		this.maxX = width * tileSize;
	}
	private boolean isInsideWorld(int pixelX, int pixelY)
	{
		if(pixelX < 0 || pixelY < 0)
			return false;
		if(pixelX > maxX || pixelY > maxY)
			return false;
		return true;
	}
	//assumes pixel space in unprojected
	private boolean isInsideWorld(float x, float y) 
	{
		return isInsideWorld((int)x, (int)y);
	}
	public Grid2D toGrid(float x, float y)
	{
		return toGrid((int)x, (int)y);
	}
	public Grid2D toGrid(int x, int y)
	{
		if(isInsideWorld(x, y))
			return new Grid2D(x / tileSize, y / tileSize);
		return null;
	}
	
}