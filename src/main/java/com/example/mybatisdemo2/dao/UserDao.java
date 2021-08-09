package com.example.mybatisdemo2.dao;

import com.example.mybatisdemo2.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public  int insert(UserDomain record);
    public int deleteUser(int userId);
    public int updateUser(UserDomain userDomain);
    public UserDomain selectById(int userId);
    public List<UserDomain> selectAll();



}
