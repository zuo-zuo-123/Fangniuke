package com.zuo.service;

import com.zuo.dao.DiscussPostMapper;
import com.zuo.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> selectAllposts(Integer userId, Integer offset, Integer limit){
         return discussPostMapper.selectAllposts(userId, offset, limit);
    }

    public int selectAllRows(Integer userId){
        return discussPostMapper.selectPostRows(userId);
    }
}
