package com.krotos.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        GifImageReader gifImageReader=new GifImageReader();
        Image gifImage=gifImageReader.createImage("asdfvg");
        System.out.println(gifImage.getImage());
        gifImageReader.save(gifImage);
    }
}
