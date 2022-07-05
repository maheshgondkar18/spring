package com.contacts.service;

import com.contacts.entity.Contact;

import java.util.List;

public interface contactService {


    public List<Contact> getContactsOfUser(Long userId);
}
