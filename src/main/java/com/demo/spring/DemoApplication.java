package com.demo.spring;

import com.demo.spring.biz.BizService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("test-app.xml");
        BizService bizService = (BizService) ioc.getBean("bizService");
        bizService.readService(1);

        SpringApplication.run(DemoApplication.class, args);
    }

}
