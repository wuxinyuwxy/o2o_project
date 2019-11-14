package com.wxy.repository;

import com.wxy.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//商品类型
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    //获取类型
    @Override
    List<ProductCategory> findAll();
}
