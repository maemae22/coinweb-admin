package com.example.coinwebadmin.service;

import com.example.coinwebadmin.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public int insertPayment(HashMap<String, Object> params) {

        return repository.insertPayment(params);
    }

    public ArrayList<HashMap<String, Object>> selectAllPayment(String email) {
        return repository.selectAllPayment(email);
    }

    public ArrayList<HashMap<String, Object>> selectAllPaymentAdmin() {
        return repository.selectAllPaymentAdmin();
    }

    public Double selectTotalPayment(String email) {
        return repository.selectTotalPayment(email);
    }

    public double selectAmountPayment() {
        return repository.selectAmountPayment();
    }
}
