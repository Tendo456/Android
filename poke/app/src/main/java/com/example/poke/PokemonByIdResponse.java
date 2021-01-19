package com.example.poke;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PokemonByIdResponse implements Serializable {

    @SerializedName("base_experience")
    private int baseExperience;
    private String name;
    private int id;


    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PokemonByIdResponse{" +
                "baseExperience=" + baseExperience +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
