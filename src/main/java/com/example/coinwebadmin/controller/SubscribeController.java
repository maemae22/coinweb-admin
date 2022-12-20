package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.SubscribeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"구독 서비스"}, description = "관리자 - 구독(subscribe) 관련 서비스")
@RestController
public class SubscribeController {

    @Autowired
    SubscribeService subscribeService;

    @ApiOperation(value = "총 구독 내역", notes = "회원들의 총 구독 내역을 조회한다")
    @GetMapping("/selectSubscribe")
    public ArrayList<HashMap<String, Object>> selectSubscribe() {
        return subscribeService.selectAllSubscribe();
    }
}
