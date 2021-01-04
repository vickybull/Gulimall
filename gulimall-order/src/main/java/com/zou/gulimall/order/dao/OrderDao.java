package com.zou.gulimall.order.dao;

import com.zou.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zou
 * @email zouhuan@qq.com
 * @date 2021-01-04 21:00:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
