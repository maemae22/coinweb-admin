package com.example.coinwebadmin.service;

import com.example.coinwebadmin.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class BuyService {
    @Autowired
    BuyRepository repository;

    public int insertBuy(HashMap<String, Object> params) {
        return repository.insertBuy(params);
    }

    public List<HashMap<String, Object>> selectAllBuy(String email) {
        return repository.selectAllBuy(email);
    }

    public Double selectTotalBuy(String email) {
        return repository.selectTotalBuy(email);
    }

    public int selectCntBuy() {
        return repository.selectCntBuy();
    }

    public ArrayList<HashMap<String, Object>> selectAllBuyAdmin() {
        return repository.selectAllBuyAdmin();
    }
}
