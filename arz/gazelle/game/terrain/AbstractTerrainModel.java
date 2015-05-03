package arz.gazelle.game.terrain;

import arz.gazelle.gdx.renderer.ITerrainTextures;

public abstract class AbstractTerrainModel
	implements ITerrainModel
{
	private ITerrainTextures textureModel;
	
	public ITerrainTextures getTextures()
	{
		return textureModel;
	}
	public void setTerrainTextures(ITerrainTextures textures)
	{
		this.textureModel = textures;
	}
}
