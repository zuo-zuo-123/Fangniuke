package com.zuo;

import com.zuo.dao.UserMapper;
import com.zuo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Springboot01Application.class)
class Springboot01ApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectUserById(101);
        System.out.println(user);
    }

}
