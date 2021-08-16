package homework.lab1;

import java.util.Arrays;

public class AndreiSuperIntegerList implements SuperIntegerList {

    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void add(int number) {
        int[] result = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, result, 0, numbers.length);
        result[numbers.length] = number;
        numbers = result;
    }

    @Override
    public void removeByIndex(int index) {

        if (index >= numbers.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }

        int[] result = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (i < index) {
                result[i] = numbers[i];
            } else if (i > index) {
                result[i-1] = numbers[i];
            }
        }
        numbers = result;
    }

    @Override
    public void removeByValue(int value) {
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                this.removeByIndex(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("The value is not in the list");
        }
    }

    @Override
    public int get(int index) {

        if (index >= this.numbers.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index out of range");
        }

        return this.numbers[index];
    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(this.numbers));
    }
}
