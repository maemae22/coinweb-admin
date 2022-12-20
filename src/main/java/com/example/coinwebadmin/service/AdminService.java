package com.example.coinwebadmin.service;

import com.example.coinwebadmin.dto.AdminDTO;
import com.example.coinwebadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AdminService {

    @Autowired
    AdminRepository repository;

    public String selectAdmin(HashMap<String, String> params) {
        return repository.selectAdmin(params);
    }

    public String selectAdmin(AdminDTO adminDTO) {
        HashMap<String, String> params = new HashMap<>();
        params.put("id", adminDTO.getId());
        params.put("password", adminDTO.getPassword());

        return repository.selectAdmin(params);
    }
}
