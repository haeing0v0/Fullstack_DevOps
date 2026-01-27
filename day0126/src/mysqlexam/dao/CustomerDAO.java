package mysqlexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import mysqlexam.dto.CustomerDTO;

public class CustomerDAO {

    /* =======================
     * SELECT (전체 조회)
     * ======================= */
    public List<CustomerDTO> select() {

        List<CustomerDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "SELECT * FROM customers";

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                CustomerDTO dto = new CustomerDTO();

                dto.setCustId(rs.getString("cust_id"));
                dto.setCustName(rs.getString("cust_name"));
                dto.setCustAddress(rs.getString("cust_address"));
                dto.setCustCity(rs.getString("cust_city"));
                dto.setCustState(rs.getString("cust_state"));
                dto.setCustZip(rs.getString("cust_zip"));
                dto.setCustCountry(rs.getString("cust_country"));
                dto.setCustContact(rs.getString("cust_contact"));
                dto.setCustEmail(rs.getString("cust_email"));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, rs);
        }

        return list;
    }

    public int insert(CustomerDTO dto) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "INSERT INTO customers "
                + "(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country, cust_contact, cust_email) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, dto.getCustId());
            pstmt.setString(2, dto.getCustName());
            pstmt.setString(3, dto.getCustAddress());
            pstmt.setString(4, dto.getCustCity());
            pstmt.setString(5, dto.getCustState());
            pstmt.setString(6, dto.getCustZip());
            pstmt.setString(7, dto.getCustCountry());
            pstmt.setString(8, dto.getCustContact());
            pstmt.setString(9, dto.getCustEmail());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, null);
        }

        return result;
    }

    public int update(CustomerDTO dto) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "UPDATE customers SET "
                + "cust_name=?, cust_address=?, cust_city=?, cust_state=?, "
                + "cust_zip=?, cust_country=?, cust_contact=?, cust_email=? "
                + "WHERE cust_id=?";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, dto.getCustName());
            pstmt.setString(2, dto.getCustAddress());
            pstmt.setString(3, dto.getCustCity());
            pstmt.setString(4, dto.getCustState());
            pstmt.setString(5, dto.getCustZip());
            pstmt.setString(6, dto.getCustCountry());
            pstmt.setString(7, dto.getCustContact());
            pstmt.setString(8, dto.getCustEmail());
            pstmt.setString(9, dto.getCustId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, pstmt, null);
        }

        return result;
    }

    public int delete(String custId) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        String query = "DELETE FROM customers WHERE cust_id=?";

        int result = 0;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, custId);

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
