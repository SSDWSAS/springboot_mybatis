package org.gdupt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods = false)
public class WebConfig /*implements WebMvcConfigurer*/ {

    //自定义一个参数如一下的方式才可以发送正确的请求
    //<form action="/user" method="post">
    //    <input name="_m" type="hidden" value="PUT"/>
    //    <input value="REST-PUT 提交" type="submit"/>
    //</form>
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        //设置访问的参数名
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }
}





