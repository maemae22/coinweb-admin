package com.example.coinwebadmin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Aspect
@Component
public class AdminAop {

    @Pointcut("execution(* com.example.coinwebadmin.controller.*.*(..))")   // 실제 advice 가 적용될 지점.
    public void cut() {
    }

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("id") == null){ // 로그인 정보가 없을 때
            return null;
        } else {    // 로그인 정보가 있을 때
            return joinPoint.proceed();
        }
    }

}