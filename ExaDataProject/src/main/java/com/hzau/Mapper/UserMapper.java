package com.hzau.Mapper;

import com.hzau.Domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findAll();
}
