package tycoongame;

import arz.gazelle.gdx.renderer.AbstractTerrainTextures;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TycoonTerrainTextures extends AbstractTerrainTextures<TycoonTerrainModel>
{
	public TextureRegion[] textures;
	
	public TycoonTerrainTextures(TycoonTerrainModel model)
	{
		super(model);
		textures = new TextureRegion[model.getTerrainModel().length];
		textures[model.DEFAULT] = new TextureRegion();
		
		
	}
	@Override
	public TextureRegion[] getModelTextures()
	{
		// TODO Auto-generated method stub
		return textures;
	}
	@Override
	public int getModelTileSize() {
		// TODO Auto-generated method stub
		return 32;
	}
	
	
	
	

}
