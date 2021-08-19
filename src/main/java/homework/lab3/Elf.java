package homework.lab3;

public class Elf extends Hero {



    public void kick(Hero enemy) {
        if (this.getPower() > enemy.getPower()) {
            enemy.setAlive(false);
        } else {
            enemy.setPower(enemy.getPower() - 1);
        }
    }
}
