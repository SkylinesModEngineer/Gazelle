package arz.gazelle.game.terrain;

import arz.gazelle.gdx.renderer.ITerrainTextures;


public interface ITerrainModel
{
	public TerrainModel[] getTerrainModel();
	public void setTerrainTextures(ITerrainTextures textures);
}
