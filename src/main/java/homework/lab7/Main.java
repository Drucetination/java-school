package homework.lab7;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import homework.lab7.MailInfo;
import homework.lab7.MailSender;
import lombok.SneakyThrows;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(RandomUtil.getRandomElement(Arrays.asList(MailType.values())))
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);

        }

//        System.out.println(Arrays.toString(MailType.values()));
    }
}
