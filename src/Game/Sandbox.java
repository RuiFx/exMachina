package Game;
import Field.FieldCreator;
import Field.MapFactory;
import MenuRepresentation.MenuRepresentation;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static Field.MapFactory.wall6;


public class Sandbox {
    public static void main(String[] args) throws InterruptedException {


        FieldCreator field = new FieldCreator();

       // Picture map = new Picture(10, 10, "resources/map.jpg");
        Sound soundOne = new Sound("/Resources/sound/clipfalling.wav");
        soundOne.play(true);
        field.init();
        soundOne.stop();


    }
}
