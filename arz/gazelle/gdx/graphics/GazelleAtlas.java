package arz.gazelle.gdx.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GazelleAtlas
{
	private TextureRegion[][] textures;
	
	
	public GazelleAtlas(Texture atlas, int size)
	{
		AtlasRegion region = new AtlasRegion(atlas, 0, 0, atlas.getWidth(), atlas.getHeight());
		textures = region.split(size, size);
		
	}
	public TextureRegion getTextureRegion(int x, int y)
	{
		return textures[x][y];
	}
}

