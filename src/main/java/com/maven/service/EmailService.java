package com.maven.service;

import com.maven.entity.Email;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public interface EmailService {
    Email sendMail(Email email);

    public void sendMailsToMultipleEmailIds(String from, String[] to,String subject,String body);

    public void sendMailWithHtml(Email email,String htmlFile) throws MessagingException;

    public void sendMailWithAttachment(String from, String to,String subject,String body, File file) throws MessagingException;
}
