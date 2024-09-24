public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(1000);

        Hero[] heroes = new Hero[]{new Archer("archer", 100), new Warrior("warrior", 1000, 100), new Mage("magic moose", 500)};

        for (Hero hero : heroes) {
            hero.attackEnemy(new Enemy(150));
        }

    }

}
