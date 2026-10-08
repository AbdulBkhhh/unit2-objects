import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents a Pokemon actor in Greenfoot.
 */
public class Pokemon extends Actor
{
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon(int hp, int ap, String name, String attackName, String type) {
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.attack = new Attack(attackName);
        this.img = new GreenfootImage(name + ".png");
        setImage(this.img); // Sets the actor's visual image in Greenfoot
        this.outStatus = false;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isOut() {
        return this.outStatus;
    }

    /**
     * Reduces HP when attacked.
     */
    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp <= 0) {
            this.hp = 0;
            this.outStatus = true; // Pokemon fainted/knocked out
        }
    }

    /**
     * Calculates total damage based on AP and type advantages if needed.
     */
    public int getAttackPower(String aName, User enemy) {
        // Basic damage calculation using the attack power (ap)
        return this.ap;
    }

    /**
     * Executes an attack on an enemy user's active Pokemon.
     */
    public void attack(String aName, User enemy) {
        if (enemy != null && enemy.getPokemon() != null) {
            int damage = getAttackPower(aName, enemy);
            enemy.getPokemon().takeDamage(damage);
        }
    }
    
    public void heal() {
    this.hp += 20; // Restores 20 HP (or adjust as needed)
}

    public void act() {
        // Place turn actions or continuous behavior here
    }
}