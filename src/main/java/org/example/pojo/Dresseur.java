package org.example.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dresseur {

    private String nom;
    private Integer age;
    private List<Pokemon> pokemonList;

    //constructors
    public Dresseur(String nom, Integer age, List<Pokemon> pokemonList) {
        this.nom = nom;
        this.age = age;
        this.pokemonList = pokemonList;
    }

    public Dresseur() {
        this.pokemonList = new ArrayList<>();
    }

    //methods
    public List<Pokemon> getAllPokemonWithMinLeve(Integer level) {
        return this.pokemonList.stream()
                .filter(e -> e.getNiveau() > level)
                .collect(Collectors.toList());
    }

    public void renamePokemon(String name) {
        this.pokemonList.forEach(pokemon -> {
                    pokemon.setPrenom(pokemon.getPrenom() + name);
                }) ;
    }

    public void capturerPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }
    // get & set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
