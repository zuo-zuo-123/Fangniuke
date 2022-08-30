package com.zuo.dao;

import com.zuo.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public Student querydata(Integer id) {
        Student student = new Student(2, "王五", 25);
        return student;
    }
}
