package homework.lab3;

public class Main {

    public static void main(String[] args) {
        King king = new King();
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        king.kick(elf);
        king.kick(king);
        elf.kick(king);
        hobbit.kick(elf);
        System.out.println(king);
        System.out.println(elf);
    }
}
