package arz.gazelle.debug;

import arz.gazelle.api.IRenderable;
import arz.gazelle.game.world.GazelleWorldCoordSchema;
import arz.gazelle.gdx.view.BasicCameraContoller;
import arz.gazelle.gdx.view.GazelleView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class DebugScreen implements Screen
{
	//private final CallManager updateCalls = new CallManager();
	//private DebugSpriteRenderer spriteRender;
	private SpriteBatch batch;
	private IRenderable spriteRenderer;
	private GazelleView view;
	private GazelleWorldCoordSchema coord;
	
	
	
	@Override
	public void show() 
	{
		batch = new SpriteBatch();
		//spriteRender = new DebugSpriteRenderer(batch);
		spriteRenderer = new DebugSpriteRenderer();
		view = new GazelleView(100, 100, new Vector3(0,0,0));
		view.setProjectionMatrix(batch);
		view.setCameraController(new BasicCameraContoller());
		coord = new GazelleWorldCoordSchema(10, 10, 32);
		Gdx.input.setInputProcessor(new DebugInputProcessor(coord, view));
	
		
	}
	public void update()
	{
		view.updateView();
		view.setProjectionMatrix(batch);
	}
	@Override
	public void render(float delta)
	{
		update();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		spriteRenderer.update(delta);
		spriteRenderer.render(batch);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
