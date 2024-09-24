import java.util.Random;

public class Archer extends Hero{

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        Random random = new Random();

        if (random.nextInt(100) < 25){
            System.out.println("Вы промахнулись((");
            System.out.println("Лучник расстроился и потерял 50 hp");
            setHealth(getHealth() - 50);
            return;
        }
        int damage = (random.nextInt(150) + 50);
        System.out.println("Лучник по имени " + getName() + " наносит " + damage + " единиц урона");
        enemy.takeDamage(damage, this);
    }

    @Override
    public void contrAttack(int damage){
        this.health -= damage;
    }
}
