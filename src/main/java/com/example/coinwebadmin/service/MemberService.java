package com.example.coinwebadmin.service;

import com.example.coinwebadmin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository repository;

    public int insertMember(HashMap<String, String> params) {
        return repository.insertMember(params);
    }

    public String selectMember(HashMap<String, String> params) {
        return repository.selectMember(params);
    }

    public int selectCntMember() {
        return repository.selectCntMember();
    }

    public ArrayList<HashMap<String, Object>> selectAllMember() {
        return repository.selectAllMember();
    }
}
