package homework.lab4;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int code = 199;
        HttpService service = new HttpService();
        service.handleHttpCode(code);

//        System.out.println(HttpCode.SERVER);
    }
}
