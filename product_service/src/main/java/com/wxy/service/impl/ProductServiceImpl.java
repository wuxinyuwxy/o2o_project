package com.wxy.service.impl;

import com.wxy.entity.ProductCategory;
import com.wxy.entity.ProductInfo;
import com.wxy.repository.ProductCategoryRepository;
import com.wxy.repository.ProductInfoRepository;
import com.wxy.service.ProductService;
import com.wxy.util.DataTranferTool;
import com.wxy.vo.BuyeProductInfoVO;
import com.wxy.vo.FoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//业务层
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<BuyeProductInfoVO> selectAllProducts() {
        //创建集合存放数据
        List<BuyeProductInfoVO> buyeProductInfoVOS = new ArrayList<>();
        //获取数据data
        //获取商品类型
        List<ProductCategory> categoryList = productCategoryRepository.findAll();
        //获取商品
        List<ProductInfo> productInfos = productInfoRepository.findAll();

        //循环赋值
        categoryList.forEach(productCategory -> {
            List<FoodVO> foodVOS = new ArrayList<>();
            BuyeProductInfoVO buyeProductInfoVO = new BuyeProductInfoVO();
            //赋值
            buyeProductInfoVO.setName(productCategory.getCategoryName());
            buyeProductInfoVO.setType(productCategory.getCategoryId());
            productInfos.forEach(productInfo -> {
                if(productCategory.getCategoryId().intValue() == productInfo.getCategoryType().intValue() && productInfo.getProductStatus().intValue() == 0){
                    //进行使用工具类进行转变类型
                    FoodVO foodVO = DataTranferTool.transferProductInfo(productInfo);
                    foodVOS.add(foodVO);
                }
            });
            buyeProductInfoVO.setFoods(foodVOS);
            //添加到集合中
            buyeProductInfoVOS.add(buyeProductInfoVO);
        });

        return buyeProductInfoVOS;
    }
}
