package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface BuyMapper {
    int insertBuy(HashMap<String, Object> params);
    List<HashMap<String, Object>> selectAllBuy(String email);
    Double selectTotalBuy(String email);
    int selectCntBuy();
    ArrayList<HashMap<String, Object>> selectAllBuyAdmin();
}
