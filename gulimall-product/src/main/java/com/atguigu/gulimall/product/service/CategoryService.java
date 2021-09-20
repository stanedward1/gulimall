package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-20 20:40:19
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

