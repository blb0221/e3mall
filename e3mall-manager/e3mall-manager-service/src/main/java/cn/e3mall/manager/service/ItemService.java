package cn.e3mall.manager.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {

	//根据商品id查询商品信息
	public TbItem findItemById(Long itemId);
}
