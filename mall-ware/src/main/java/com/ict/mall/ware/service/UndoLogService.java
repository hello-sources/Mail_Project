package com.ict.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ict.common.utils.PageUtils;
import com.ict.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:56:25
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

