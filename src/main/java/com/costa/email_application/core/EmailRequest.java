package com.costa.email_application.core;

public record EmailRequest(String to, String subject, String body) {
}
