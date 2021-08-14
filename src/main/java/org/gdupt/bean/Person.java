package org.gdupt.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@ToString
@Data//这个注解默认已经带有@ToString注解
@Component//注册到容器中
@ConfigurationProperties(prefix = "person")//需要和配置文件绑定.否则会显示对象中属性值全为null
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
}