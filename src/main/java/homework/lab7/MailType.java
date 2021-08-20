package homework.lab7;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MailType {
    INFO("Informational"),
    WARNING("Warning"),
    OFFER("Offer");

    private final String name;


}
