package com.cmz.dao;


import com.cmz.entity.User;

public interface UserDao  {

    void addOne(User user);

    User getOneById(long id);
}
