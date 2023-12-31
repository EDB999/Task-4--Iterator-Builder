package BuilderLogic;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Joke {
    private final StackPane panel = new StackPane();
    public void addImage(Image img){
        var temp_view = new ImageView();
        temp_view.setImage(img);
        temp_view.setFitHeight(190); temp_view.setFitWidth(292);
        this.panel.getChildren().add(temp_view);
    }

    public void addText(Text text){
        this.panel.getChildren().add(text);
    }
    public StackPane getPanel(){
        return this.panel;
    }

    public void show (Pane pane){
        pane.getChildren().add(panel);
    }
}
