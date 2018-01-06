package cn.e3mall.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.manager.service.ItemService;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findItemById(Long itemId) {

		/*TbItemExample example = new TbItemExample();
		Criteria createCriteria = example.createCriteria();
		// 根据id查询
		createCriteria.andIdEqualTo(itemId);
		List<TbItem> itemList = itemMapper.selectByExample(example);
		TbItem item = null;
		if (itemList != null && itemList.size() > 0) {
			item = itemList.get(0);
		}*/
		TbItem item = itemMapper.selectByPrimaryKey(itemId);

		return item;
	}

}
