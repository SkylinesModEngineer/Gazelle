package arz.gazelle.api;

import arz.gazelle.gdx.view.GazelleCamera;
import arz.gazelle.gdx.view.GazelleViewport;

public interface GazelleViewportListenter
{
	public void OnViewportUpdate(GazelleViewport viewport, GazelleCamera camera);
}
