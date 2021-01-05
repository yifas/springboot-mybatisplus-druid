package com.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
    注：如果配置了MybatisPlusConfig类
    @MapperScan("com.bin.dao")可以放在配置类上
 */
@SpringBootApplication
@MapperScan("com.bin.dao") //扫描Mapper
public class SpringbootMybatisplusDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisplusDruidApplication.class, args);
    }

}
