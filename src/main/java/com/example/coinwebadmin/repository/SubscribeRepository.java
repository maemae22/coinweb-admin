package com.example.coinwebadmin.repository;

import com.example.coinwebadmin.mapper.SubscribeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class SubscribeRepository {

    @Autowired
    SubscribeMapper mapper;

    public int insertSubscribe(HashMap<String, String> params) {
        return mapper.insertSubscribe(params);
    }

    public ArrayList<HashMap<String, Object>> selectAllSubscribe() {
        return mapper.selectAllSubscribe();
    }
}
