package tycoongame;

import arz.gazelle.game.terrain.AbstractTerrainModel;
import arz.gazelle.game.terrain.TerrainModel;

public class TycoonTerrainModel extends AbstractTerrainModel
{
	private TerrainModel[] model;
	public final int DEFAULT = 0;
	public final int GRASS = 1;
	public final int SAND = 2;
	public final int DIRT = 3;
	public final int FISH = 4;
	
	public TycoonTerrainModel()
	{
		model = new TerrainModel[5];
		model[DEFAULT] = new TerrainModel("Default", DEFAULT);
		model[GRASS] = new TerrainModel("Default", GRASS);
		model[SAND] = new TerrainModel("Default", SAND);
		model[DIRT] = new TerrainModel("Default", DIRT);
		model[FISH] = new TerrainModel("Fish", FISH);
	}

	@Override
	public TerrainModel[] getTerrainModel() {
		// TODO Auto-generated method stub
		return model;
		
	}

}
