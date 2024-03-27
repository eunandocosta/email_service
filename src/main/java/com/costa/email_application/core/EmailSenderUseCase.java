package com.costa.email_application.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String msg);
}
