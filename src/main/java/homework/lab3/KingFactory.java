package homework.lab3;

public class KingFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new King();
    }
}
