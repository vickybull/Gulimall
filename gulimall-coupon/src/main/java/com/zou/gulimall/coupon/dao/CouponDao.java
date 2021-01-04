package com.zou.gulimall.coupon.dao;

import com.zou.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zou
 * @email zouhuan@qq.com
 * @date 2021-01-04 20:53:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
