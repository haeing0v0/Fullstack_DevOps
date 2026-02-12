package org.cloud.order.main;

import java.time.LocalDateTime;

import org.cloud.order.dao.OrdersDAO;
import org.cloud.order.dto.OrdersDTO;

public class OrdersInsertRun {

    public static void main(String[] args) {

        OrdersDAO dao = new OrdersDAO();

        OrdersDTO dto = new OrdersDTO();
        dto.setOrder_num(20010);              
        dto.setOrder_date(LocalDateTime.now());
        dto.setCust_id("1000000005");

        int result = dao.insert(dto);

        System.out.println("================주문 등록=================");
        if (result > 0) {
            System.out.println("주문 등록 성공!");
        } else {
            System.out.println("주문 등록 실패!");
        }
        System.out.println("=========================================");
    }
}
