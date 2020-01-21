package dev.fuxing.sqw.model;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 16:03
 */
public class EmailMessage {
    private String to;
    private String body;

    public EmailMessage() {
    }

    public EmailMessage(String to, String body) {
        this.to = to;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Email{to=%s, body=%s}", getTo(), getBody());
    }
}
