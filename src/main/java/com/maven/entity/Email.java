package com.maven.entity;

import lombok.Data;

import java.util.List;

@Data
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;

}
