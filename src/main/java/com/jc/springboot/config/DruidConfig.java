//package com.jc.springboot.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
///*
// * 注释掉。和DruidDataSourceConfig合并
// * @Copyright: 2020JCSoft
// * @author: Zjf
// * @since: 2020/1/31 10:58
// * @Version 1.0
// */
//public class DruidConfig {
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druid() {
//        return new DruidDataSource();
//    }
//
//    //配置Druid的监控
//    //1、配置一个管理后台的Servlet
//    @Bean
//    public ServletRegistrationBean statViewServlet() {
//        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),
//                "/druid/*");
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("loginUsername", "admin");
//        initParams.put("loginPassword", "123456");
//        initParams.put("allow", "");//默认就是允许所有访问
//        initParams.put("deny", "192.168.15.21");//拒绝ip访问
//        bean.setInitParameters(initParams);
//        return bean;
//    }
//
//    //2、配置一个web监控的filter
//    @Bean
//    public FilterRegistrationBean webStatFilter() {
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.setFilter(new WebStatFilter());
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("exclusions", "*.js,*.css,/druid/*");//不拦截的请求
//        bean.setInitParameters(initParams);
//        bean.setUrlPatterns(Arrays.asList("/*"));//拦截的请求
//        return bean;
//    }
//}
