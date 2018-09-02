package com.krotos.Singleton;

public class Player {

    private final String TAG = ConfigHelper.getInstance().getProperty("log.tag");
    private boolean isLoad = false;

    public void play() {
        System.out.println("Dziala");
        System.out.println("tag= " + TAG);

    }

    public void pause() {

    }

    public void stop() {

    }

    public void reset() {

    }

    public void load() {

    }
}
