package com.example.dao;

import com.example.bean.db.User;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User find(User record);

    List<User> list(User record);

    Page<User> pageList(User record);
}