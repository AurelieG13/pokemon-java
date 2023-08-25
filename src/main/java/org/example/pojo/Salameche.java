package org.example.pojo;

public class Salameche extends Pokemon{
    //Pas d'attributs car viennent de Pokemon
    //on peut quand meme ajouter un attribut qui serait propre à cette classe
    private String type;

    //Constructeur

    public Salameche(String type) {
        super();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bonjour, je suis de type " + this.type ;
    }
}
