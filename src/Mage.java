import java.util.Random;

public class Mage extends Hero{
    private int mana;

    public Mage(String name, int health) {
        super(name, health);

        this.mana = 30;
    }

    public int getMana() {
        return mana;
    }
    @Override
    public void attackEnemy(Enemy enemy) {

        Random random = new Random();
        int damage = (random.nextInt(70) + 50);

        System.out.println("Маг по имени " + getName() + " наносит " + damage + " единиц урона");
        if (mana < 0) mana = 0;

        int manaDamage = damage * mana / 100;
        System.out.println("Бонус маны " + manaDamage + " урона.");
        enemy.takeDamage(damage + manaDamage, this);

    }
    @Override
    public void contrAttack(int damage){
        this.health -= damage;
    }
}
