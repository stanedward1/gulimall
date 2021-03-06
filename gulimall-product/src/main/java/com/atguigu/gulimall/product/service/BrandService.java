package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.Map;

/**
 * 品牌
 *
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-20 20:40:18
 */
@Service
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

