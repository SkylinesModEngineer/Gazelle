package arz.gazelle.game.world;

import arz.gazelle.api.GazelleViewportListenter;
import arz.gazelle.gdx.graphics.GazelleSpriteBatch;
import arz.gazelle.gdx.view.GazelleCamera;
import arz.gazelle.gdx.view.GazelleView;
import arz.gazelle.gdx.view.GazelleViewport;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector3;

public class GazelleWorldScreen implements Screen, GazelleViewportListenter
{
	private GazelleSpriteBatch renderer;
	
	private GazelleTerrainMap terrain;
	private GazelleObjectMap objects;
	private GazelleView gameView;
	
	@Override
	public void show()
	{
		gameView = new GazelleView(100, 100, new Vector3(0, 0, 0));
		renderer.setGameView(gameView);
		
		terrain = new GazelleTerrainMap();
		objects = new GazelleObjectMap();
		terrain.setup();
		objects.setup();
	}
	public void update()
	{
		
	}
	@Override
	public void render(float delta) 
	{
		terrain.render(delta, renderer);
		objects.render(delta, renderer);
	}
	@Override
	public void resize(int width, int height)
	{
		gameView.resize(width, height);
	}
	@Override
	public void pause()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resume() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hide()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OnViewportUpdate(GazelleViewport viewport, GazelleCamera camera) 
	{
		
	}
	
	
	
}
