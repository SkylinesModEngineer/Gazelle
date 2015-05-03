package villageGame;

import arz.gazelle.game.terrain.AbstractTerrainModel;
import arz.gazelle.game.terrain.TerrainModel;

public class VillageTerrainModel extends AbstractTerrainModel
{
	public final int DEFAULT = 0;
	public final int GRASS = 1;
	public final int SAND = 2;
	public final int DIRT = 3;
	public final int WATER = 4;
	
	private TerrainModel[] model;
	
	public VillageTerrainModel()
	{
		model = new TerrainModel[5];
		model[DEFAULT] = new TerrainModel("Default", DEFAULT);
		model[GRASS] = new TerrainModel("Grass", GRASS);
		model[SAND] = new TerrainModel("Sand", SAND);
		model[DIRT] = new TerrainModel("Dirt", DIRT);
		model[WATER] = new TerrainModel("Water", WATER);
	}
	
	
	@Override
	public TerrainModel[] getTerrainModel()
	{	
		return model;
	}

}
