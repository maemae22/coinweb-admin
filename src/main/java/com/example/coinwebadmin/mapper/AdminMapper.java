package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface AdminMapper {

    String selectAdmin(HashMap<String, String> params);
}
