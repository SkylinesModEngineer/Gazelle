package arz.gazalle.testbed;

public class HomelandTerrain
{
	private final static Terrain[] terrain = new Terrain[64];
	public final static int GRASS1 = 			0;
	public final static int GRASS2 = 			1;
	public final static int SAND1 = 			1;
	public final static int SAND2=				0;
	public final static int WATER_SHALLOW = 	2;
	public final static int WATER_DEEP = 		3;
	public final static int DIRT1 = 			4;
	public final static int DIRT2=				0;
	public final static int TREE1=  			0;
	public final static int TREE2=				0;
	
	
	public HomelandTerrain()
	{
		terrain[GRASS1] = new Terrain(GRASS1, "Grass_1");
		terrain[GRASS2] = new Terrain(GRASS2, "Grass_2");
		terrain[SAND1] = new Terrain(SAND1, "Sand_1");
		terrain[SAND2] = new Terrain(SAND2, "Grass1");
		terrain[WATER_SHALLOW] = new Terrain(WATER_SHALLOW, "Water_shallow");
		terrain[WATER_DEEP] = new Terrain(GRASS1, "Grass1");
		terrain[DIRT1] = new Terrain(GRASS1, "Grass1");
		terrain[DIRT2] = new Terrain(GRASS1, "Grass1");
		terrain[TREE1] = new Terrain(GRASS1, "Grass1");
		terrain[TREE2] = new Terrain(GRASS1, "Grass1");
		
	}
}
