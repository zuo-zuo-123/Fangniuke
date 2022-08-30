package com.zuo.controller;

import com.zuo.entity.DiscussPost;
import com.zuo.entity.Page;
import com.zuo.entity.User;
import com.zuo.service.DiscussPostService;
import com.zuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@Controller
public class DiscussPostController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model , Page page) {
        /*方法调用前，Springmvc会自动实例化Model和Page,并将Page注入Model
        * 所以，在thymeleaf中可以直接访问Page对象中的数据*/
        page.setRows(discussPostService.selectAllRows(0));
        page.setPath("/index");
        List<DiscussPost> list = discussPostService.selectAllposts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        /*遍历一下*/
        if (list != null) {
            for (DiscussPost posts : list) {
                Map<String, Object> map = new HashMap<>();
                User user = userService.findUserById(posts.getUserId());
                map.put("user", user);
                map.put("posts", posts);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts",discussPosts);
        return "/index";
    }
}
