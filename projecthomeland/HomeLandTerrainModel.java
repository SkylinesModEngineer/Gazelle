package projecthomeland;

import arz.gazelle.game.terrain.ITerrainModel;
import arz.gazelle.game.terrain.TerrainModel;

public class HomeLandTerrainModel implements ITerrainModel
{
	public final int DEFAULT = 0;
	public final int GROUND = 1;
	public final int GRASS = 2;
	public final int SAND = 3;
	public final TerrainModel[] modelArray;
	
	public HomeLandTerrainModel()
	{
		modelArray = new TerrainModel[4];
		modelArray[DEFAULT] = new TerrainModel("Default", DEFAULT);
		modelArray[GROUND] = new TerrainModel("Ground", GROUND);
		modelArray[GRASS] = new TerrainModel("Grass", GRASS);
		modelArray[SAND] = new TerrainModel("Sand", SAND);
	}
	
	@Override
	public TerrainModel[] getTerrainModel()
	{
		return modelArray;
	}
}
