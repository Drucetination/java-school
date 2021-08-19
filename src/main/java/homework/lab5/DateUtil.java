package homework.lab5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd|MM|yyyy-hh:mm:ss:a");

        public static LocalDateTime stringToDate(String date){
            return LocalDateTime.parse(date, formatter);
        }

        public static String dateToString(LocalDateTime date) {
            return formatter.format(date);
        }

    }
