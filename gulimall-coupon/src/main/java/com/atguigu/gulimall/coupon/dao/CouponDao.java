package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author felix
 * @email hujinlong18212@gmail.com
 * @date 2024-05-11 21:25:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
