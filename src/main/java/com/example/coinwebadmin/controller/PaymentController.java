package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"충전(결제) 서비스"}, description = "관리자 - 충전/결제(payment) 관련 서비스")
@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @ApiOperation(value = "총 결제(충전) 내역", notes = "회원들의 총 결제(충전) 내역을 조회한다")
    @GetMapping("/selectPayment")
    public ArrayList<HashMap<String,Object>> selectPayment() {
        return paymentService.selectAllPaymentAdmin();
    }
}
