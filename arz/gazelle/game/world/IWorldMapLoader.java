package arz.gazelle.game.world;

import java.io.File;

import arz.gazelle.game.terrain.AbstractTerrain;

public interface IWorldMapLoader<T extends AbstractTerrain>
{
	public T[][] loadMap(File file);
}
