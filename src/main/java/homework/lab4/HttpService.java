package homework.lab4;

public class HttpService {
    public void handleHttpCode(int httpCode) {
        HttpCode[] codes = HttpCode.values();
        if (httpCode >= codes[0].getMin() && httpCode <= codes[codes.length - 1].getMax()) {
            for (HttpCode code : codes) {
                if (httpCode >= code.getMin() && httpCode <= code.getMax()) {
                    System.out.println(httpCode+ " " + code.getDescription());
                }
            }
        } else {
            throw new IllegalStateException("code " + httpCode + " not supported");
        }

    }
}
