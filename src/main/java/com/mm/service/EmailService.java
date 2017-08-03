package com.mm.service;


public interface EmailService {
    void sendEmail(String fromAdress, String toAddress, String subject, String body);
}
