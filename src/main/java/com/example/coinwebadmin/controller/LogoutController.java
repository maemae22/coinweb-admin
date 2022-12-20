package com.example.coinwebadmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@Api(tags = {"로그아웃 서비스"}, description = "관리자 계정 로그아웃 관련 서비스")
@Controller
public class LogoutController {

    @ApiOperation(value = "로그아웃", notes = "로그아웃 시 작동하는 메서드")
    @GetMapping("/logout")
    public String logout(@ApiIgnore HttpSession session) {
        session.removeAttribute("id");
        return "login";
    }
}
