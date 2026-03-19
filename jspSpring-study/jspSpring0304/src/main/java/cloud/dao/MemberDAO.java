package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.MemberDTO;
import cloud.util.DBUtil;

public class MemberDAO {

    public List<MemberDTO> list() {
        List<MemberDTO> list = new ArrayList<>();

        String sql = "SELECT user_id, user_pwd, user_name "
                   + "FROM member "
                   + "ORDER BY user_id ASC";

        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        ) {

            while (rs.next()) {
                MemberDTO dto = new MemberDTO();
                dto.setUserId(rs.getString("user_id"));
                dto.setUserPwd(rs.getString("user_pwd"));
                dto.setUserName(rs.getString("user_name"));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public int insert(MemberDTO dto) {

        int result = 0;

        String sql = "INSERT INTO member(user_id, user_pwd, user_name) "
                   + "VALUES (?, ?, ?)";

        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, dto.getUserId());
            pstmt.setString(2, dto.getUserPwd());
            pstmt.setString(3, dto.getUserName());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public MemberDTO login(String userId, String userPwd) {

        MemberDTO dto = null;

        String sql = "SELECT user_id, user_pwd, user_name "
                   + "FROM member "
                   + "WHERE user_id=? AND user_pwd=?";

        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, userId);
            pstmt.setString(2, userPwd);

            try (ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    dto = new MemberDTO();
                    dto.setUserId(rs.getString("user_id"));
                    dto.setUserPwd(rs.getString("user_pwd"));
                    dto.setUserName(rs.getString("user_name"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    public MemberDTO selectOne(String userId) {

        MemberDTO dto = null;

        String sql = "SELECT user_id, user_pwd, user_name "
                   + "FROM member "
                   + "WHERE user_id=?";

        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, userId);

            try (ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    dto = new MemberDTO();
                    dto.setUserId(rs.getString("user_id"));
                    dto.setUserPwd(rs.getString("user_pwd"));
                    dto.setUserName(rs.getString("user_name"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    public int delete(String userId) {

        int result = 0;

        String sql = "DELETE FROM member WHERE user_id=?";

        try (
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, userId);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}