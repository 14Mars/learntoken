package com.demo.spring;

import com.demo.spring.biz.BizService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy
@ImportResource(locations= {"classpath:test-app.xml"})
public class DemoApplication {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("test-app.xml");



        SpringApplication.run(DemoApplication.class, args);

//        BizService bizService = (BizService) ioc.getBean("bizService");
//        bizService.readService(1);

    }

}
