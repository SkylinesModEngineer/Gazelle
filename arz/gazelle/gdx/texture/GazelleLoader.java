package arz.gazelle.gdx.texture;

import java.util.HashMap;

import arz.gazelle.gdx.graphics.GazelleAtlas;

import com.badlogic.gdx.Gdx;

public class GazelleLoader 
{
	//private final static int MAX_TEXTURES = 256;
	//private final static Texture[] textures = new Texture[MAX_TEXTURES];
	private static HashMap<String, GazelleTexture> textures = new HashMap<String, GazelleTexture>();
	private static HashMap<String, GazelleAtlas> atlases = new HashMap<String, GazelleAtlas>();
	
	//if texture is already load wil just pass that texture back
	private static GazelleTexture loadTexture(String path)
	{
		GazelleTexture texture = textures.get(path);
		if(texture == null)
		{
			texture = new GazelleTexture(Gdx.files.internal(path));
			textures.put(path, texture);
		}
		return texture;
	}
	public static GazelleAtlas loadAtlas(String path, int size)
	{
		GazelleAtlas atlas = atlases.get(path);
		if(atlas == null)
		{
			atlas = new GazelleAtlas(loadTexture(path), size);
			atlases.put(path, atlas);
		}
		return atlas;
	}
	
	
}
