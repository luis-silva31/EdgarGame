package EdgarGame.Enemies;

public class Human extends Enemy {

    public Human (int defenseFactor, int attackFactor){
     super("Human", defenseFactor, attackFactor);
    }

    public void sleep(){
        System.out.println("Rrrrr o tesouro...");
    }

}




