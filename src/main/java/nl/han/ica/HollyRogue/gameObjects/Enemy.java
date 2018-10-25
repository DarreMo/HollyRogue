package nl.han.ica.HollyRogue.gameObjects;

import nl.han.ica.HollyRogue.HollyRogue;

/**
 * Created by timon on 25-10-2018.
 */
public class Enemy extends Movable{
    private HollyRogue world;
    private String image;

    public Enemy(HollyRogue world, String image) {
        super(world, image);
    }

    @Override
    public void update() {


    }
}
