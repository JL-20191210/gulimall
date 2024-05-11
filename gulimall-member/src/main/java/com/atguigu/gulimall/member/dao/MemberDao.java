package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author felix
 * @email hujinlong18212@gmail.com
 * @date 2024-05-12 00:21:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}