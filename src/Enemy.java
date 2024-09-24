import java.util.Random;

public  class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {

        if (health < 0){
            return 0;
        }

        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage, Hero hero) {

        if(!isAlive()){
            System.out.println("Враг повержен!");
            return;
        }

        Random random = new Random();
        int contrAttack = (damage / 2 - random.nextInt(damage / 2));
        this.health = this.health - damage;
        System.out.println("Ответным ударом враг наносит " + contrAttack + " урона");
        hero.contrAttack(contrAttack);

        System.out.println("Герой: "+ hero.getHealth() + " hp");
        System.out.println("Враг: "+ getHealth() + " hp");

    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
