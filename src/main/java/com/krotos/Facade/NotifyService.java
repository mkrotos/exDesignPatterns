package com.krotos.Facade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NotifyService {

    void sendSMSNotification(Account account, String operation){
        System.out.println("Sent SMS with the folowing content: ");
        System.out.println("Date: "+LocalDateTime.now());
        System.out.println("Operation: "+operation);
        System.out.println(account.toString());
    }
    void sendEmailNotification(Account account, String operation){
        System.out.println("Sent Email with the folowing content: ");
        System.out.println("Date: "+LocalDateTime.now());
        System.out.println("Operation: "+operation);
        System.out.println(account.toString());
    }
}
