package cn.jy.sp01.service;

import cn.jy.sp01.pojo.Order;

public interface OrderService {
	//根据id查询订单
	Order getOrder(String orderId);
	//负责添加订单
	void addOrder(Order order);
}
