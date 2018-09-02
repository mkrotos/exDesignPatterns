package com.krotos.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        ImageReader imageReader = new GifImageReader();
        Image gifImage = imageReader.createImage("asdfvg");
        System.out.println(gifImage.getImage());
        imageReader.save(gifImage);

        ImageReader imageReader2 = new JpegImageReader();
        Image jpegImage = imageReader2.createImage("jkjkasd");
        System.out.println(jpegImage.getImage());
        imageReader2.save(jpegImage);
    }
}
