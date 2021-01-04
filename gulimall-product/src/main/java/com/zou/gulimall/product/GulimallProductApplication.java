package com.zou.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合Mybatis-Plus
 * 1. 导入依赖
 * 2. 配置
 *      1. 配置数据源
 *          1. 导入Mysql驱动依赖
 *          2. 在yml中配置数据源信息
 *      2. 配置MyBatis-Plus:
 *          1. 使用@MapperScan
 *          2. yml中 告诉MyBatis-Plus,sql映射文件位置
 */
@SpringBootApplication
@MapperScan("com.zou.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
