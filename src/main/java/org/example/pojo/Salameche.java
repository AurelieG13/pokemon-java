package org.example.pojo;

import org.example.stateType.Type;
import org.w3c.dom.ls.LSOutput;

public class Salameche extends Pokemon{
    //Pas d'attributs car viennent de Pokemon
    //on peut quand meme ajouter un attribut qui serait propre à cette classe
    private Type type;

    //Constructeur

    public Salameche(Type type) {
        super();
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bonjour, je suis de type " + this.type ;
    }
}
