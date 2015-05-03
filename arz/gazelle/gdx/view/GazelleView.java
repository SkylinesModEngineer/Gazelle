package arz.gazelle.gdx.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class GazelleView implements GazelleViewportListenter
{
	private GazelleCamera camera;
	private GazelleViewport viewport;
	
	public GazelleView(int width, int height, Vector3 start)
	{
		camera = new GazelleCamera();
		viewport = new GazelleViewport(width, height);
		viewport.setViewportListener(this);
		camera.position.x = start.x;
		camera.position.y = start.y;
		camera.position.z = start.z;
		
		camera.update();
	}
	public void updateView()
	{
		camera.control();
	}
	public void setProjectionMatrix(SpriteBatch batch)
	{
		batch.setProjectionMatrix(camera.combined);
	}
	public void resize(int width, int height)
	{
		viewport.resize(width, height);
	}
	@Override
	public void OnViewportUpdate(GazelleViewport viewport, int width, int height)
	{
		camera.viewportWidth = width;
		camera.viewportHeight = height;
		camera.update();
	}
	public void setCameraController(ICameraController controller)
	{
		camera.setCameraController(controller);
	}
	public Vector3 unproject(Vector3 screen)
	{
		return camera.unproject(screen);
	}
	
	
}
