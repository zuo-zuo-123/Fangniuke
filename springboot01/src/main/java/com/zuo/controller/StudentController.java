package com.zuo.controller;

import com.zuo.service.StudentService;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Controller
@RequestMapping("/t2")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public String querydata(Integer id) {
        studentService.querydata(id);
        return "界面层实现";
    }

    /*测试Get方法利用@PathVariable*/
    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String testGet1(
            @PathVariable("id") Integer Studentid) {
        System.out.println(Studentid);
        return "测试Get方法" + Studentid;
    }

    /*测试Get请求，利用@RequestParam,?请求参数*/
    /*/students?current=1&limit=20*/
    @RequestMapping(path = "/students", method = RequestMethod.GET)
    @ResponseBody
    public String getStudents(
            @RequestParam(name = "current", required = false, defaultValue = "1") int current,
            @RequestParam(name = "limit", required = false, defaultValue = "40") int limit) {
        System.out.println(current);
        System.out.println(limit);
        return "测试Get方法";
    }

    /*测试Post方法*/
    @RequestMapping(path = "/student12", method = RequestMethod.POST)
    @ResponseBody
    public String saveStudnet(String name, int age) {
        System.out.println(name);
        System.out.println(age);
        return "SUCCESS";
    }

    /*S-B响应HTML页面*/
    @RequestMapping(path = "/school", method = RequestMethod.GET)
    public String testHtml(Model model) {
        model.addAttribute("name", "sas");
        model.addAttribute("age", "23");
        return "/demo/view";
    }

    /*s-B响应html数据*/
    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    public ModelAndView getTeacher() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "张三");
        mav.addObject("age", "30");
        mav.setViewName("/demo/view");
        return mav;
    }
    /*S-B响应JSON格式的数据*/

    @RequestMapping(path = "/emp", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getemp() {
        Map<String, Object> emp = new HashMap<>();
        emp.put("name", "Zhangsan");
        emp.put("age", "4666");
        emp.put("salary", "10k");
        return emp;
    }

    @RequestMapping(path = "/emps", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getemps() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "dsd");
        map.put("age", 252);
        map.put("salary", "9k");
        list.add(map);

        map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", 31);
        map.put("salary", "8k");
        list.add(map);
        return list;
    }
}
