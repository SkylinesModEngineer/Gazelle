package villageGame;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import arz.gazelle.exception.GazalleSetupException;
import arz.gazelle.gdx.graphics.GazelleAtlas;
import arz.gazelle.gdx.renderer.AbstractTerrainTextures;
import arz.gazelle.gdx.texture.GazelleLoader;

public class VillageTerrainTexture extends AbstractTerrainTextures<VillageTerrainModel>
{
	private TextureRegion[] textures;
	private final int TILE_SIZE = 32;
	
	public VillageTerrainTexture(VillageTerrainModel model)
	{
		super(model);
		GazelleAtlas atlas = GazelleLoader.loadAtlas("tileset.png", TILE_SIZE);
		textures = new TextureRegion[model.getTerrainModel().length];
		textures[model.DEFAULT] = atlas.getTextureRegion(0, 0);
		textures[model.DIRT] = atlas.getTextureRegion(0, 1);
		textures[model.GRASS] = atlas.getTextureRegion(0, 14);
		textures[model.SAND] = atlas.getTextureRegion(0, 3);
		textures[model.WATER] = atlas.getTextureRegion(0, 4);
	}

	@Override
	public TextureRegion[] getModelTextures() {
		// TODO Auto-generated method stub
		return textures;
	}

	@Override
	public int getModelTileSize() {
		// TODO Auto-generated method stub
		return TILE_SIZE;
	}

}
