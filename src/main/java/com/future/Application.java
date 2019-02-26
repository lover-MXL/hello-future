package com.future;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : WangYuQiang
 * @description:启动类
 * @date: 2019/2/26
 */
@SpringBootApplication
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
        System.out.println("Spting boot run success!");
    }
}
