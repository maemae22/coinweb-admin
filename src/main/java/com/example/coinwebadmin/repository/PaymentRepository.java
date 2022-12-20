package com.example.coinwebadmin.repository;

import com.example.coinwebadmin.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class PaymentRepository {

    @Autowired
    PaymentMapper mapper;

    public int insertPayment(HashMap<String, Object> params) {
        return mapper.insertPayment(params);
    }

    public ArrayList<HashMap<String, Object>> selectAllPayment(String email) {
        return mapper.selectAllPayment(email);
    }

    public ArrayList<HashMap<String, Object>> selectAllPaymentAdmin() {
        return mapper.selectAllPaymentAdmin();
    }

    public Double selectTotalPayment(String email) {
        return mapper.selectTotalPayment(email);
    }

    public double selectAmountPayment() {
        return mapper.selectAmountPayment();
    }

}
