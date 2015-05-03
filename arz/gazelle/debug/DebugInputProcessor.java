package arz.gazelle.debug;

import arz.gazelle.game.world.GazelleWorldCoordSchema;
import arz.gazelle.game.world.Grid2D;
import arz.gazelle.gdx.view.GazelleView;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;

public class DebugInputProcessor implements InputProcessor
{
	private boolean KEYDOWN = true;
	private boolean KEYUP = true;
	private ObjectLogger logger = new ObjectLogger(this);
	private GazelleWorldCoordSchema coord;
	private boolean MOUSEMOVED = false;
	private boolean TOUCHDRAGGED = false;
	private boolean TOUCHUP = false;
	private GazelleView worldView;
	
	public DebugInputProcessor(GazelleWorldCoordSchema coord, GazelleView worldView)
	{
		this.coord = coord;
		this.worldView = worldView;
		// TODO Auto-generated constr uctor stub
	}
	
	@Override
	public boolean keyDown(int keycode)
	{
		if(KEYDOWN)
			logger.DEBUG("Keydown: %d", keycode);
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		if(KEYUP)
			logger.DEBUG("Keydown: %d", keycode);
		return false;
	}

	@Override
	public boolean keyTyped(char character)
	{
		logger.DEBUG("Keytypes: %c", character);
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) 
	{
		logger.DEBUG("touchDown: x= %d, y= %d, point= %d, button= %d", screenX, screenY, pointer, button);
		
		Vector3 viewCoord = worldView.unproject(new Vector3(screenX, screenY, 0));
		Grid2D pos = coord.toGrid(viewCoord.x, viewCoord.y);
		if(pos != null)
			logger.DEBUG("unproject: (%dw,%d)", pos.x, pos.y);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		if(TOUCHUP)
			logger.DEBUG("touchUp: x= %d, y= %d, point= %d, button= %d", screenX, screenY, pointer, button);
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		if(TOUCHDRAGGED)
			logger.DEBUG("touchDragged: x= %d, y= %d, point= %d", screenX, screenY, pointer);
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		if(MOUSEMOVED)
		logger.DEBUG("mouseMoved: x= %d, y= %d", screenX, screenY);
		return false;
	}

	@Override
	public boolean scrolled(int amount) 
	{
		logger.DEBUG("scrolled: %d", amount);
		return false;
	}

}
