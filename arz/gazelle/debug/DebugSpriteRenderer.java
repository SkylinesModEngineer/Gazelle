package arz.gazelle.debug;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import arz.gazelle.api.IRenderable;
import arz.gazelle.gdx.graphics.GazelleAtlas;
import arz.gazelle.gdx.graphics.GazelleSprite;

@DebugAll
public class DebugSpriteRenderer implements IRenderable
{
	private List<Sprite> sprites = new ArrayList<Sprite>();
	private float totalTime = 0;
	private GazelleAtlas atlas;

	public DebugSpriteRenderer()
	{
		
	}
	public void initSprites()
	{
		
		
	}
	@Override
	public void update(float update)
	{
		
	}
	@Override
	public void render(SpriteBatch batch)
	{
		//totalTime += Gdx.graphics.getDeltaTime();
		
		
		
	}
	
	

}
