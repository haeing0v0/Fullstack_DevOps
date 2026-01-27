package org.cloud.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.cloud.order.db.DBUtil;
import org.cloud.order.dto.OrdersDTO;

public class OrdersDAO {

	public List<OrdersDTO> select() {

        List<OrdersDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "SELECT * FROM orders";

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
            	OrdersDTO dto = new OrdersDTO();

                dto.setOrder_num(rs.getInt("order_num"));
                dto.setOrder_date(rs.getTimestamp("order_date").toLocalDateTime());
                dto.setCust_id(rs.getString("cust_id"));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, rs);
        }

        return list;
    }
	
	public int insert(OrdersDTO dto) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "INSERT INTO orders "
                + "(order_num, order_date, cust_id) "
                + "VALUES (?, ?, ?)";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, dto.getOrder_num());
            pstmt.setTimestamp(2, Timestamp.valueOf(dto.getOrder_date()));
            pstmt.setString(3, dto.getCust_id());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, null);
        }

        return result;
    }
	
	public int update(OrdersDTO dto) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "UPDATE orders SET "
                + "order_date=?, cust_id=? "
                + "WHERE order_num=?";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);

            pstmt.setTimestamp(1, Timestamp.valueOf(dto.getOrder_date()));
            pstmt.setString(2, dto.getCust_id());
            pstmt.setInt(3, dto.getOrder_num());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, null);
        }

        return result;
    }
	
	public int delete(int order_num) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "DELETE FROM orders WHERE order_num=?";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, order_num);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, null);
        }

        return result;
    }

	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
