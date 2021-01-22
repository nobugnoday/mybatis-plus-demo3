package com.atguigu.bs;

import com.atguigu.bs.entity.Product;
import com.atguigu.bs.entity.User;
import com.atguigu.bs.mapper.ProductMapper;
import com.atguigu.bs.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    UserMapper userMapper;


    @Autowired
    ProductMapper productMapper;
    // 1 查询

    @Test
     void selectAll(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    //2 指定条件
    // 3 分页
    // 4 带条件分页
    // 5  更新

    @Test
    public void updateUse(){
        User user = userMapper.selectById(3);
        user.setName("奥利给骚年");
        int i = userMapper.updateById(user);
        System.out.println(i > 0 ? "成功" : "失败");


    }

    // 6 新增
    @Test
    void addUser(){
        User user = new User();
        user.setName("渣渣辉6");
        user.setAge(18);
        user.setEmail("zzh@qq.com");

        int i = userMapper.insert(user);
        System.out.println(i > 0 ? "新增成功" : "新增失败");
    }


    // 乐观锁
    @Test
    public void testLeguan(){
        // 解决方案 ： 共享数据更新时，如果多个请求获取数据版本不一致， 只能有一个可以修改
        // A和B同时读取
        Product aProduct = productMapper.selectById(1);
        Product bProduct = productMapper.selectById(1);
        // A先更新 涨价50
        aProduct.setPrice(aProduct.getPrice() + 50);
        productMapper.updateById(aProduct);
        // B再更新  降价30
        bProduct.setPrice(bProduct.getPrice() - 30);
        productMapper.updateById(bProduct);

        // 查询跟新后完毕后的结果
        System.out.println("价格=" + productMapper.selectById(1));
    }


    // 8删除



    @Test
    void contextLoads() {
    }

}
