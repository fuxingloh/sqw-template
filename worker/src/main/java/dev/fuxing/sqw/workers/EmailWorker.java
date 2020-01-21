package dev.fuxing.sqw.workers;

import dev.fuxing.sqw.model.EmailMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 15:47
 */
@Component
public class EmailWorker {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(EmailMessage email) {
        System.out.println("Received <" + email + ">");
    }

}
