package com.example.coinwebadmin.service;

import com.example.coinwebadmin.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository repository;

    public int insertSubscribe(HashMap<String, String> params) {
        return repository.insertSubscribe(params);
    }

    public ArrayList<HashMap<String, Object>> selectAllSubscribe() {
        return repository.selectAllSubscribe();
    }
}
