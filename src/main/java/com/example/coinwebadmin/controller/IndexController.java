package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.service.BuyService;
import com.example.coinwebadmin.service.ContactService;
import com.example.coinwebadmin.service.MemberService;
import com.example.coinwebadmin.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"인덱스(메인) 페이지 서비스"}, description = "관리자 - 메인 페이지 관련 서비스")
@RestController
public class IndexController {

    @Autowired MemberService memberService;
    @Autowired PaymentService paymentService;
    @Autowired BuyService buyService;
    @Autowired ContactService contactService;

    @ApiOperation(value = "총 회원가입 인원", notes = "회원가입 인원수를 조회한다")
    @GetMapping("/selectCntMember")
    public int selectCntMember() {
        return memberService.selectCntMember();
    }

    @ApiOperation(value = "회원 총 결제(충전) 금액", notes = "회원들의 총 결제(충전) 금액을 조회한다")
    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment() {
        return paymentService.selectAmountPayment();
    }

    @ApiOperation(value = "총 코인 구매 건수", notes = "회원들의 총 코인 구매 건수를 조회한다")
    @GetMapping("/selectCntBuy")
    public int selectCntBuy() {
        return buyService.selectCntBuy();
    }

    @ApiOperation(value = "총 연락 요청 건수", notes = "회원들의 총 연락 요청 건수를 조회한다")
    @GetMapping("/selectCntContact")
    public int selectCntContact() {
        return contactService.selectCntContact();
    }

}
