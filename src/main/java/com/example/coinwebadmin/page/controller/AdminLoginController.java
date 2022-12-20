package com.example.coinwebadmin.page.controller;

import com.example.coinwebadmin.dto.AdminDTO;
import com.example.coinwebadmin.mapper.AdminMapper;
import com.example.coinwebadmin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Api(tags = {"관리자 로그인 서비스"}, description = "관리자 로그인 관련 서비스")
@Controller
public class AdminLoginController {

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    @ApiOperation(value = "관리자 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다. (로그인 처리)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자(관리자) 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자(관리자) 비밀번호", required = true)
    })
    public String adminLogin(AdminDTO adminDTO, @ApiIgnore HttpSession session) {

        String id = adminService.selectAdmin(adminDTO);
        if (id == null || id.equals("")) {
            return "login";
        }

        session.setAttribute("id", id);
        return "index";
    }

}
