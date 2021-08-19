package homework.lab3;

public class ElfFactory extends HeroFactory {
    @Override
    public Hero createHero() {
        return new Elf();
    }
}
