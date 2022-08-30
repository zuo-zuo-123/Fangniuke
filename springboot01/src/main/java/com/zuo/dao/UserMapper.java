package com.zuo.dao;

import com.zuo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zuozuo
 * @Date 2022 08 28
 * @Description:
 */
public interface UserMapper {

    User selectUserById(Integer id);

    User selectUserByName(String userName);

    User selectUserByEmail(String email);

    int insertUser(User user);

    int updateUserStatus(Integer id, Integer status);

    int updateheaderUrl(Integer id, String headerUrl);

    int updateUserCode(Integer id, String activationCode);
}
