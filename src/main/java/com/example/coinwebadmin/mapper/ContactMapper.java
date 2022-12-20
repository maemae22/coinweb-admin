package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface ContactMapper {
    int insertContact(HashMap<String, String> params);
    int selectCntContact();
    ArrayList<HashMap<String, Object>> selectAllContact();
}
