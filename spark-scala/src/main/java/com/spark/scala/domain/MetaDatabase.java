package com.spark.scala.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  22:36
 * @Description：数据库元数据
 */
@Entity
@Table
public class MetaDatabase {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Integer id;
    /**数据名称*/
    @Getter
    @Setter
    private String name;
    /**数据库存放的文件系统位置*/
    @Setter
    @Getter
    private String location;
}
