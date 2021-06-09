package com.demo.spring.biz;


public class DefaultBizServiceImpl implements BizService {
    @Override
    public Integer readService(Integer source) {
        System.out.println("readService:" + source);
        return source;
    }

    @Override
    public String writeService(String source) {
        System.out.println("writeService:" + source);
        return source;
    }
}
