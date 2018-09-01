package com.krotos.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        ImageReader gifImageReader=new GifImageReader();
        Image gifImage=gifImageReader.createImage("asdfvg");
        System.out.println(gifImage.getImage());
        gifImageReader.save(gifImage);

        ImageReader jpegImageReader=new JpegImageReader();
        Image jpegImage=jpegImageReader.createImage("jkjkasd");
        System.out.println(jpegImage.getImage());
        jpegImageReader.save(jpegImage);
    }
}
