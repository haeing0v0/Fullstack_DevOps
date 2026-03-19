package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.NoticeDTO;
import cloud.util.DBUtil;

public class NoticeDAO {

    public List<NoticeDTO> list() {
        List<NoticeDTO> list = new ArrayList<>();

        String sql = "SELECT id, title, content, writer, reg_date, hit " +
                     "FROM notice " +
                     "ORDER BY id DESC";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                NoticeDTO dto = new NoticeDTO();
                dto.setId(rs.getInt("id"));
                dto.setTitle(rs.getString("title"));
                dto.setContent(rs.getString("content"));
                dto.setWriter(rs.getString("writer"));
                dto.setRegDate(rs.getString("reg_date"));
                dto.setHit(rs.getInt("hit"));
                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public NoticeDTO detail(int id) {
        NoticeDTO dto = null;

        String sql = "SELECT id, title, content, writer, reg_date, hit " +
                     "FROM notice WHERE id=?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    dto = new NoticeDTO();
                    dto.setId(rs.getInt("id"));
                    dto.setTitle(rs.getString("title"));
                    dto.setContent(rs.getString("content"));
                    dto.setWriter(rs.getString("writer"));
                    dto.setRegDate(rs.getString("reg_date"));
                    dto.setHit(rs.getInt("hit"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

    public int write(String title, String content, String writer) {
        int result = 0;

        if (writer == null || writer.trim().isEmpty()) {
            writer = "Admin";
        }

        String sql = "INSERT INTO notice(title, content, writer) VALUES(?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setString(3, writer);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public int increaseHit(int id) {
        int result = 0;

        String sql = "UPDATE notice SET hit = hit + 1 WHERE id=?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public int update(int id, String title, String content) {
        int result = 0;

        String sql = "UPDATE notice SET title=?, content=? WHERE id=?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, id);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete(int id) {
        int result = 0;

        String sql = "DELETE FROM notice WHERE id=?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}