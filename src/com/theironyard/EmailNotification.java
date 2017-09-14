package com.theironyard;

public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;

//    protected String status;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

        this.status = "EMAIL IS GOOD";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void showStatus() {
        System.out.println(status);

    }
    @Override
    public void transport () throws NoTransportException {

        System.out.println(recipient);
        System.out.println(smtpProvider);
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreateAt());


    }

    @Override
    public void theMethod (){
        System.out.println("this is it");
    }

}
