package com.atguigu.bs.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    // 新增时 自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        // 给新增的对象自动填充 gmtCreate 和 gmtModified s属性
        metaObject.setValue("gmtCreate",new Date());
        metaObject.setValue("gmtModified",new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 给更新的对象自动填充 gmtModified 属性
        metaObject.setValue("gmtModified",new Date());

    }
}
