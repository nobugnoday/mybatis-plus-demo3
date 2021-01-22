package com.atguigu.bs.mapper;

import com.atguigu.bs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 *  只要javabean 和数据库表名+字段类型字段名 完全匹配映射
 *  在BaseMapper后指定该类型的泛型它会自动生成单表的所有的CRUD
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
