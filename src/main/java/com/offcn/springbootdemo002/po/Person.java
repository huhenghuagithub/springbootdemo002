package com.offcn.springbootdemo002.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity  //声明类是一张表
@Table(name = "tb_person")  //声明表的名称
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id  //主键
    @GeneratedValue  //自增
    private Long id;

    @Column(name = "name",nullable = false,length = 100) //列的参数 name 列的名字、nullable 是否允许为空  length 长度
    private String name;


    private Integer age;
}
