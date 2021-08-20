package homework.lab7;

import homework.lab7.MailInfo;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void send(MailInfo mailInfo) {

            System.out.println(mailInfo.getMailType().getName() + " mail was sent " + mailInfo.getContext());

    }
}
