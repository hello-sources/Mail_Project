package com.ict.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:20:20
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

