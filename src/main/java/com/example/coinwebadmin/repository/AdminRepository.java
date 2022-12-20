package com.example.coinwebadmin.repository;

import com.example.coinwebadmin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper mapper;

    public String selectAdmin(HashMap<String, String> params) {
        return mapper.selectAdmin(params);
    }

}
