package arz.gazelle.gdx.graphics;

import arz.gazelle.gdx.view.GazelleView;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GazelleSpriteBatch extends SpriteBatch
{
	public GazelleSpriteBatch()
	{
		super();
	}
	public void setGameView(GazelleView view)
	{
		view.setProjectionMatrix(this);
	}
}
