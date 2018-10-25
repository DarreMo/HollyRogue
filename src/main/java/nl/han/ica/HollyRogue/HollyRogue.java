package nl.han.ica.HollyRogue;

import javazoom.spi.mpeg.sampled.file.tag.StringableTag;
import nl.han.ica.HollyRogue.tiles.WallTile;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;

public class HollyRogue extends GameEngine {
    private Player player;
    private TileMap tileMap;

    public static String MEDIA_URL = "src/main/java/nl/han/ica/HollyRogue/media/";

    public static void main(String[] args) {
        HollyRogue hr = new HollyRogue();
        hr.runSketch();
    }

    @Override
    public void setupGame() {
        int worldWidth = 500;
        int worldHeight = 500;

        player = new Player(this);
        addGameObject(player, 200, 200);

        View view = new View(worldWidth, worldHeight);

        setView(view);
        size(worldWidth, worldHeight);
    }

    private void initializeTileMap() {
        //Sprite Loading
        Sprite wallSprite = new Sprite(this.MEDIA_URL.concat("Sprite.png"));

        TileType<WallTile> wallTileType = new TileType<>(WallTile.class, wallSprite);

        TileType[] tileTypes = {wallTileType};
        int tileSize = 64;
        int tilesMap[][] = {
                {-1, -1, -1, -1, -1, -1, -1, },
                {-1, -1, -1, -1, -1, -1, -1, },
                {-1, -1, -1, -1, -1, -1, -1, },
                {-1, -1, -1, -1, -1, -1, -1, },
                {0, 0, 0, 0, 0, 0, 0, },
                {-1, -1, -1, -1, -1, -1, -1, },
                {-1, -1, -1, -1, -1, -1, -1, },
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
    }



    @Override
    public void update() {
        // Dit doet nog niets

    }

}