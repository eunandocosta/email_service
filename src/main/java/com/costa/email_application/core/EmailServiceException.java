package com.costa.email_application.core;

public class EmailServiceException extends RuntimeException{

    public EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }

}
