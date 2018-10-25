package nl.han.ica.HollyRogue;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class Player extends SpriteObject {

    public Player(HollyRogue world) {
        // Met `.concat()` plak je 2 strings aan elkaar.
        // De methode returned een nieuwe String terug.
        super(new Sprite(HollyRogue.MEDIA_URL.concat("player.png")));
    }

    @Override
    public void update() {


    }

}
