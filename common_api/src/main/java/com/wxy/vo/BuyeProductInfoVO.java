package com.wxy.vo;

import lombok.Data;

import java.util.List;

@Data
public class BuyeProductInfoVO {

    private String name;
    private Integer type;
    protected List<FoodVO> foods;
}
