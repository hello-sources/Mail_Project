package com.ict.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:56:25
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

