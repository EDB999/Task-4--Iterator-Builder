package BuilderLogic.interfaces;

import BuilderLogic.Joke;
import javafx.scene.image.Image;

public interface Builder {
    public void setImage(Image image);
    public void setText();
    public void setFont();
    public void setColor();
    public Joke build();
}
