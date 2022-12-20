package com.example.coinwebadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface MemberMapper {
    int insertMember(HashMap<String, String> params);
    String selectMember(HashMap<String, String> params);
    int selectCntMember();
    ArrayList<HashMap<String, Object>> selectAllMember();
}
