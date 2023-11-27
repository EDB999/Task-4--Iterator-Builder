package BuilderLogic;

import javafx.scene.image.Image;

public class Director {
    private Image image;
    public void setImage(Image image){
        this.image = image;
    }

    public Joke Construct(JokeBuilder builder){
        builder.setImage(this.image);
        builder.setFont();
        builder.setColor();
        builder.setText();
        return builder.build();
    }
}
