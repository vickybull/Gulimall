package com.zou.gulimall.member.dao;

import com.zou.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zou
 * @email zouhuan@qq.com
 * @date 2021-01-04 21:08:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
