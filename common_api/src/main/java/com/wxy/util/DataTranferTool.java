package com.wxy.util;

import com.wxy.entity.ProductInfo;
import com.wxy.vo.FoodVO;

public class DataTranferTool {

    public static FoodVO transferProductInfo(ProductInfo productInfo){
        FoodVO foodVO = new FoodVO();
        foodVO.setId(productInfo.getProductId());
        foodVO.setName(productInfo.getProductName());
        foodVO.setPrice(productInfo.getProductPrice());
        foodVO.setDescription(productInfo.getProductDescription());
        foodVO.setIcon(productInfo.getProductIcon());
        return foodVO;
    }
}
