package com.krotos.Factory;

public class GifImage implements Image {
    private final String image;

    public GifImage(String image) {
        this.image = image;
    }

    @Override
    public String getImage() {
        return image;
    }
}
