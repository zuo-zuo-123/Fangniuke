package com.zuo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost {
    private Integer id;
    private Integer userId;
    private String title;
    private String content;
    private Integer type;
    private Integer status;
    private Date createTime;
    private Integer commentCount;
    private Double Score;
}
