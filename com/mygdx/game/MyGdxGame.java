package com.mygdx.game;




import tycoongame.TycoonTerrainModel;
import tycoongame.TycoonTerrainTextures;
import villageGame.VillageTerrain;
import villageGame.VillageTerrainModel;
import villageGame.VillageTerrainTexture;
import arz.gazelle.debug.DebugAll;
import arz.gazelle.debug.GazelleLogger;
import arz.gazelle.game.terrain.ITerrainModel;
import arz.gazelle.game.terrain.TerrainModel;
import arz.gazelle.gdx.renderer.AbstractTerrainTextures;
import arz.gazelle.gdx.renderer.ITerrainTextures;
import arz.gazelle.gdx.view.BasicCameraContoller;
import arz.gazelle.gdx.view.GazelleView;
import arz.gazelle.gdx.view.ICameraController;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

@DebugAll
public class MyGdxGame extends Game
{
	private VillageTerrainModel model;
	private VillageTerrainTexture textures;
	
	private TextureRegion[] terrainTextures;
	private TerrainModel[] terrainModel;
	
	private VillageTerrain[][] map;
	private SpriteBatch batch;
	private GazelleView view;
	private ICameraController controller;
	
	@Override
	public void create () 
	{
		model = new VillageTerrainModel();
		textures = new VillageTerrainTexture(model);
		model.setTerrainTextures(textures);
		
		terrainModel = model.getTerrainModel();
		terrainTextures = model.getTextures().getModelTextures();
		
		map = new VillageTerrain[100][100];
		batch = new SpriteBatch();
		view = new GazelleView(100, 100, new Vector3(0, 0, 0));
		
		for(int x=0, px=0; x < 100; x++, px+= 32)
		{
			for(int y=0,py=0; y < 100; y++, py+= 32)
			{
				
				map[x][y] = new VillageTerrain(terrainModel[model.GRASS], px, py);
			}
		}
		map[5][8].setTerrainModel(terrainModel[2]);
		
		controller = new BasicCameraContoller();
		view.setCameraController(controller);
		
		try {
			GazelleLogger.OBJECT(this);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void render ()
	{
		Gdx.graphics.getGL20().glClearColor(0, 0, 0, 1 );
		Gdx.graphics.getGL20().glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
		view.setProjectionMatrix(batch);
		view.updateView();
		batch.begin();
		for(int x=0; x < 100; x++)
		{
			for (int y=0; y < 100; y++)
			{
				VillageTerrain t = map[x][y];
				batch.draw(terrainTextures[t.getTerrainID()], t.getX(), t.getY());
			}
		}
		batch.end();
	}
}
