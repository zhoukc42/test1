package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OderService {

	Order getOrder(String orderId);
	
	void addOrder(Order order);
}
