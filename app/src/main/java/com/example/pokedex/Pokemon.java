package com.example.pokedex;

public class Pokemon {
    private String name;
    private String url;

    Pokemon(String name, String number){
        this.name= name;
        this.url=number;
    }
    public  String getName(){
        return name;
    }
    public String getUrl(){
        return url;
    }

}
