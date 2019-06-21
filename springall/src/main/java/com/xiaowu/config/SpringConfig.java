package com.xiaowu.config;

import com.xiaowu.Girl;
import com.xiaowu.dao.BillDao;
import com.xiaowu.service.BillService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// 全注解式的 连配置文件都不需要
// 用配置文件的方式 是需要用到反射的
@Configuration
@ComponentScan(value = "com.xiaowu")
public class SpringConfig {



    @Bean("girl")
    public Girl createGirl() {
        Girl girl = new Girl();
        girl.setName("feifei");
        return girl;
    }

    @Bean("billService")
    public BillService createBillService() {
        BillService billService = new BillService();
        return billService;
    }

    @Bean
    public BillDao createBillDao(){
        BillDao billDao = new BillDao();
        return billDao;
    }
}
