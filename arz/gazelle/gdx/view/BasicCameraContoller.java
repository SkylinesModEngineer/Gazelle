package arz.gazelle.gdx.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class BasicCameraContoller implements ICameraController
{
	private final int speed = 10;
	private final float zoom = 0.1f;
	
	
	@Override
	public void control(GazelleCamera camera)
	{
		if(Gdx.input.isKeyPressed(Keys.A))
			camera.position.x -= speed;
		
		if(Gdx.input.isKeyPressed(Keys.D))
			camera.position.x += speed;
		
		if(Gdx.input.isKeyPressed(Keys.W))
			camera.position.y += speed;
		if(Gdx.input.isKeyPressed(Keys.S))
			camera.position.y -= speed;
		
		
		if(Gdx.input.isKeyPressed(Keys.I))
			camera.zoom -= zoom;
		if(Gdx.input.isKeyPressed(Keys.K))
			camera.zoom += zoom;
		if(camera.zoom < 1)
			camera.zoom = 1;
	
	}
}
