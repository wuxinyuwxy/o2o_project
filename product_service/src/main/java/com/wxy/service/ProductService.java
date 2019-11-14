package com.wxy.service;

import com.wxy.vo.BuyeProductInfoVO;

import java.util.List;

public interface ProductService {

    //查询数据类型+食物
    List<BuyeProductInfoVO> selectAllProducts();
}
