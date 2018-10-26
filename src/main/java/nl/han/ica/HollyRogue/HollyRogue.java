package nl.han.ica.HollyRogue;

import nl.han.ica.HollyRogue.gameObjects.Player;
import nl.han.ica.HollyRogue.tiles.FloorTile;
import nl.han.ica.HollyRogue.tiles.WallTile;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.CenterFollowingViewport;
import nl.han.ica.oopg.view.View;

public class HollyRogue extends GameEngine {
    private Player player;
    private TileType[] tileTypes;

    public static String MEDIA_URL = "src/main/java/nl/han/ica/HollyRogue/media/";

    public static void main(String[] args) {
        HollyRogue hr = new HollyRogue();
        hr.runSketch();
    }

    @Override
    public void setupGame() {
        int worldWidth = 1280;
        int worldHeight = 720;

        player = new Player(this, "player.png");
        addGameObject(player, 200, 200);

//        View view = new View(worldWidth, worldHeight);

        CenterFollowingViewport viewPort = new CenterFollowingViewport(player, 500,500);
        View view = new View(viewPort, worldWidth, worldHeight);

        setView(view);
        size(worldWidth, worldHeight);

//        tileTypes = loadTiles(tileTypes);

        initializeTileMap();
    }

//    private TileType[] loadTiles(TileType[] tt){
//
//        Sprite wallSprite = new Sprite(this.MEDIA_URL.concat("Wall.png"));
//        Sprite testSprite = new Sprite(this.MEDIA_URL.concat("temp.png"));
//        TileType<WallTile> wallTileType = new TileType<>(WallTile.class, wallSprite);
//        TileType<FloorTile> boardTileType = new TileType<>(FloorTile.class, testSprite);
//        return tt;
//    }

    private void initializeTileMap() {
        /* TILES */
        Sprite wallSprite = new Sprite(this.MEDIA_URL.concat("Wall.png"));
        Sprite testSprite = new Sprite(this.MEDIA_URL.concat("temp.png"));
        TileType<WallTile> wallTileType = new TileType<>(WallTile.class, wallSprite);
        TileType<FloorTile> boardTileType = new TileType<>(FloorTile.class, testSprite);

        TileType[] tileTypes = {wallTileType, boardTileType};
        int tileSize=25;
        int tilesMap[][]={
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                { 0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0},
                {  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
    }



    @Override
    public void update() {
        // Dit doet nog niets

    }

}