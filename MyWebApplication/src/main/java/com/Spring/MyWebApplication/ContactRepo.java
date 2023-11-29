package com.Spring.MyWebApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.MyWebApplication.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long>{

}
