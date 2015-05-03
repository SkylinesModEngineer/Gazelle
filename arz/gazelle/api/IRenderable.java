package arz.gazelle.api;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface IRenderable
{
	public void update(float delta);
	public void render(SpriteBatch batch);
	
}
