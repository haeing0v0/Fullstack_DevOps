package org.cloud.service;

import java.util.List;

import org.cloud.dto.NoticeDTO;

public interface NoticeService {

	List<NoticeDTO> noticeList() throws Exception;
	int insertNotice(NoticeDTO notice) throws Exception;
	NoticeDTO noticeDetail(int num) throws Exception;
	void updateHit(int id) throws Exception;
	int updateNotice(NoticeDTO notice) throws Exception;
	int deleteNotice(int id) throws Exception;
}
