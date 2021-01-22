package com.atguigu.bs.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private Integer price;
    @Version   // 表示当前字段为乐观锁版本号
    private Integer version;


}
