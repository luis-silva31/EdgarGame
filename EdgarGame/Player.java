package EdgarGame;

import EdgarGame.Enemies.PlayerInterface;

public class Player implements PlayerInterface {
    protected int health = 100;
    protected int normalAttack = 20;
    protected int specialAttack = 50;
    protected int healthRechargeCounter = 3;
    protected int specialAttackCounter = 3;

    @Override
    public void getHitted(double hit) {
       this.health = (int) (this.health - hit);
    }

    @Override
    public int rechargeHealth(int health) {
        int newHealth = this.health + health;
        healthRechargeCounter--;
        return newHealth;
    }

    @Override
    public int normalAttack() {
        return 0;
    }

    @Override
    public int specialAttack() {
        return 0;
    }

    public int getHealth(){
        return this.health = health;
    }
}
