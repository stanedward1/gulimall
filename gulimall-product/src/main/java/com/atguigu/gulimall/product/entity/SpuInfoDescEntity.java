package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 * 
 * @author longbiu
 * @email longbiu@foxmail.com
 * @date 2021-09-20 20:40:18
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long spuId;
	/**
	 * 商品介绍
	 */
	private String decript;

}
