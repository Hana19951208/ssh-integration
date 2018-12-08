package com.offcn.crm.controller;

import com.offcn.crm.bean.Student;
import com.offcn.crm.service.StudentService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Hana
 * @create 2018/12/7-16:11
 */
@Controller
@Scope(value="prototype")
public class StudentAction {

    @Autowired
    private StudentService studentService;
    public String list(){
        List<Student> list=studentService.getList();
        ServletActionContext.getRequest().setAttribute("list",list);
        return "list";
    }
}
