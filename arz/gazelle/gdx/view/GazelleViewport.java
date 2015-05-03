package arz.gazelle.gdx.view;

public class GazelleViewport
{
	private int width;
	private int height;
	private GazelleViewportListenter listener;
	
	
	GazelleViewport(int width, int height)
	{
		this.width = width;
		this.height = height;
		update();
	}
	void resize(int width2, int height2) 
	{
		width = width2;
		height = height2;
		update();
	}
	void setViewportListener(GazelleViewportListenter listener)
	{
		this.listener = listener;
		update();
	}
	void update()
	{
		if(listener != null)
			listener.OnViewportUpdate(this, width, height);
	}
}
