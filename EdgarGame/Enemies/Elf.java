 package EdgarGame.Enemies;

public class Elf extends Enemy {

    public Elf(int defenseFactor, int attackFactor){
        super("Elf", defenseFactor, attackFactor);
    }

    @Override
    public void sleep(){
        System.out.println("sshiii preee sshiii preee sshiii preee");
    }

}