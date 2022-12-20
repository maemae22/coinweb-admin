package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"연락요청 서비스"}, description = "관리자 - 연락요청(contact) 관련 서비스")
@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @ApiOperation(value = "총 연락 요청 내역", notes = "회원들의 총 연락 요청 내역을 조회한다")
    @GetMapping("/selectContact")
    public ArrayList<HashMap<String, Object>> selectContact() {
        return contactService.selectAllContact();
    }
}
