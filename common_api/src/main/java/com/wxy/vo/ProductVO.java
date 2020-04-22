package com.wxy.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductVO {
    //进行模糊查询
    private String productName;//商品名称
    private BigDecimal minPrice;//商品最低价格
    private BigDecimal maxPrice;//商品最高价格
    private Integer productType;//商品类型
    private String fieldName;//字段名称
    private Date startDate;//开始日期
    private Date endDate;//结束日期

    //分页
    private Integer pageNum;//第几页
    private Integer pageSize;//每页所展示的数据


}
