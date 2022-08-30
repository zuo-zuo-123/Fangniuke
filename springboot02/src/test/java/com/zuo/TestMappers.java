package com.zuo;

import com.zuo.dao.DiscussPostMapper;
import com.zuo.dao.UserMapper;
import com.zuo.entity.DiscussPost;
import com.zuo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @Author zuozuo
 * @Date 2022 08 28
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Springboot02Application.class)
public class TestMappers {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
  /*测试查询*/
    @Test
    public void testSelectUser() {
        User u1 = userMapper.selectById(101);
        User u2 = userMapper.selectByName("nowcoder12");
        User u3 = userMapper.selectByEmail("nowcoder22@sina.com");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
    /*如何插入用户*/
    @Test
    public void testinsert(){
        User user = new User();
        user.setUsername("张飒");
        user.setPassword("212x");
        user.setSalt("swe2");
        user.setEmail("nsdj@163.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());
        int i = userMapper.insertUser(user);
        System.out.println(i);
    }
    @Test
    public void testupdate(){
              userMapper.updateStatus(150,1);
              userMapper.updateHeader(150,"http://www.nowcoder.com/102.png");
              userMapper.updatePassword(150,"1212121");
    }
    @Test
    public void testselectdiscusspost(){
        List<DiscussPost> discussPosts = discussPostMapper.selectAllposts(149, 0, 10);
        int i = discussPostMapper.selectPostRows(149);
        for (DiscussPost post :discussPosts) {
            System.out.println(post);
        }
        System.out.println(i);
    }
}
