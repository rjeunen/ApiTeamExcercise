package org.example;

public class House {
    String url;
    String name;
    String region;
    String coatOfArms;
    String words;
    String currentLord;
    String heir;
    String overlord;
    String founded;
    String founder;
    String diedOut;

    public House(String name, String region){
        this.name = name;
        this.region = region;
    }

    public String getName(){
        return name;
    }
}
