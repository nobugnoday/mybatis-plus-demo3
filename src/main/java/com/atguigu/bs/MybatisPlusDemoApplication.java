package com.atguigu.bs;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 @SpringBootConfiguration   配置类
 @EnableAutoConfiguration  开启自动配置
 @ComponentScan             配置包扫描
 */

// 自动配置 ：
@SpringBootApplication  // 启动springboot
// mapperscan 只能扫描mapper接口创建实现类对象
@MapperScan(basePackages = {"com.atguigu.bs.mapper"})
public class MybatisPlusDemoApplication {

    /**
     *  数据库表 entity
     *  页面显示的数据 ： vo view object
     *  两个微服务之间的传递的数据 dto data transfer object
     *  请求提交的数据 ： formObject
     * @param args
     */
    public static void main(String[] args) {



        SpringApplication.run(MybatisPlusDemoApplication.class, args);
    }


    // OptimisticLockerInterceptor :mybatis 的拦截器

    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
    return new OptimisticLockerInterceptor();
    }
}
