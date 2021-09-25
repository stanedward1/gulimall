package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UmsMemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-25 22:02:40
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

