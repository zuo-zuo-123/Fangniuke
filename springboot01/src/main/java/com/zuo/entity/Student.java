package com.zuo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Data //表示提供实体类的get set equals hashcode toString方法等
@AllArgsConstructor //有参
@NoArgsConstructor
public class Student {
    @Value("1")
    private Integer id;
    @Value("张三")
    private String name;
    @Value("120")
    private Integer age;

}
