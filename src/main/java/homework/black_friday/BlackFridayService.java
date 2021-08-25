package homework.black_friday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;


public class BlackFridayService {
    public static void getBlackFridays(int startYear, int finishYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate finishDate = LocalDate.of(finishYear, 12, 31);
        Stream<LocalDate> localDateStream = startDate.datesUntil(finishDate);
        localDateStream.filter(d -> d.getDayOfWeek() == DayOfWeek.FRIDAY)
                .filter(d -> d.getDayOfMonth() == 13)
                .collect(groupingBy(LocalDate::getYear, counting()))
                .entrySet()
                .stream()
                .sorted(comparing(Map.Entry<Integer, Long>::getValue).reversed())
                .forEach(System.out::println);
    }
}
