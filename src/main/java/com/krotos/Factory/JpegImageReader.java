package com.krotos.Factory;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JpegImageReader implements ImageReader {
    @Override
    public Image createImage(String content) {
        return new JpegImage(content);
    }

    @Override
    public void save(Image image) {
        try {
            PrintWriter printWriter = new PrintWriter("image.jpeg", "UTF-8");
            printWriter.print(image.getImage());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
