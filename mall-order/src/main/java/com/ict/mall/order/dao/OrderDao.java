package com.ict.mall.order.dao;

import com.ict.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:29:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
