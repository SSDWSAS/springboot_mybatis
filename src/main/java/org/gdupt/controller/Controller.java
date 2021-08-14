package org.gdupt.controller;

import org.gdupt.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

/**
 * @author czy
 * @create 2021-05-17 13:35
 */
//@ResponseBody
//@Controller//
@RestController//这个注解是上面几个注解的合体
public class Controller {

    @Autowired
    Person person;

    @RequestMapping("/hello")
    public Person person() {
        return person;
    }

    @Autowired
    DataSource dataSource;

    //Rest风格
    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    @GetMapping("/user")
    public String getUser() {
        return "GET-张三";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String saveUser() {
        return "POST-张三";
    }


    //    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")//上面等同于这一句
    public String putUser() {
        return "PUT-张三";
    }

    //    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    @DeleteMapping("/user")//上面等同于这一句,可以使用postman进行测试
    public String deleteUser() {
        return "DELETE-张三";
    }


    @GetMapping("/uuu")
    public String username(@RequestParam("username") String name) {
        System.out.println(dataSource + "数据源");
        System.out.println("打印获取到的username" + name);
        return "打印获取到的username" + name;
    }

    @GetMapping("/select")
    public String selectAll() {

        return "......";
    }


    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDB() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from tb_pet", Long.class);
        return aLong.toString();

    }

}
