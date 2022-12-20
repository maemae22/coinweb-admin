package com.example.coinwebadmin.page.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"페이지 이동 컨트롤러"}, description = "페이지 이동 관련 컨트롤러")
@Controller
public class PageController {

    @ApiOperation(value = "/ 로 들어올 시 이동", notes = "로그인 페이지로 이동시켜준다.")
    @GetMapping("/")
    public String login() {
        return "login";
    }

    @ApiOperation(value = "/index 로 들어올 시 이동", notes = "인덱스(메인) 페이지로 이동시켜준다.")
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "/goMember 로 들어올 시 이동", notes = "회원목록 페이지로 이동시켜준다.")
    @GetMapping("/goMember")
    public String goMember() {
        return "memberList";
    }

    @ApiOperation(value = "/goPayment 로 들어올 시 이동", notes = "결제목록 페이지로 이동시켜준다.")
    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @ApiOperation(value = "/goBuy 로 들어올 시 이동", notes = "구매목록 페이지로 이동시켜준다.")
    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @ApiOperation(value = "/goContact 로 들어올 시 이동", notes = "연락요청목록 페이지로 이동시켜준다.")
    @GetMapping("/goContact")
    public String goContact() {
        return "contactList";
    }

    @ApiOperation(value = "/goSubscribe 로 들어올 시 이동", notes = "구독목록 페이지로 이동시켜준다.")
    @GetMapping("/goSubscribe")
    public String goSubscribe() {
        return "subscribeList";
    }

}
