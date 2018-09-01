package com.krotos.Singleton;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigHelper {

    private static ConfigHelper instance;

    private Map<String,String> mapOfProperties=new HashMap<>();

    private ConfigHelper(){
        try {
            Files.readAllLines(Paths.get("src/main/java/com/krotos/Singleton/config.properties"))
                    .stream()
                    .forEach(line->{
                        String[] keyToValue=line.trim().split("=");
                        mapOfProperties.put(keyToValue[0],keyToValue[1]);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigHelper getInstance(){
        if(instance==null){
            synchronized (ConfigHelper.class){
                if(instance==null){
                    instance=new ConfigHelper();
                }
            }
        }
        return instance;
    }
    public String getProperty(String key){
        return mapOfProperties.get(key);
    }
    public String toString(){
        return mapOfProperties.toString();
    }
}
