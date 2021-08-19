package homework.lab3;

public class KnightFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new Knight();
    }
}
