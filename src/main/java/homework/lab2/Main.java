package homework.lab2;

public class Main {

    public static void main(String[] args) {

        Client client = Client.build()
                .bonus(10)
                .debt(100)
                .name("Andrei")
                .salary(100000)
                .build();

        System.out.println(client);

    }
}
