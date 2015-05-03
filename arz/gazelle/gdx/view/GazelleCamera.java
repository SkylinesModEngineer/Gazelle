package arz.gazelle.gdx.view;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class GazelleCamera extends OrthographicCamera
{
	private ICameraController controller;

	GazelleCamera()
	{
		
	}
	void setCameraController(ICameraController controller)
	{
		this.controller = controller;
	}
	void control()
	{
		if(controller != null)
		{
			controller.control(this);
			update();
		}
	}
	
	

}
