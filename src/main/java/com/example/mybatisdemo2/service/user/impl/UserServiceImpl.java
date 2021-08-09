package com.example.mybatisdemo2.service.user.impl;

import com.example.mybatisdemo2.dao.UserDao;
import com.example.mybatisdemo2.model.UserDomain;
import com.example.mybatisdemo2.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(UserDomain user) {

        return userDao.insert(user);
    }

    @Override
    public List<UserDomain> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public UserDomain selectById(int userId) {
        return userDao.selectById(userId);
    }

    @Override
    public int deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public int updateUser(UserDomain userDomain) {
        return userDao.updateUser(userDomain);
    }

}
