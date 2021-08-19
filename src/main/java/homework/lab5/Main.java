package homework.lab5;

public class Main {
    public static void main(String[] args) {
        AndreiDate date1 = new AndreiDate(10,12,2010);
        String date2 = "21.10.1997";
        System.out.println(DateUtil.dateToString(date1));
        System.out.println(DateUtil.stringToDate(date2));
    }
}
