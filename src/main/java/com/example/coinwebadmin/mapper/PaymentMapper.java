package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface PaymentMapper {
    int insertPayment(HashMap<String, Object> params);
    ArrayList<HashMap<String, Object>> selectAllPayment(String email);
    ArrayList<HashMap<String, Object>> selectAllPaymentAdmin();
    Double selectTotalPayment(String email);
    double selectAmountPayment();
}
