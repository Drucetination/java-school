package homework.lab5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println(DateUtil.stringToDate("19|08|2021-11:14:14:PM"));
        System.out.println(DateUtil.dateToString(LocalDateTime.now()));
    }
}
