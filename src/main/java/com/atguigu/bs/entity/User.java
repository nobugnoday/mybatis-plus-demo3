package com.atguigu.bs.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor  // 无参
@AllArgsConstructor // 有参
public class User {
    @TableId(type = IdType.ASSIGN_ID)  //雪花算法
//    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;

    // 新增时  自动填充
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
    // 新增和更新时自动填充
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
}
