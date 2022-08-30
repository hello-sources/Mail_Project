package com.ict.mall.member.dao;

import com.ict.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ltw
 * @email ltw@gmail.com
 * @date 2022-08-30 15:20:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
