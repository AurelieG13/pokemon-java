package org.example.pojo;

import java.util.*;

public class Pokemon {

    //Attributs
    private String prenom;
    private List<Capacite> capacites;
    private Integer niveau;
    private Boolean isShiny;
    private String nature;

    //Constructeur

    public Pokemon(String prenom, List<Capacite> capacites, Integer niveau, Boolean isShiny, String nature) {
        this.prenom = prenom;
        this.capacites = capacites;
        this.niveau = niveau;
        this.isShiny = isShiny;
        this.nature = nature;
    }

    public Pokemon() {
        this.prenom = "unPrenom";
        this.nature = "gentil";
        this.niveau = 15;
        this.isShiny = true;
        this.capacites = new ArrayList<>();
    }

    //methods
    public void addCapacities(Capacite capacite) {
        if (this.capacites != null && this.capacites.size() < 4) {
            this.capacites.add(capacite);

        } else if (this.capacites != null){
            this.menuForbiddenCapacite(capacite);
        }
    }

    private void menuForbiddenCapacite(Capacite capacite) {
        System.out.println("Vous connaissez déjà 4 capacités");
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1 : oublier une capacité");
        System.out.println("2 : ne rien faire");
        System.out.println("Entrez votre choix : ");

        int saisie = 0;
        try(Scanner sc = new Scanner(System.in)) {
            saisie = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println( "ce que vous avez écrit n'est pas correct");
        }

        switch (saisie) {
            case 1:
                Random random = new Random();
                int randomInt = random.nextInt(capacites.size()-1);
                this.capacites.remove(randomInt);
                System.out.println("la capacité " + (randomInt+1) + " a été oubliée !" );
                break;
            case 2:
                System.out.println("Aucune capacité n'a été oubliée");
                break;
            default:
                System.out.println("choix incorrect");
        }
    }



    //Getters et Setters

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Capacite> getCapacites() {
        return capacites;
    }

    public void setCapacites(List<Capacite> capacites) {
        this.capacites = capacites;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public Boolean getShiny() {
        return isShiny;
    }

    public void setShiny(Boolean shiny) {
        isShiny = shiny;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Override
    public String toString() {
        return "Bonjour, je m'appelle " + this.prenom + " et je possède " + this.capacites.size() + " capacités\n" ;
    }


}
