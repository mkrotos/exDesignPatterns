package com.krotos.Factory;

public interface ImageReader {
    Image createImage(String content);

    void save(Image image);
}
