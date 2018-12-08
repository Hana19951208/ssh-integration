package com.offcn.crm.dao;

import com.offcn.crm.bean.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hana
 * @create 2018/12/7-16:15
 */
@Repository
public class StudentDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Student> getlist(){
        Session session = sessionFactory.getCurrentSession();


        List<Student> list = session.createQuery("from Student").list();

        return list;
    }

    public void save(){
        Session session = sessionFactory.getCurrentSession();
        Student stu=new Student();
        stu.setAge(12);
        stu.setGender("男");
        stu.setName("lihao");
        session.save(stu);

    }
}
