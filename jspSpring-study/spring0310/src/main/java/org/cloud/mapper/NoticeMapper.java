package org.cloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.dto.NoticeDTO;

@Mapper
public interface NoticeMapper {

	List<NoticeDTO> noticeList() throws Exception;
	int insertNotice(NoticeDTO notice) throws Exception;
	NoticeDTO noticeDetail(int num) throws Exception;
	void updateHit(int id) throws Exception;
	int updateNotice(NoticeDTO notice) throws Exception;
	int deleteNotice(int id) throws Exception;
}
