package com.theironyard;

import java.time.LocalDateTime;

//Create a Notification class with the following instance variables

public class Notification {
    private LocalDateTime createAt;
    private String subject;
    private String body;

    protected String status;

//    protected String status = "ALRIGHT";

//In the body of the constructor set the createdAt variable to be the current time (i.e. LocalDateTime.now()).

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;

        status = "ALRIGHT";

        createAt = LocalDateTime.now();
    }

//Provide getter methods for all the instance variables.

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void showStatus() {
        System.out.println(status);

    }

    protected void theMethod(){
        System.out.println("Hello");
    }


//In the Notification class, add a public transport method that has a void return type,
// has no parameters and throws a NoTransportException.

    public void transport() throws NoTransportException{
    }

}
