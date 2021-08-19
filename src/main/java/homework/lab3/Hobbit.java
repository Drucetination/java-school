package homework.lab3;

public class Hobbit extends Hero {

    private void cry() {
        System.out.println("AAAAAAAAAAAA");
    }

    @Override
    public void kick(Hero enemy) {
        this.cry();
    }
}
