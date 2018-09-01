package com.krotos.Factory;

public class JpegImage implements Image {
    private final String image;

    public JpegImage(String image) {
        this.image = image;
    }

    @Override
    public String getImage() {
        return image;
    }
}
