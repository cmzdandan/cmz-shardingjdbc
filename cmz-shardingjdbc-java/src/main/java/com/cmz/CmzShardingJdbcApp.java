package com.cmz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @nickname 陈梦洲
 * @date 2019/11/1
 * @description ShardingJDBC测试启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.cmz.mapper")
public class CmzShardingJdbcApp {

    public static void main(String[] args) {
        SpringApplication.run(CmzShardingJdbcApp.class, args);
    }

}
