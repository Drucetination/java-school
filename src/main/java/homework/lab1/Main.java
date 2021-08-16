package homework.lab1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AndreiSuperIntegerList asil = new AndreiSuperIntegerList();
        int[] array = {1, 2, 3, 4};
        asil.setNumbers(array);
        asil.add(5);
        asil.printAll();
        asil.removeByIndex(0);
        asil.printAll();
        asil.removeByValue(4);
        asil.printAll();
        asil.removeByValue(6);
        System.out.println(asil.get(2));
    }
}
