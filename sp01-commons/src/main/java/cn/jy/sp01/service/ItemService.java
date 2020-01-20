package cn.jy.sp01.service;

import java.util.List;

import cn.jy.sp01.pojo.Item;

public interface ItemService {
	//根据id查询商品
	List<Item> getItems(String orderId);
	//删除选定商品列表
	void decreaseNumbers(List<Item> list);
}
