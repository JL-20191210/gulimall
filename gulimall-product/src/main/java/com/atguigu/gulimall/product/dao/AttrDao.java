package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author HJL
 * @email hujinlong18212@gmail.com
 * @date 2023-02-13 23:00:37
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
