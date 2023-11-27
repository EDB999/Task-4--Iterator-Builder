package com.example.task4_programtech;

import BuilderLogic.Director;
import BuilderLogic.Joke;
import BuilderLogic.JokeBuilder;
import IterLogic.ConcreteAggregate;
import IterLogic.interfaces.Iterator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Task45Controller implements Initializable {

    private Iterator it;
    private Director dir;
    private JokeBuilder build;

    @FXML
    private BorderPane bordPan;


    @FXML
    public void onPastButtonClick(ActionEvent actionEvent) {
        build = new JokeBuilder();
        dir = new Director();
        var item = (Image)it.preview();
        //Получение
        dir.setImage(item);
        //Конкретная реализация builder'а
        //Объект, который должен быть создан
        Joke joke = dir.Construct(build);
        //Отображение полученного объекта
        bordPan.setCenter(joke.getPanel());
    }
    @FXML
    public void onNextButtonClick(ActionEvent actionEvent) {
        build = new JokeBuilder();
        dir = new Director();
        var item = (Image)it.next();
        //Получение
        dir.setImage(item);
        //Конкретная реализация builder'а
        //Объект, который должен быть создан
        Joke joke = dir.Construct(build);
        //Отображение полученного объекта
        bordPan.setCenter(joke.getPanel());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ConcreteAggregate slides = new ConcreteAggregate();

        it = slides.createIterator();

        //распорядитель
        dir = new Director();
        //Получение
        dir.setImage((Image)it.next());
    }
}