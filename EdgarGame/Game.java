package EdgarGame;

import EdgarGame.Enemies.*;
import java.util.Random;
import java.util.Scanner;

public class Game implements PlayerInterface {
    private boolean status = true;
    private int stage;
    private String[] enemyTypes = new String[] {"Elf", "Dwarf", "Human"};
    private Enemy[] enemies;

    public void startGame(){

        Enemy[] enemies = new Enemy[4];
        enemies[0] = new Dwarf(3, 13);
        enemies[1] = new Elf(12,12);
        enemies[2] = new Human(8, 9);
        enemies[3] = new Dragon(20,20);

        Random rand = new Random();

        for(int i = 0; i < enemies.length; i++){
            int index = rand.nextInt(enemies.length);
            Enemy a = enemies[index];
            enemies[index] = enemies[i];
            enemies[i] = a;
        }
    }

    Player player = new Player();


    @Override
    public void getHitted(double hit) {
        player.health = (int) (player.health - hit);
    }

    @Override
    public int rechargeHealth(int health) {

        if(player.health < 100){
            player.health = player.health + health;
            player.healthRechargeCounter--;
        }

        return player.health;
    }


    @Override
    public int normalAttack() {
        return player.normalAttack;
    }

    @Override
    public int specialAttack() {
        return player.specialAttack;
    }

    public void round(){
            int i = 0;
            while(enemies[i].getLife() > 0 && player.getHealth() > 0){
                Scanner scanner = new Scanner(System.in);
                String scan = scanner.nextLine();

                System.out.println("-------------------------------");
                System.out.println("Select one of the five options:");
                System.out.println("1: to Attack enemy");
                System.out.println("2: to recharge");
                System.out.println("3: to Special Attack");
                System.out.println("4: to Avoid enemy");
                System.out.println("5: Quit Game");
                System.out.println("-------------------------------");

                switch (scan){
                    case "1":
                        playerAttack(i, player.normalAttack());
                        break;

                    case "2":
                        player.rechargeHealth(5);
                        break;

                    case "3":

                        break;

                    case "4":

                        break;

                    case "5":
                        System.out.println("You gave up.");
                        status = false;
                        return;

                    default:
                        System.out.println("Invalid input.");
                        break;
                }
                if(player.health < 0){
                    System.out.println("You died. Game Over.");
                    status = false;
                    return;
                }

                if(enemies == null){
                    System.out.println("YOU WIN!");
                    status = false;
                    return;
                }
            }
    }

    public void playerAttack(int i, int attack){
        enemies[i].printEnemy();
        enemies[i].setDamage(attack);
        player.getHitted(enemies[i].getAttack());
    }
}

