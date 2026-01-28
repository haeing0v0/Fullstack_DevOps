package org.cloud.order.main;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.cloud.order.dao.OrdersDAO;
import org.cloud.order.dto.OrdersDTO;

public class OrdersSearchRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		OrdersDAO dao = new OrdersDAO();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("===========주문 정보 검색===========");
		System.out.println("1 주문번호검색  | 2 주문날짜검색"  );
		System.out.println("=================================");
		System.out.print("선택> ");
		
		int menuNum = Integer.parseInt(sc.nextLine());
		OrdersDTO dto = new OrdersDTO();
		
		if (menuNum == 1) {
			System.out.print("검색할 주문번호 입력 :");
			dto.setOrder_num(Integer.parseInt(sc.nextLine()));
		} else if (menuNum == 2) {
			System.out.print("검색할 주문날짜 입력 :");
			String input = sc.nextLine();
			LocalDateTime ldt = LocalDateTime.parse(input, formatter);
			dto.setOrder_date(ldt);
		} else {
			System.out.println("메뉴에 있는 번호만 입력하세요.");
		}
		
		List<OrdersDTO> searchList = dao.search(dto);
		System.out.println("[검색한 상세 정보]");
		
		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (OrdersDTO ordersDto : searchList) {
				System.out.print(ordersDto.getOrder_num() + "\t");
				System.out.print(ordersDto.getOrder_date() + "\t");
				System.out.println();
			}
		}
	}

}
