package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-25 22:37:08
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
