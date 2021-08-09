package com.example.mybatisdemo2.service.user;

import com.example.mybatisdemo2.model.UserDomain;

import java.util.List;

public interface UserService {
    public int addUser(UserDomain user);
    public int deleteUser(int userId);
    public int updateUser(UserDomain userDomain);
    public UserDomain selectById(int userId);
    public List<UserDomain> selectAll();


}
