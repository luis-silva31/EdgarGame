package EdgarGame.Enemies;

public interface PlayerInterface {
    void getHitted(double hit);

    int rechargeHealth(int health);

    int normalAttack();

    int specialAttack();
}
