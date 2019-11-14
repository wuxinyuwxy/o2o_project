package com.wxy.controller;

import com.wxy.service.ProductService;
import com.wxy.vo.BuyeProductInfoVO;
import com.wxy.vo.CodeMsg;
import com.wxy.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;

    @CrossOrigin
    @GetMapping("list")
    public ResponseVO<List<BuyeProductInfoVO>> selectBuyerFoods(){
        //查询数据  类型
        List<BuyeProductInfoVO> buyeProductInfoVOS = productService.selectAllProducts();
        if(buyeProductInfoVOS!=null && buyeProductInfoVOS.size()>0){
            //成功获取到数据
            return ResponseVO.success(buyeProductInfoVOS);
        }
        return ResponseVO.erro(CodeMsg.PRODUCT_NOT_EXIST);
    }
}
