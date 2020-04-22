package com.wxy.service;

import com.github.pagehelper.Page;
import com.wxy.entity.ProductInfo;
import com.wxy.vo.BuyeProductInfoVO;
import com.wxy.vo.ProductVO;

import java.util.List;

public interface ProductService {

    //查询数据类型+食物
    List<BuyeProductInfoVO> selectAllProducts();

}
