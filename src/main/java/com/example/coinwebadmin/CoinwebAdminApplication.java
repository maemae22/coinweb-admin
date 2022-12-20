package com.example.coinwebadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.example.coinwebadmin.mapper"})
public class CoinwebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinwebAdminApplication.class, args);
    }

}
