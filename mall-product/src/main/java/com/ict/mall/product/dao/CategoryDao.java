package com.ict.mall.product.dao;

import com.ict.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 12:06:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
