package com.theironyard;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

//    protected String status;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;


    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;


    }

    public void showStatus() {
        System.out.println(status);

    }

    @Override
    public void transport () throws NoTransportException {
        System.out.println(recipient);
        System.out.println(smsProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreateAt());
    }
}
