import java.util.HexFormat;

public class Main {
    public static void main(String[] args) {
        createHeroes();
        for (Hero halk:createHeroes()) {
            System.out.println("information about Heroes:"+" "+ halk.getHealth()+" "+halk.getDamage()+" "+halk.getSuperpower() );

        }



        Boss tor = new Boss(3100, 500, "Magical");
        System.out.println(" health Boss-" + "" + tor.getHealth() + "" + " damage Boss-" + "" + tor.getDamage() + "" + " protection Boss-" + "" + tor.getProtection());
    }
    public static Hero [] createHeroes() {
        Hero halk = new Hero(450,100, "Kinetic");
        Hero pauk = new Hero(500,200, "Physical ");
        Hero kapitan = new Hero(1000,300, "Magical");
        Hero[] massivHeroes = {halk, pauk, kapitan};
        return massivHeroes;
    }


    }
