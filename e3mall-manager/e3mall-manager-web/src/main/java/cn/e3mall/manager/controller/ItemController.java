package cn.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.manager.service.ItemService;
import cn.e3mall.pojo.TbItem;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	/*
	 * 根据商品id查询商品信息
	 */
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		//调用service
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
}
