package projecthomeland;

import arz.gazelle.game.terrain.AbstractTerrain;
import arz.gazelle.game.terrain.TerrainModel;

public class HomeLandTerrain extends AbstractTerrain
{
	public HomeLandTerrain(TerrainModel model, int x, int y) {
		super(model, x, y);
	}

	@Override
	protected AbstractTerrain copy()
	{
		return new HomeLandTerrain(this.model, this.x, this.y);
	}

	

}
