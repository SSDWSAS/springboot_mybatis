package org.gdupt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.gdupt.dao")//直接全部扫描org.gdupt.dao作为mapper文件
public class Boot01Helloworld02Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot01Helloworld02Application.class, args);
    }
}
