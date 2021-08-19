package homework.lab3;

public class GameManager {
    public void fight(Hero fighter1, Hero fighter2) {
        boolean flag = true;
        while (fighter1.getHp() > 0 && fighter2.getHp() > 0) {
            if (flag) {
                fighter1.kick(fighter2);
            } else {
                fighter2.kick(fighter1);
            }
            flag = false;
        }
    }
}
