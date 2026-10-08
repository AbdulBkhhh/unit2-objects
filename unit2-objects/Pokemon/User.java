import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor {
    private String name;
    private Pokemon pokemon;

    public User(String name) {
        this.name = name;
    }

    public void setPokemon(Pokemon p) {
        this.pokemon = p;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void switchPokemon(Pokemon newPokemon) {
        this.pokemon = newPokemon;
    }

    public void heal() {
        if (pokemon != null) {
            pokemon.heal();
        }
    }

    public void attack(String name, User enemy) {
        if (pokemon != null) {
            pokemon.attack(name, enemy);
        }
    }

    public boolean isEndGame() {
        if (pokemon == null || pokemon.isOut()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
