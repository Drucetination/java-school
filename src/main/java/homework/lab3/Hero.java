package homework.lab3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Hero {

    private int hp = 10;
    private int power = 3;
    private String name = "Лёха";
    private boolean alive = true;

    public void kick(Hero enemy) {
        Random damageRandomizer = new Random();
        int damage = damageRandomizer.nextInt();
        enemy.hp -= power;
    }

}
