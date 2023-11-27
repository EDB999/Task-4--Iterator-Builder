package BuilderLogic;

import BuilderLogic.interfaces.Builder;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Random;

public class JokeBuilder implements Builder {

    private Joke joke = new Joke();
    private Text txt = new Text();

    private final List<Color> colors = List.of(Color.WHITE,Color.LIGHTBLUE,Color.BLACK,Color.LIGHTSEAGREEN,Color.LIGHTGREEN);
    private List<String> phrases = List.of("- Вы думаете, что я вас не переиграю?\n" +
                    "- Что я вас не уничтожу?\n",
            "Не, ну ты видел?\n Видел!?\n",
            "Думай... Главное \n думай...\n",
            "Мандарины и оливье на новый год\n",
            "У тебя не украдут код\n Если ты не будешь его разрабатывать\n");

    @Override
    public void setImage(Image img) {
        this.joke.addImage(img);
    }

    @Override
    public void setText() {
        txt.setText(phrases.get(new Random().nextInt(0, phrases.size())));
        this.joke.addText(txt);
    }

    @Override
    public void setFont() {
        txt.fontProperty().setValue(Font.font("Times New Roman", FontWeight.BOLD, 14));
    }

    @Override
    public void setColor() {
        txt.setFill(colors.get(new Random().nextInt(0,colors.size())));
    }

    @Override
    public Joke build() {
        return this.joke;
    }
}
