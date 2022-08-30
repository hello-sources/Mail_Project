package com.ict.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:29:08
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

