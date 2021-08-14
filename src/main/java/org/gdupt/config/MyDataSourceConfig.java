package org.gdupt.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author czy
 * @create 2021-08-09 11:52
 */
@Deprecated//过时标志
@Configuration
public class MyDataSourceConfig {

    //@ConfigurationProperties("spring.datasource")
    //@Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        //启动监控页功能
        dataSource.setFilters("stat");
        return dataSource;
    }

    /**
     * 数据库监控页
     *
     * @return
     */
    //@Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        return registrationBean;
    }

    /**
     * web应用监控
     *
     * @return
     */
    //@Bean
    public FilterRegistrationBean webRegistrationBean() {

        WebStatFilter webStatFilter = new WebStatFilter();

        FilterRegistrationBean<WebStatFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        //这些不会进行监控
        filterFilterRegistrationBean.addInitParameter("exclusions", "*.js.*.gif,*.png,*.jpg,/druid?*");
        return filterFilterRegistrationBean;
    }
}
