package homework.lab4;

import lombok.Getter;
import lombok.ToString;

@Getter
public enum HttpCode {

    INFO("Informational", 100, 199),
    SUCCESS("Success", 200, 299),
    REDIRECTION("Redirection", 300, 399),
    CLIENT("Client error", 400, 499),
    SERVER("Server error", 500, 599);

    private final String description;
    private final int min;
    private final int max;

    HttpCode(String description, int min, int max) {
        this.description = description;
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {

        return getDescription() + ", codes: " + getMin() + "-" + getMax();
    }
}
