package com.example.coinwebadmin.controller;

import com.example.coinwebadmin.mapper.AdminMapper;
import com.example.coinwebadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class AdminLoginController {

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public String adminLogin(@RequestParam HashMap<String, String> params, HttpSession session) {
        String id = adminService.selectAdmin(params);
        if (id == null || id.equals("")) {
            return "login";
        }

        session.setAttribute("id", id);
        return "index";
    }

}
