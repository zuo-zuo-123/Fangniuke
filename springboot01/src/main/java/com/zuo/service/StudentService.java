package com.zuo.service;

import com.zuo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public String querydata(Integer id){
         studentDao.querydata(id);
        return "业务逻辑层实现业务类";
    }
}
