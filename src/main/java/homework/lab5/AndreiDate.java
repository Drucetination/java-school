package homework.lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AndreiDate {
    private int day;
    private int month;
    private int year;

    public String toString() {
        return day + "." + month + "." + year;
    }

}
