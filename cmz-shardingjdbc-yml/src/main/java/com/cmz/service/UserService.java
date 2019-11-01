package com.cmz.service;

import com.cmz.dao.UserDao;
import com.cmz.entity.User;
import io.shardingsphere.transaction.annotation.ShardingTransactionType;
import io.shardingsphere.transaction.api.TransactionType;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public long addOne(User user) {
        this.userDao.addOne(user);
        return user.getUserId();
    }

    public User getOne(long id) {
        return userDao.getOneById(id);
    }

    /**
     * 测试跨库事务
     */
    @ShardingTransactionType(TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    public void testTransactional() {
        User user1 = new User(12673, "cmz", 12);
        this.userDao.addOne(user1);
        User user2 = new User(12674, "cmz", 12);
        // 主键冲突
        this.userDao.addOne(user2);
        this.userDao.addOne(user2);
    }
}
