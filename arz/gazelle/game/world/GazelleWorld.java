package arz.gazelle.game.world;

import arz.gazelle.gdx.view.GazelleView;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class GazelleWorld
{
	private GazelleView worldView;
	private GazelleWorldCoordSchema coordSchema;
	
	public GazelleWorld(GazelleView worldView, GazelleWorldCoordSchema coordSchema)
	{
		this.worldView = worldView;
		this.coordSchema = coordSchema;
	}
	//TODO debug methods
	public GazelleView getView()
	{
		return worldView;
	}
	public GazelleWorldCoordSchema getCoord()
	{
		return coordSchema;
	}
	
}
