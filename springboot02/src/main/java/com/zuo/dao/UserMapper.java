package com.zuo.dao;

import com.zuo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zuozuo
 * @Date 2022 08 28
 * @Description:
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
