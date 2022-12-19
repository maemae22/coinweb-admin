package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/selectMember")
    public ArrayList<HashMap<String,Object>> selectMember() {
        return memberService.selectAllMember();
    }
}
