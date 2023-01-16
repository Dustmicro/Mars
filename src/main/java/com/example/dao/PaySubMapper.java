package com.example.dao;

import com.example.bean.db.PaySub;
import com.github.pagehelper.Page;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaySubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaySub record);

    int insertSelective(PaySub record);

    PaySub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaySub record);

    int updateByPrimaryKey(PaySub record);

    PaySub find(PaySub record);

    List<PaySub> list(PaySub record);

    Page<PaySub> pageList(PaySub record);
}