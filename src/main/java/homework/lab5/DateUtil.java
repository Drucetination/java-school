package homework.lab5;

import java.util.Date;

public class DateUtil {

    public static AndreiDate stringToDate(String string) {
        String[] date = string.split("\\.");
        return new AndreiDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
    }

    public static String dateToString(AndreiDate date) {
        return date.toString();
    }

}
