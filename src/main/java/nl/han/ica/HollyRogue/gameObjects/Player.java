package nl.han.ica.HollyRogue.gameObjects;

import nl.han.ica.HollyRogue.HollyRogue;
import nl.han.ica.HollyRogue.tiles.WallTile;
import nl.han.ica.oopg.collision.CollidedTile;
import nl.han.ica.oopg.collision.CollisionSide;
import nl.han.ica.oopg.collision.ICollidableWithTiles;
import nl.han.ica.oopg.exceptions.TileNotFoundException;
import nl.han.ica.oopg.userinput.IKeyInput;
import processing.core.PVector;

import java.util.List;

public class Player extends Movable implements IKeyInput,ICollidableWithTiles {
    private HollyRogue world;
    private String image;
    private float walkSpeed = 0.5f;
    private float gravity;

    public Player(HollyRogue world, String image) {
        super(world, image);
    }

    public void keyPressed(int keyCode, char key) {

        switch(keyCode) {
            case (LEFT):
                setxSpeed(-walkSpeed);
                break;
            case (RIGHT):
                setxSpeed(walkSpeed);
                break;
            case (UP):
                setySpeed(-walkSpeed);
                gravity = 0.2f;
                setGravity(gravity);
                break;
            case (DOWN):
                setySpeed(walkSpeed);
                break;
            default:
        }

    }

    public void keyReleased(int keyCode, char key) {
        if (keyCode == LEFT || keyCode == RIGHT) {
            setxSpeed(0);
        }
        if (keyCode == UP || keyCode == DOWN) {
            setySpeed(0);
        }
    }

    @Override
    public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {
        PVector vector;
        for (CollidedTile ct : collidedTiles) {
            if (ct.getTile() instanceof WallTile) {
                try {
                    vector = world.getTileMap().getTilePixelLocation(ct.getTile());
                    setY(vector.y - getHeight());
                } catch (TileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }
//    @Override
//    public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {
//        PVector vector;
//        for (CollidedTile ct : collidedTiles) {
//            if (ct.getTile() instanceof WallTile) {
//                switch (ct.getCollisionSide()){
//                    case TOP:
//                        try {
//                        vector = world.getTileMap().getTilePixelLocation(ct.getTile());
//                        setY(vector.y + this.getHeight());
//                        setySpeed(0);
//                        } catch (TileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                        break;
//                    case BOTTOM:
//                        try {
//                            vector = world.getTileMap().getTilePixelLocation(ct.getTile());
//                            setY(vector.y - getHeight());
//                        } catch (TileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                        break;
//                    case LEFT:
//                        try {
//                            vector = world.getTileMap().getTilePixelLocation(ct.getTile());
//                            setX(vector.x + getWidth());
//                        } catch (TileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                        break;
//                    case RIGHT:
//                        try {
//                            vector = world.getTileMap().getTilePixelLocation(ct.getTile());
//                            setX(vector.x + getWidth());
//                        } catch (TileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                        break;
//                }
//
//            }
//        }
//
//    }


    @Override
    public void update() {


    }

}
