package com.wxy.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
//商品类型
public class ProductCategory {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    /** 类目名字 **/
    private Integer categoryType;

    //类目编号
    private Date createTime;
    private Date updateTime;

}
