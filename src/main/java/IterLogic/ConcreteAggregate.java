package IterLogic;

import IterLogic.interfaces.Aggregate;
import IterLogic.interfaces.Iterator;
import javafx.scene.image.Image;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

    private final String filetopic = new File("src//main//resources//Images//").getAbsolutePath() + "\\";

    private final List<File> searchImages(File files) {
        return Arrays.stream(files.listFiles()).toList();
    }

    @Override
    public Iterator createIterator() {
        return new ImageIterator();
    }

    private class ImageIterator implements Iterator {
        private int current = 0;
        private final int max = searchImages(Paths.get(filetopic).toFile()).size();

        private Image getImage(int iterator) {

            return new Image(Paths.get(filetopic + iterator + ".jpg").toUri().toString());

        }

        @Override
        public boolean hasNext() {
            return !getImage(current + 1).isError();
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return getImage(++current);
            }
            current = 1;
            return getImage(current);
        }

        @Override
        public Object preview() {
            if (this.hasNext()){
                return getImage(--current);
            }
            current = max;
            return getImage(current);
        }
    }
}