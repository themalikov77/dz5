public class Hero {
    private double health;
    private int damage;
    private String superpower;

    public double getHealth() {
        return health;
    }



    public int getDamage() {
        return damage;
    }



    public String getSuperpower() {
        return superpower;
    }



    public Hero (double health, int damage, String superpower) {
        this.health=health;
        this.damage=damage;
        this.superpower=superpower;

    }
    public Hero (double health, int damage){
        this.health=health;
        this.damage=damage;
    }
    }

