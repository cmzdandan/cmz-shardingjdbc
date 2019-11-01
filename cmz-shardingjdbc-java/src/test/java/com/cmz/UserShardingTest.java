package com.cmz;

import com.cmz.pojo.UserInfo;
import com.cmz.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @nickname 陈梦洲
 * @date 2019/11/1
 * @description 演示取模的分库分表策略
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserShardingTest {

    @Resource
    UserService userService;

    @Test
    public void insert() {
        userService.insert();
    }

    @Test
    public void select() {
        UserInfo userInfo1 = userService.getUserInfoByUserId(1L);
        System.out.println("------userInfo1:" + userInfo1);

        UserInfo userInfo2 = userService.getUserInfoByUserId(2L);
        System.out.println("------userInfo2:" + userInfo2);
    }

}
