package dev.fuxing.sqw.service;

import dev.fuxing.sqw.model.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 16:00
 */
@RestController
public class EmailController {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public EmailController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/email")
    public void email(@RequestParam(value = "email") String email) {
        EmailMessage message = new EmailMessage(email, "Hi.");
        jmsTemplate.convertAndSend("mailbox", message);
    }
}
