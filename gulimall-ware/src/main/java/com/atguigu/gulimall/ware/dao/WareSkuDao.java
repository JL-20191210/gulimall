package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author felix
 * @email hujinlong18212@gmail.com
 * @date 2024-05-12 00:22:44
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
