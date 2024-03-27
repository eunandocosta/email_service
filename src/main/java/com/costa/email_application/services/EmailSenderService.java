package com.costa.email_application.services;

import com.costa.email_application.adapters.EmailSenderGateway;
import com.costa.email_application.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    public final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body){
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
