package homework.lab3;

public class HobbitFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new Hobbit();
    }
}
