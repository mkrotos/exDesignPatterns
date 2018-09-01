package com.krotos.Factory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GifImageReader implements ImageReader {
    @Override
     public Image createImage(String content) {
        return new GifImage(content);
    }

    @Override
     public void save(Image image) {

        try {
            PrintWriter printWriter = new PrintWriter("image.gif", "UTF-8");
            printWriter.print(image.getImage());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
