package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-25 22:02:40
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

