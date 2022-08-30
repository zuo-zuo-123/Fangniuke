package com.zuo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author zuozuo
 * @Date 2022 08 28
 * @Description:
 */
/*利用lombok插架生成setter getter toString hashCode 有参无参方法*/
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private Integer type;
    private Integer status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
