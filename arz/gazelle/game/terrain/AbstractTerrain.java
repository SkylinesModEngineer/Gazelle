package arz.gazelle.game.terrain;

public abstract class AbstractTerrain implements ITerrain
{
	protected TerrainModel model;
	protected int terrainID;
	protected final int x;
	protected final int y;
	
	public AbstractTerrain(TerrainModel model, int x, int y)
	{
		this.terrainID = model.getTextureID();
		this.x = x;
		this.y = y;
		this.model = model;
	}
	public int getX(){return x;}
	public int getY(){return y;}
	
	@Override
	public int getTerrainID() 
	{
		return terrainID;
	}
	public void setTerrainModel(TerrainModel model)
	{
		this.terrainID = model.getTextureID();
		this.model = model;
	}
	protected TerrainModel getTerrainModel()
	{
		return model;
	}

}
