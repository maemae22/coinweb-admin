package com.example.coinwebadmin.service;

import com.example.coinwebadmin.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public int insertContact(HashMap<String, String> params) {
        return repository.insertContact(params);
    }

    public int selectCntContact() {
        return repository.selectCntContact();
    }

    public ArrayList<HashMap<String, Object>> selectAllContact() {
        return repository.selectAllContact();
    }
}
