package tycoongame;

import arz.gazelle.game.terrain.AbstractTerrain;
import arz.gazelle.game.terrain.TerrainModel;

public class TycoonTerrain extends AbstractTerrain
{

	public TycoonTerrain(TerrainModel model, int x, int y)
	{
		super(model, x, y);
	}
	@Override
	protected AbstractTerrain copy() 
	{
		return new TycoonTerrain(this.model, this.x, this.x);
	}

	

}
