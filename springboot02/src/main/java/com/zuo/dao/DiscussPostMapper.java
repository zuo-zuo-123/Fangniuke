package com.zuo.dao;

import com.zuo.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@Mapper
public interface DiscussPostMapper {
    /*查询所有评论,分页查询的话涉及到起始行数和每页最多显示条数*/
     List<DiscussPost> selectAllposts(Integer userId,Integer offset,Integer limit);
    /*查询评论总条数*/
    int selectPostRows(@Param("userId") Integer userId);
}
