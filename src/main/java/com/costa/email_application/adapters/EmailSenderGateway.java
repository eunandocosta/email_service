package com.costa.email_application.adapters;

public interface EmailSenderGateway {

    public void sendEmail(String to, String subject, String body);
}
