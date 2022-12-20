package com.example.coinwebadmin.repository;

import com.example.coinwebadmin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper mapper;

    public int insertContact(HashMap<String, String> params) {
        return mapper.insertContact(params);
    }

    public int selectCntContact() {
        return mapper.selectCntContact();
    }

    public ArrayList<HashMap<String, Object>> selectAllContact() {
        return mapper.selectAllContact();
    }
}
