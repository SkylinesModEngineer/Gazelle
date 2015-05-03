package projecthomeland;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import arz.gazelle.gdx.graphics.GazelleAtlas;
import arz.gazelle.gdx.renderer.AbstractTextureModel;
import arz.gazelle.gdx.texture.GazelleLoader;

public class HomeLandModel extends AbstractTextureModel<HomeLandTerrainModel>
{
	private TextureRegion[] textures;
	private final int TILE_SIZE = 32;
	
	public HomeLandModel(HomeLandTerrainModel model)
	{
		super(model);
		GazelleAtlas atlas = GazelleLoader.loadAtlas("tileset.png", TILE_SIZE);
		textures = new TextureRegion[model.modelArray.length];
		
		textures[model.DEFAULT] = atlas.getTextureRegion(0, 0);
		textures[model.GRASS] = atlas.getTextureRegion(0, 1);
		textures[model.GROUND] = atlas.getTextureRegion(0, 2);
	}
	@Override
	public TextureRegion[] getModelTextures()
	{
		return textures;
	}
	@Override
	public int getModelTileSize() {
		// TODO Auto-generated method stub
		return TILE_SIZE;
	}

}
