package com.wxy.repository;

import com.wxy.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    //获取所有
    @Override
    List<ProductInfo> findAll();

    //获取数据类型根据id
    List<ProductInfo> findByCategoryTypeAaAndAndProductStatus(Integer typeId , Integer status);

}
