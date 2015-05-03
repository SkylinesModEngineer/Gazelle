package arz.gazelle.gdx.renderer;

import arz.gazelle.game.terrain.ITerrainModel;


public abstract class AbstractTerrainTextures<T extends ITerrainModel>
	implements ITerrainTextures
{
	private T model;
	
	
	public AbstractTerrainTextures(T model)
	{
		this.model = model;
		
	}
	
	public T getModel()
	{
		return model;
	}
	
	
	
}
