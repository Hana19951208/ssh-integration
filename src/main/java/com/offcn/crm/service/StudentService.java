package com.offcn.crm.service;

import com.offcn.crm.bean.Student;
import com.offcn.crm.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hana
 * @create 2018/12/7-16:06
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> getList() {
       return  studentDao.getlist();
    }
}
