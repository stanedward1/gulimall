package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-20 20:40:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
