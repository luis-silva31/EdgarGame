 package EdgarGame.Enemies;

public class Dwarf extends Enemy {

    public Dwarf(int defenseFactor, int attackFactor) {
        super("Dwarf", defenseFactor, attackFactor);
    }

    public void sleep() {
        System.out.println("zzzZzzzZ");
    }
}
