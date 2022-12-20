package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"회원 서비스"}, description = "관리자 - 회원(member) 관련 서비스")
@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @ApiOperation(value = "회원 내역", notes = "회원들의 회원정보 내역을 조회한다")
    @GetMapping("/selectMember")
    public ArrayList<HashMap<String,Object>> selectMember() {
        return memberService.selectAllMember();
    }
}
