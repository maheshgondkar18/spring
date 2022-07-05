package com.contacts.service;

import com.contacts.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service

public class contactServeImpl implements  contactService{



    List<Contact> list =List.of(
            new Contact(1l,"mahesh@gmail.com","Mahesh",1211L),
            new Contact(2l,"sai@gmail.com","Sai",1311L),
            new Contact(3l,"kk@gmail.com","KK",1411L)
            );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
