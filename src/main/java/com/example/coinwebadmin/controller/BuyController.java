package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.BuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"구매 서비스"}, description = "관리자 - 코인 구매(buy) 관련 서비스")
@RestController
public class BuyController {

    @Autowired
    BuyService buyService;

    @ApiOperation(value = "총 코인 구매 내역", notes = "회원들의 코인 총 구매 내역을 조회한다")
    @GetMapping("/selectBuy")
    public ArrayList<HashMap<String,Object>> selectBuy() {
        return buyService.selectAllBuyAdmin();
    }
}
