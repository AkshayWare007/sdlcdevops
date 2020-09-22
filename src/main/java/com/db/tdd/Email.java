package com.db.tdd;

import java.util.List;

/**
 * Created by Akshay on 22-09-2020.
 */
public class Email extends Exception {
    private String emailId;
    private String emailSubject;
    private String emailBody;
    List<Character> emailAttachment;

    public Email(String message) {
        super(message);
    }

    public Email(String emailId, String emailSubject, String emailBody, List<Character> emailAttachment) {
        if (emailSubject.length() >= 30) {
            try {
                throw new Email("Length must be less than 30");
            } catch (Email email) {
                email.printStackTrace();
            }
        }
        this.emailId = emailId;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.emailAttachment = emailAttachment;

    }

    public void sendMail() {
        System.out.println("Sending mail .....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public List<Character> getEmailAttachment() {
        return emailAttachment;
    }

    public void setEmailAttachment(List<Character> emailAttachment) {
        this.emailAttachment = emailAttachment;
    }
}
