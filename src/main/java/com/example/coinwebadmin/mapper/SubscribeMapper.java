package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface SubscribeMapper {
    int insertSubscribe(HashMap<String, String> params);
    ArrayList<HashMap<String, Object>> selectAllSubscribe();
}
