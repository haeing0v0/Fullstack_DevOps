package org.cloud.order.main;

import java.util.List;

import org.cloud.order.dao.OrdersDAO;
import org.cloud.order.dto.OrdersDTO;

public class OrdersSelectRun {
	public static void main(String[] args) {
		
		OrdersDAO dao = new OrdersDAO();
		List<OrdersDTO> list = dao.select();
		
		System.out.println("================주문 목록 조회=================");
		if (list.isEmpty()) {
			System.out.println("조회할 데이터가 없습니다.");
		} else {
			System.out.println("주문번호:\t 주문날짜:\t 고객아이디:\t");
			for (OrdersDTO ordersDTO : list) {
				
				System.out.println(ordersDTO.getOrder_num() + "\t" + ordersDTO.getOrder_date() + "\t" + ordersDTO.getCust_id() + "\t");
			}
		}
		System.out.println("============================================");
	}
}