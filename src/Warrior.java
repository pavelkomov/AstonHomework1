import java.util.Random;

public class Warrior extends Hero {
    private int armor;

    public Warrior(String name, int armor, int heath) {
        super(name, heath);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void attackEnemy(Enemy enemy) {

        Random random = new Random();
        int damage = random.nextInt(80) + 50;
        System.out.println("Вы нанесли " + damage + " единиц урона");
        enemy.takeDamage(damage, this);

    }

    @Override
    public boolean isAlive() {
        return health + armor > 0;
    }

    @Override
    public void contrAttack(int damage){
        if (armor > 0){
            armor -= damage;
            return;
        }
        this.health -= damage;
    }
}
