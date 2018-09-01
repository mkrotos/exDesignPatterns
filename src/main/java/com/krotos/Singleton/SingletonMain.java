package com.krotos.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println(ConfigHelper.getInstance().toString());
        Player player=new Player();
        player.play();
    }
}
