package nl.han.ica.HollyRogue.gameObjects;

import nl.han.ica.HollyRogue.HollyRogue;

public class Player extends Movable {
    private HollyRogue world;
    private String image;

    public Player(HollyRogue world, String image) {
        super(world, image);
    }

    @Override
    public void update() {


    }

}
