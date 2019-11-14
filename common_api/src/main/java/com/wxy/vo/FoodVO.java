package com.wxy.vo;

import lombok.Data;

import java.math.BigDecimal;

//foods
@Data
public class FoodVO {
    private String id;
    private String name;
    private BigDecimal price;
    private String description;
    private String icon;
}

