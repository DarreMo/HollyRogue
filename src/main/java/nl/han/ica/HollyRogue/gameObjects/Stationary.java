package nl.han.ica.HollyRogue.gameObjects;

import nl.han.ica.HollyRogue.HollyRogue;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

/**
 * Created by timon on 25-10-2018.
 */
public abstract class Stationary extends SpriteObject{
    private HollyRogue world;
    private String image;

    public Stationary(HollyRogue world, String image){
        super(new Sprite(world.MEDIA_URL.concat(image)));
    }
}
