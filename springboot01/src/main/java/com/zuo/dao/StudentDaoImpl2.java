package com.zuo.dao;

import com.zuo.entity.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Repository
@Primary
public class StudentDaoImpl2 implements StudentDao {
    @Override
    public Student querydata(Integer id) {
        Student s3 = new Student(3, "赵柳", 25);
        return s3;
    }
}
