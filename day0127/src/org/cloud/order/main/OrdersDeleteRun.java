package org.cloud.order.main;

import org.cloud.order.dao.OrdersDAO;

public class OrdersDeleteRun {

    public static void main(String[] args) {

        OrdersDAO dao = new OrdersDAO();

        int result = dao.delete(20010);

        System.out.println("================주문 삭제=================");
        if (result > 0) {
            System.out.println("주문 삭제 성공!");
        } else {
            System.out.println("삭제할 주문이 없습니다.");
        }
        System.out.println("=========================================");
    }
}
