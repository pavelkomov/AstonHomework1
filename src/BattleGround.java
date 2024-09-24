public class BattleGround {

    public static void main(String[] args) {

        Hero[] heroes = new Hero[]{
                new Warrior("War dog", 200, 300),
                new Archer("Всадник с луком", 300),
                new Mage("Друид", 500),
        };

        Enemy[] enemies = new Enemy[]{
                new Enemy(100),
                new Enemy(200),
                new Enemy(300),
        };

        battle(heroes[1], enemies[1]);
        //battle(heroes[2], enemies[2]);
        battle(heroes[0], enemies[2]);
    }
    static void battle(Hero hero, Enemy enemy) {

        System.out.println();
        System.out.println("New battle starts now");
        System.out.println("-----------------------------------------------------------");

        while (hero.isAlive() & enemy.isAlive()){
            hero.attackEnemy(enemy);
        }

        if (hero.isAlive()) {
            System.out.println("Герой по имени " + hero.getName() + " одержал победу в легендарной схватке!");
        }
        else {
            System.out.println("В этот раз герой " + hero.getName() + " проиграл битву, но не войну." );
        }

    }
}
