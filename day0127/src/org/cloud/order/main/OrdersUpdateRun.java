package org.cloud.order.main;

import java.time.LocalDateTime;

import org.cloud.order.dao.OrdersDAO;
import org.cloud.order.dto.OrdersDTO;

public class OrdersUpdateRun {

    public static void main(String[] args) {

        OrdersDAO dao = new OrdersDAO();

        OrdersDTO dto = new OrdersDTO();    
        dto.setOrder_date(LocalDateTime.of(2004, 3, 28, 0, 0));    
        dto.setCust_id("1000000005");  
        dto.setOrder_num(20010);

        int result = dao.update(dto);

        System.out.println("================주문 수정=================");
        if (result > 0) {
            System.out.println("주문 수정 성공!");
        } else {
            System.out.println("수정할 주문이 없습니다.");
        }
        System.out.println("=========================================");
    }
}
