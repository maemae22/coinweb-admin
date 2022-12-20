package com.example.coinwebadmin.repository;

import com.example.coinwebadmin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int insertMember(HashMap<String, String> params) {
        return mapper.insertMember(params);
    }

    public String selectMember(HashMap<String, String> params) {
        return mapper.selectMember(params);
    }

    public int selectCntMember() {
        return mapper.selectCntMember();
    }

    public ArrayList<HashMap<String, Object>> selectAllMember() {
        return mapper.selectAllMember();
    }

}
