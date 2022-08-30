package com.ict.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 12:06:01
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

