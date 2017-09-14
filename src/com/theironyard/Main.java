package com.theironyard;

public class Main {

    public static void main(String[] args) {
	    EmailNotification em = new EmailNotification("It is broken", "User", "somebody", "Verizon" );

	   TextNotification tm = new TextNotification("Still broken", "Another User", "anybody", "AT & T");

	    em.transport();
	    tm.transport();

    }
}




//For this activity you will be creating a Notification class which will be extended by classes that know how to send the notification.

//Assignment
//Create a NoTransportException class that extends RuntimeException. This class will be thrown in the Notification class.

//Notification class
//Create a Notification class with the following instance variables

        //private LocalDateTime createdAt
        //private String subject;
        //private String body;
        //The Notification constructor takes the subject and body as parameters and sets the instance variables
        // (use IntelliJ to generate the constructor and pick subject and body).

        //In the body of the constructor set the createdAt variable to be the current time (i.e. LocalDateTime.now()).

        //Do not have an empty constructor.

        //Provide getter methods for all the instance variables.

        //In the Notification class, add a public transport method that has a void return type, has no parameters and
        // throws a NoTransportException. The purpose of this method is to be overridden by a subclass that has a transport mechanism.

//EmailNotification class

//Create an EmailNotification class that extends the Notification class. The instance variables are:

    //private String recipient
    //private String smtpProvider
//Food for thought: The compiler will complain about the fact that there is no default constructor in Notification.
// Can you answer why this is happening? What constructor is there in the EmailNotification class? Think about this for a few minutes,
// write down any explaination you come up with on a piece of paper or electronically and move on.

        //The EmailNotification constructor has to set not only its instance variables but also the instance variables in
        // the constructor of the Notification class. See what happens when you let IntelliJ generate the constructor and pick both
        // variables in the EmailNotification class in the constructor pop-up dialog.

        //Provide getter methods for the instance variables.

        //Override the transport() method. Again you can let IntelliJ generate the overridden method (notice that IntelliJ adds
        // the @Override annotation. This annotation is used by the compiler to make sure the method has the correct signature to override
        // a method of one of its ancestors).

        //If you let IntelliJ override the method replace the call to super.tranport() with code that simply writes to the
        // console the values of all the instance variables in EmailNotification and all the variable in Notification
        // (use the getters provided by Notification to get subject, body and createdAt).
