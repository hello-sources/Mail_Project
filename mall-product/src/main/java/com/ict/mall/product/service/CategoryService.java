package com.ict.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 12:06:01
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

