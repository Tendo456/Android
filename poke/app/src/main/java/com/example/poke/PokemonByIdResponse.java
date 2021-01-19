package com.example.poke;

import com.google.gson.annotations.SerializedName;

public class PokemonByIdResponse {

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
}
